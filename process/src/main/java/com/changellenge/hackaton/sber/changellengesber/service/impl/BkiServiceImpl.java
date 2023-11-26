package com.changellenge.hackaton.sber.changellengesber.service.impl;

import com.changellenge.hackaton.sber.changellengesber.model.dto.BkiDto;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Bki;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Request;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Status;
import com.changellenge.hackaton.sber.changellengesber.repo.BkiRepository;
import com.changellenge.hackaton.sber.changellengesber.service.BkiService;
import jakarta.security.auth.message.AuthException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

@Service
public class BkiServiceImpl  implements BkiService {
    private final ModelMapper mapper;


    private final BkiRepository bkiRepository;

    @Autowired
    public BkiServiceImpl(ModelMapper mapper, BkiRepository bkiRepository) {
        this.mapper = mapper;
        this.bkiRepository = bkiRepository;
    }


    @Override
    public BkiDto getBkiById(Long id) throws ChangeSetPersister.NotFoundException, AuthException {
        return mapper.map(bkiRepository.findById(id).orElseThrow(), BkiDto.class);
    }

    @Override
    public void sendToReload(Long id) throws ChangeSetPersister.NotFoundException, AuthException {
        Bki bki = bkiRepository.findById(id).orElseThrow();
        //todo отправка на дозапрос
    }

}
