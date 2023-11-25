package com.changellenge.hackaton.sber.changellengesber.service;

import jakarta.security.auth.message.AuthException;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface RequestService {
    List<RequestDto> getRequests() throws ChangeSetPersister.NotFoundException, AuthException;

}
