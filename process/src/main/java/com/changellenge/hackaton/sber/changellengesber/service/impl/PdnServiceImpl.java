package com.changellenge.hackaton.sber.changellengesber.service.impl;

import com.changellenge.hackaton.sber.changellengesber.model.entity.Bki;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Client;
import com.changellenge.hackaton.sber.changellengesber.model.entity.LoanInformation;
import com.changellenge.hackaton.sber.changellengesber.repo.BkiRepository;
import com.changellenge.hackaton.sber.changellengesber.repo.ClientRepository;
import com.changellenge.hackaton.sber.changellengesber.repo.LoanInformationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PdnServiceImpl {
    private final ClientRepository clientRepository;
    private final ModelMapper mapper;
    private final BkiRepository bkiRepository;
    private LoanInformationRepository loanInformationRepository;

    public PdnServiceImpl(ClientRepository clientRepository, ModelMapper mapper, BkiRepository bkiRepository, LoanInformationRepository loanInformationRepository) {
        this.clientRepository = clientRepository;
        this.mapper = mapper;
        this.bkiRepository = bkiRepository;
        this.loanInformationRepository = loanInformationRepository;
    }

    public double calculatePdnByClientId(Long id) {
        Client client = clientRepository.findById(id).orElseThrow();
        Bki bki = bkiRepository.findByClient(client);
        List<LoanInformation> loanInformationList = loanInformationRepository.findByClient(client);
//        double avgPays = loanInformationRepository.findAvgPays(client);
        double avgPays = loanInformationList.stream()
                .filter(loan -> loan.getStatus().getStatus().equals("Текущий")) // Filtering for even IDs
                .mapToDouble(LoanInformation::getMonthlyPay) // Assuming getMonthlyPay returns a double
                .average()
                .orElse(0.0);
        System.out.println(avgPays);
        System.out.println(bki);
        System.out.println(loanInformationList);
        return avgPays / client.getMonthlyIncome() * 100.0;
    }
}
