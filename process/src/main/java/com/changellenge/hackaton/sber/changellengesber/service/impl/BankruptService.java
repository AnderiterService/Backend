package com.changellenge.hackaton.sber.changellengesber.service.impl;

import com.changellenge.hackaton.sber.changellengesber.model.dto.ClientDTO;
import com.changellenge.hackaton.sber.changellengesber.model.entity.BankruptEntity;
import com.changellenge.hackaton.sber.changellengesber.model.entity.EPEntity;
import com.changellenge.hackaton.sber.changellengesber.repo.BankruptRepository;
import com.changellenge.hackaton.sber.changellengesber.repo.EPRepository;
import com.changellenge.hackaton.sber.changellengesber.service.CheckService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Qualifier("defaultBankruptService")
@Primary
public class BankruptService implements CheckService {
    private BankruptRepository bankruptRepository;
    public BankruptService(BankruptRepository bankruptRepository1)
    {
        bankruptRepository = bankruptRepository1;
    }
    @Override
    public boolean checkClient(ClientDTO client) {
        Optional<BankruptEntity> clientEntity = bankruptRepository.findByClient(client);
        return clientEntity.map(BankruptEntity::isChecked).orElse(false);
    }
}
