package com.changellenge.hackaton.sber.changellengesber.utils;


import com.changellenge.hackaton.sber.changellengesber.model.entity.*;
import com.changellenge.hackaton.sber.changellengesber.model.exceptions.NotFoundException;
import com.changellenge.hackaton.sber.changellengesber.repo.*;

public class FindUtils {
    private FindUtils() {
    }

    public static Client findClient(ClientRepository repository, Long clientId) throws NotFoundException {
        return repository.findById(clientId).orElseThrow(
                () -> new NotFoundException("Couldn't find Client with id: " + clientId));
    }



}
