package com.changellenge.hackaton.sber.changellengesber.service;

import com.changellenge.hackaton.sber.changellengesber.model.dto.ClientDTO;

public interface CheckService
{
    public boolean checkClient(ClientDTO client);
}