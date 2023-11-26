package com.changellenge.hackaton.sber.changellengesber.repo;

import com.changellenge.hackaton.sber.changellengesber.model.entity.Client;
import com.changellenge.hackaton.sber.changellengesber.model.entity.ClientRequest;
import com.changellenge.hackaton.sber.changellengesber.model.entity.LoanInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface LoanInformationRepository extends CrudRepository<LoanInformation, Long> {
    List<LoanInformation> findByClient(Client client);
}
