package com.changellenge.hackaton.sber.changellengesber.repo;

import com.changellenge.hackaton.sber.changellengesber.model.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClientRepository  extends CrudRepository<Client, Long>  {
}
