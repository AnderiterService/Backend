package com.changellenge.hackaton.sber.changellengesber.service.impl;

import com.changellenge.hackaton.sber.changellengesber.model.dto.RequestDto;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Request;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Status;
import com.changellenge.hackaton.sber.changellengesber.repo.RequestRepository;
import com.changellenge.hackaton.sber.changellengesber.repo.StatusRepository;
import com.changellenge.hackaton.sber.changellengesber.service.RequestService;
import jakarta.security.auth.message.AuthException;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {
    private final RequestRepository requestRepository;
    private ModelMapper mapper;
    private StatusRepository statusRepository;

    @Autowired
    public RequestServiceImpl(RequestRepository requestRepository, ModelMapper mapper, StatusRepository statusRepository) {
        this.requestRepository = requestRepository;
        this.mapper = mapper;
        this.statusRepository = statusRepository;
    }

    @Override
    public List<RequestDto> getRequests() throws ChangeSetPersister.NotFoundException, AuthException {
        List<Request> requests = (List<Request>) requestRepository.findAll();
        List<RequestDto> requestDtos = requests.stream().map(request -> mapper.map(request, RequestDto.class)).toList();
        return requestDtos;
    }

    @Override
    public RequestDto getRequestById(Long id) throws ChangeSetPersister.NotFoundException, AuthException {
        return mapper.map(requestRepository.findById(id).orElseThrow(), RequestDto.class);
    }

    @Override
    @Transactional

    public void sendToReload(Long id) {
        Request request = requestRepository.findById(id).orElseThrow();
        Status status = statusRepository.findById(3L).orElseThrow(); // дозапрос
        request.setStatusId(status);
        requestRepository.save(request);
    }
}
