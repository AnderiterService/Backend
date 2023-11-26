package com.changellenge.hackaton.sber.changellengesber.repo;

import com.changellenge.hackaton.sber.changellengesber.model.entity.Client;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {
    @Query(value = """
            SELECT * FROM requests WHERE uid in (SELECT request_uid FROM client_requests WHERE client_id =:client_id) 
            """, nativeQuery = true)
    List<Request> findByClientId(@Param("client_id") Long id);

}
