package com.changellenge.hackaton.sber.changellengesber.service;

import com.changellenge.hackaton.sber.changellengesber.model.dto.PersonalDocumentDto;
import jakarta.security.auth.message.AuthException;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface ClientService {
    PersonalDocumentDto getClientById(Long id) throws ChangeSetPersister.NotFoundException, AuthException;
}
