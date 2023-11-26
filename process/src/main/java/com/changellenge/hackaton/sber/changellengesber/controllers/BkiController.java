package com.changellenge.hackaton.sber.changellengesber.controllers;

import com.changellenge.hackaton.sber.changellengesber.model.dto.BkiDto;
import com.changellenge.hackaton.sber.changellengesber.model.dto.RequestDto;
import com.changellenge.hackaton.sber.changellengesber.service.BkiService;
import com.changellenge.hackaton.sber.changellengesber.service.RequestService;
import jakarta.security.auth.message.AuthException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/processor/bki")
public class BkiController {
    private final BkiService bkiService;

    @Autowired
    public BkiController(BkiService bkiService) {
        this.bkiService = bkiService;
    }

    @GetMapping("/form={id}")
    public BkiDto getBkiById(@PathVariable Long id) throws ChangeSetPersister.NotFoundException, AuthException {
        return bkiService.getBkiById(id);
    }
}
