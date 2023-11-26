package com.changellenge.hackaton.sber.changellengesber.service.impl;

import com.changellenge.hackaton.sber.changellengesber.model.entity.Client;
import com.changellenge.hackaton.sber.changellengesber.model.exceptions.NotFoundException;
import com.changellenge.hackaton.sber.changellengesber.repo.ClientRepository;
import com.changellenge.hackaton.sber.changellengesber.service.ClientService;
import com.changellenge.hackaton.sber.changellengesber.utils.FindUtils;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

@Service

public class RisksService {
    private final PdnServiceImpl pdnService;
    private final ClientRepository clientRepository;

    public RisksService(PdnServiceImpl pdnService, ClientRepository clientRepository) {
        this.pdnService = pdnService;
        this.clientRepository = clientRepository;
    }

    public Integer calculateRisks(Long clientId) throws NotFoundException {
        Client client = FindUtils.findClient(clientRepository, clientId);
        int risk = 0;
        risk += calcAge(client.getDateBirth());
        risk += calcPdn(pdnService.calculatePdnByClientId(clientId));
        risk += calcStatus(client.getFamilyStatus().getStatus());
        risk += client.getChildren() ? 3 : 5;
        risk += client.getHasBankAccount() ? 1 : 5;
        risk += calcExperience(client.getWorkExperience());
        if (client.getAdditionalIncome() != null)
        risk += calcIncome(client.getMonthlyIncome() + client.getAdditionalIncome());
        else risk += calcIncome(client.getMonthlyIncome() );

//todo add work amount for risk
        return risk;


    }

    private int calcIncome(long income) {
        if (income > 250000) {
            return 3;
        }
        if (income > 101000) {
            return 5;
        }
        return income > 50 ? 7 : 15;
    }

    private int calcExperience(Date workExperience) {
        Calendar today = Calendar.getInstance();
        Calendar dob = Calendar.getInstance();
        dob.setTime(workExperience);
        int years = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
            years--;
        }
        if (years > 5) return 2;
        return years > 1 ? 3 : 10;
    }

    private int calcStatus(String status) {
        if (status.equals("Холост")) return 3;
        return status.equals("В разводе") ? 5 : 2;
    }

    private int calcPdn(Double pdn) {
        if (pdn > 95) return 20;
        return pdn > 70 ? 10 : 1;
    }

    private int calcAge(Date date) {
        Calendar today = Calendar.getInstance();
        Calendar dob = Calendar.getInstance();
        dob.setTime(date);
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        if (age <= 25) return 5;
        if (age <= 55) return 1;
        return age <= 74 ? 3 : 10;
    }
}
