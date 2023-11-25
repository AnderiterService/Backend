package com.changellenge.hackaton.sber.changellengesber.repo;

import com.changellenge.hackaton.sber.changellengesber.model.entity.Bki;
import com.changellenge.hackaton.sber.changellengesber.model.entity.ClientRequest;
import org.springframework.data.repository.CrudRepository;


public interface ClientRequestRepository  extends CrudRepository<ClientRequest, Long> {
}
