package com.springtechie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerA {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ms")
    public String ms_b() {
        String s=restTemplate.getForObject("http://localhost:8081/b",String.class);
        return "I am microservice A"+s;
    }


}
