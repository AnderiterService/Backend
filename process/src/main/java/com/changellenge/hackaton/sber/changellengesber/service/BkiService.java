package com.changellenge.hackaton.sber.changellengesber.service;

import com.changellenge.hackaton.sber.changellengesber.model.dto.BkiDto;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Bki;
import jakarta.security.auth.message.AuthException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface BkiService {
    BkiDto getBkiById(Long id) throws ChangeSetPersister.NotFoundException, AuthException;
}
