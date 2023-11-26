package com.changellenge.hackaton.sber.changellengesber.repo;

import com.changellenge.hackaton.sber.changellengesber.model.entity.Client;
import com.changellenge.hackaton.sber.changellengesber.model.entity.ClientRequest;
import com.changellenge.hackaton.sber.changellengesber.model.entity.LoanInformation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoanInformationRepository extends CrudRepository<LoanInformation, Long> {
    List<LoanInformation> findByClient(Client client);
}
