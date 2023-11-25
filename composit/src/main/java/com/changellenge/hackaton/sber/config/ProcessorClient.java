package com.changellenge.hackaton.sber.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "processor", url = "localhost:/")
public interface ProcessorClient
{
    @RequestMapping(method = RequestMethod.GET, value = "/forms")
    List<String> getForms();

    @RequestMapping(method = RequestMethod.GET, value = "/forms={id}", produces = "application/json")
    String getFormById(@PathVariable("id") Long id);
}
