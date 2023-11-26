package com.changellenge.hackaton.sber.changellengesber.repo;

import com.changellenge.hackaton.sber.changellengesber.model.dto.ClientDTO;
import com.changellenge.hackaton.sber.changellengesber.model.entity.EPEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EPRepository extends JpaRepository<EPEntity, Long> {
    public Optional<EPEntity> findByClient(ClientDTO client);
}
