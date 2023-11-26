package com.changellenge.hackaton.sber.changellengesber.repo;

import com.changellenge.hackaton.sber.changellengesber.model.entity.ClientRequest;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Status;
import org.springframework.data.repository.CrudRepository;

public interface StatusRepository extends CrudRepository<Status, Long> {
}
