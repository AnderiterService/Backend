package com.changellenge.hackaton.sber.changellengesber.service.impl;

import com.changellenge.hackaton.sber.changellengesber.model.dto.ClientDTO;
import com.changellenge.hackaton.sber.changellengesber.service.AutomaticCheckService;
import com.changellenge.hackaton.sber.changellengesber.service.CheckService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AutomaticCheckServiceImpl implements AutomaticCheckService {
    private CheckService bankruptService;
    private CheckService mvdService;
    private CheckService epService;
    public AutomaticCheckServiceImpl(@Qualifier("defaultBankruptService") CheckService bankruptService1,
                                 @Qualifier("defaultMVDService") CheckService mvdService1,
                                 @Qualifier("defaultEPService") CheckService epService1)
    {
        bankruptService = bankruptService1;
        mvdService = mvdService1;
        epService = epService1;
    }
    @Override
    public Map<ServiceNameEnum, Boolean> checkClient(ClientDTO client) {
        Map<ServiceNameEnum, Boolean> resultMap = new HashMap<>();
        resultMap.put(ServiceNameEnum.BANKRUPT, bankruptService.checkClient(client));
        resultMap.put(ServiceNameEnum.MVD, mvdService.checkClient(client));
        resultMap.put(ServiceNameEnum.EP, epService.checkClient(client));
        return resultMap;
    }
}
