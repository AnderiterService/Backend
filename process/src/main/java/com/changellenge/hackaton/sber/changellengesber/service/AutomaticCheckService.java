package com.changellenge.hackaton.sber.changellengesber.service;

import com.changellenge.hackaton.sber.changellengesber.model.dto.ClientDTO;

import java.util.Map;

public interface AutomaticCheckService {
    public enum ServiceNameEnum
    {
        MVD,
        EP,
        BANKRUPT
    }
    public Map<ServiceNameEnum, Boolean> checkClient(ClientDTO client);
}
