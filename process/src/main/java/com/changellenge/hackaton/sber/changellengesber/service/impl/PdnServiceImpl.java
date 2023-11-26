package com.changellenge.hackaton.sber.changellengesber.service.impl;

import com.changellenge.hackaton.sber.changellengesber.model.entity.Bki;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Client;
import com.changellenge.hackaton.sber.changellengesber.model.entity.LoanInformation;
import com.changellenge.hackaton.sber.changellengesber.model.entity.Request;
import com.changellenge.hackaton.sber.changellengesber.model.exceptions.NotFoundException;
import com.changellenge.hackaton.sber.changellengesber.repo.BkiRepository;
import com.changellenge.hackaton.sber.changellengesber.repo.ClientRepository;
import com.changellenge.hackaton.sber.changellengesber.repo.LoanInformationRepository;
import com.changellenge.hackaton.sber.changellengesber.repo.RequestRepository;
import com.changellenge.hackaton.sber.changellengesber.utils.FindUtils;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PdnServiceImpl {
    private final ClientRepository clientRepository;
    private final ModelMapper mapper;
    private final BkiRepository bkiRepository;
    private LoanInformationRepository loanInformationRepository;
    private final RequestRepository requestRepository;

    public PdnServiceImpl(ClientRepository clientRepository, ModelMapper mapper, BkiRepository bkiRepository, LoanInformationRepository loanInformationRepository,
                          RequestRepository requestRepository) {
        this.clientRepository = clientRepository;
        this.mapper = mapper;
        this.bkiRepository = bkiRepository;
        this.loanInformationRepository = loanInformationRepository;
        this.requestRepository = requestRepository;
    }

    public Double calculatePdnByClientId(Long id) throws NotFoundException {
        Client client = FindUtils.findClient(clientRepository, id);
        Bki bki = bkiRepository.findByClient(client);
        List<LoanInformation> loanInformationList = loanInformationRepository.findByClient(client);
        double avgPays = loanInformationList.stream()
                .filter(loan -> loan.getStatus().getStatus().equals("Текущий"))
                .mapToDouble(LoanInformation::getMonthlyPay)
                .average()
                .orElse(0.0);
        Double pdn = avgPays / client.getMonthlyIncome() * 100.0;
        List<Request> requests = requestRepository.findByClientId(id);
        System.out.println(requests);
        for (Request request: requests) {
            request.setPdn(pdn);
            requestRepository.save(request);
        }
        return pdn;
    }
}
