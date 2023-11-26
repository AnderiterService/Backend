package com.changellenge.hackaton.sber.changellengesber.service;

import com.changellenge.hackaton.sber.changellengesber.model.dto.RequestDto;
import jakarta.security.auth.message.AuthException;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface RequestService {
    List<RequestDto> getRequests() throws ChangeSetPersister.NotFoundException, AuthException;
     RequestDto getRequestById(Long id) throws ChangeSetPersister.NotFoundException, AuthException;


    void sendToReload(Long id);
}
