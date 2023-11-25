package com.changellenge.hackaton.sber.changellengesber.controllers;

//import com.changellenge.hackaton.sber.config.ProcessorClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/processor")
public class MainController {


    @GetMapping("/forms")
    public void getAllForms() {

    }

    @GetMapping("/form={id}")
    public void getForm(@PathVariable Long id) {

    }
}
