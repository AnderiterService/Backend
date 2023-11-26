package com.changellenge.hackaton.sber.changellengesber.service;

import com.changellenge.hackaton.sber.changellengesber.model.dto.ClientDto;
import com.changellenge.hackaton.sber.changellengesber.model.dto.PersonalDocumentDto;
import com.changellenge.hackaton.sber.changellengesber.model.exceptions.NotFoundException;
import jakarta.security.auth.message.AuthException;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface ClientService {
    ClientDto getClientById(Long id) throws ChangeSetPersister.NotFoundException, AuthException, NotFoundException;

    void sendToReload(Long id);
}
