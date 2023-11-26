package com.changellenge.hackaton.sber.changellengesber.service.impl;

import com.changellenge.hackaton.sber.changellengesber.model.dto.ClientDTO;
import com.changellenge.hackaton.sber.changellengesber.model.entity.EPEntity;
import com.changellenge.hackaton.sber.changellengesber.repo.EPRepository;
import com.changellenge.hackaton.sber.changellengesber.service.CheckService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Qualifier("defaultEPService")
@Primary
public class EPService implements CheckService {
    private EPRepository epRepository;
    public EPService(EPRepository epRepository1)
    {
        epRepository = epRepository1;
    }
    @Override
    public boolean checkClient(ClientDTO client) {
        Optional<EPEntity> clientEntity = epRepository.findByClient(client);
        return clientEntity.map(EPEntity::isChecked).orElse(false);
    }
}
