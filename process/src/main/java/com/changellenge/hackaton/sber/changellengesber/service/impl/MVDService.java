package com.changellenge.hackaton.sber.changellengesber.service.impl;

import com.changellenge.hackaton.sber.changellengesber.model.dto.ClientDTO;
import com.changellenge.hackaton.sber.changellengesber.model.entity.MVDEntity;
import com.changellenge.hackaton.sber.changellengesber.repo.MVDRepository;
import com.changellenge.hackaton.sber.changellengesber.service.CheckService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Qualifier("defaultMVDService")
@Primary
public class MVDService implements CheckService {
    private MVDRepository mvdRepository;
    public MVDService(MVDRepository mvdRepository1)
    {
        mvdRepository = mvdRepository1;
    }
    @Override
    public boolean checkClient(ClientDTO client) {
        Optional<MVDEntity> clientEntity = mvdRepository.findByClient(client);
        return clientEntity.map(MVDEntity::isChecked).orElse(false);
    }
}
