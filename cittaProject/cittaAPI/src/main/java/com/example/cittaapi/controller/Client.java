package com.example.cittaapi.controller;

import com.example.cittaapi.model.Request;
import com.example.cittaapi.model.Service;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Client {
    @GetMapping
    @RequestMapping("/services")
    public List<Service> Service() {
        System.setProperty("https.protocols", "TLSv1.2");
        RestTemplate restTemplate = new RestTemplateBuilder().rootUri("https://api.cittamobi.com.br/m3p/js/prediction/stop/5208036,5195544").build();
        Request request = restTemplate.getForObject("/", Request.class);

        List<Service> services = request.getServices();
        return  services;
    }
}
