package com.changellenge.hackaton.sber.changellengesber.repo;

import com.changellenge.hackaton.sber.changellengesber.model.dto.ClientDTO;
import com.changellenge.hackaton.sber.changellengesber.model.entity.BankruptEntity;
import com.changellenge.hackaton.sber.changellengesber.model.entity.MVDEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankruptRepository extends JpaRepository<BankruptEntity, Long>
{
    public Optional<BankruptEntity> findByClient(ClientDTO client);
}