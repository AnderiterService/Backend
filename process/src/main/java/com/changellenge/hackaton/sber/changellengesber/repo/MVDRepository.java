package com.changellenge.hackaton.sber.changellengesber.repo;

import com.changellenge.hackaton.sber.changellengesber.model.dto.ClientDTO;
import com.changellenge.hackaton.sber.changellengesber.model.entity.MVDEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MVDRepository extends CrudRepository<MVDEntity, Long> {
    public Optional<MVDEntity> findByClient(ClientDTO client);
}
