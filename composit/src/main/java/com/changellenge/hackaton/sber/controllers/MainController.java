package com.changellenge.hackaton.sber.controllers;

import com.changellenge.hackaton.sber.config.ProcessorClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/composit")
public class MainController
{
    @Autowired
    private ProcessorClient processorClient;

    @GetMapping("/allforms")
    public void getAllForms()
    {

    }

    @GetMapping("/client={id}")
    public void getForm(@PathVariable Long id)
    {

    }
}
