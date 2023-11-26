package com.changellenge.hackaton.sber.changellengesber.controllers;


import jakarta.persistence.TransactionRequiredException;
import org.apache.coyote.BadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.InvalidMediaTypeException;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.changellenge.hackaton.sber.changellengesber.model.dto.Error;
import com.changellenge.hackaton.sber.changellengesber.model.exceptions.*;

import java.util.NoSuchElementException;

//import jakarta.validation.ConstraintViolationException;


@RestControllerAdvice
@CrossOrigin(maxAge = 1440)
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(RestExceptionHandler.class);

    @NonNull
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status,
                                                                  WebRequest request) {
        return new ResponseEntity<>(new Error().code(400).message("Validation failed, argument not valid"), HttpStatus.BAD_REQUEST);
    }

    @NonNull
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
                                                                  HttpHeaders headers, HttpStatus status,
                                                                  WebRequest request) {
        return new ResponseEntity<>(new Error().code(400).message("Validation failed, http message not readable"), HttpStatus.BAD_REQUEST);
    }

    @NonNull
    protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
                                                        HttpStatus status, WebRequest request) {
        return new ResponseEntity<>(new Error().code(400).message("Validation failed, type mismatch"), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({ChangeSetPersister.NotFoundException.class})
    protected ResponseEntity<Object> handleNotFound(Exception e) {
        return new ResponseEntity<>(new Error().code(404).message(e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({BadRequestException.class, InvalidMediaTypeException.class})
    protected ResponseEntity<Object> handleBadRequest(Exception e) {
        return new ResponseEntity<>(new Error().code(400).message(e.getMessage()), HttpStatus.BAD_REQUEST);
    }



    @ExceptionHandler({DataIntegrityViolationException.class})
    protected ResponseEntity<Object> handleDataIntegrityViolationException(DataIntegrityViolationException e) {
        String message = e.getMessage();
        return new ResponseEntity<>(new Error().code(400).message("Saving to db failed: " + message), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({TransactionRequiredException.class})
    protected ResponseEntity<Object> handleTransactionRequiredException(TransactionRequiredException e) {
        String message = e.getMessage();
        return new ResponseEntity<>(new Error().code(400).message("Deleting from db failed: " + message), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({NoSuchElementException.class})
    protected ResponseEntity<Object> handleNoSuchElementException(NoSuchElementException e) {
        String message = e.getMessage();
        return new ResponseEntity<>(new Error().code(400).message( message), HttpStatus.BAD_REQUEST);
    }


}