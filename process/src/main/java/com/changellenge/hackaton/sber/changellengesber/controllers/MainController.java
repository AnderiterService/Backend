package com.changellenge.hackaton.sber.changellengesber.controllers;

import com.changellenge.hackaton.sber.changellengesber.model.dto.RequestDto;
import com.changellenge.hackaton.sber.changellengesber.service.ClientService;
import com.changellenge.hackaton.sber.changellengesber.service.RequestService;
import com.changellenge.hackaton.sber.changellengesber.service.impl.PdnServiceImpl;
import jakarta.security.auth.message.AuthException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/processor")
public class MainController {
    private final RequestService requestService;
    private final ClientService clientService;
private final PdnServiceImpl pdnService;
    @Autowired
    public MainController(RequestService requestService, ClientService clientService, PdnServiceImpl pdnService) {
        this.requestService = requestService;
        this.clientService = clientService;
        this.pdnService = pdnService;
    }


    @GetMapping("/forms")
    public List<RequestDto> getAllForms() throws ChangeSetPersister.NotFoundException, AuthException {
        return requestService.getRequests();

    }

    @GetMapping("/form={id}")
    public RequestDto getForm(@PathVariable Long id) throws ChangeSetPersister.NotFoundException, AuthException {
        return requestService.getRequestById(id);
    }

    @GetMapping("/reload/client_id={id}")
    public void sendToReload(@PathVariable Long id) throws ChangeSetPersister.NotFoundException, AuthException {
        clientService.sendToReload(id);
    }

    @GetMapping("/pdn/client_id={id}")
    public Double calculatePdn(@PathVariable Long id) throws ChangeSetPersister.NotFoundException, AuthException {
        return pdnService.calculatePdnByClientId(id);
    }

}
