package com.changellenge.hackaton.sber.changellengesber.service.impl;

import com.changellenge.hackaton.sber.changellengesber.model.dto.PersonalDocumentDto;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Client;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Request;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Status;
import com.changellenge.hackaton.sber.changellengesber.model.exceptions.NotFoundException;
import com.changellenge.hackaton.sber.changellengesber.repo.ClientRepository;
import com.changellenge.hackaton.sber.changellengesber.repo.RequestRepository;
import com.changellenge.hackaton.sber.changellengesber.repo.StatusRepository;
import com.changellenge.hackaton.sber.changellengesber.service.ClientService;
import com.changellenge.hackaton.sber.changellengesber.utils.FindUtils;
import jakarta.security.auth.message.AuthException;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private ModelMapper mapper;
    private RequestRepository requestRepository;
    private StatusRepository statusRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository, ModelMapper mapper, RequestRepository requestRepository, StatusRepository statusRepository) {
        this.clientRepository = clientRepository;
        this.mapper = mapper;
        this.requestRepository = requestRepository;
        this.statusRepository = statusRepository;
    }

    @Override
    public PersonalDocumentDto getClientById(Long id) throws ChangeSetPersister.NotFoundException, AuthException, NotFoundException {
        return mapper.map(FindUtils.findClient(clientRepository, id), PersonalDocumentDto.class);
    }

    @Override
    @Transactional

    public void sendToReload(Long id) {
        List<Request> requests = requestRepository.findByClientId(id);
        Status status = statusRepository.findById(3L).orElseThrow(); // дозапрос
        for (int i =0; i < requests.size(); ++i) {
            requests.get(i).setStatusId(status);
            requestRepository.save(requests.get(i));
        }
    }
}
