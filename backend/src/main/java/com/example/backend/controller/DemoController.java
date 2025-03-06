package com.example.backend.controller;


import com.example.backend.model.Client;
import com.example.backend.model.ClientDTO;
import com.example.backend.repo.ClientRepo;
import com.example.backend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class DemoController {

    @Autowired
    ClientService clientService;

    @Autowired
    ClientRepo clientRepo;

    @GetMapping("/get1")
    public List<ClientDTO> getAllDTO(){
        return clientService.getall();
    }

    @GetMapping("/get2")
    public List<Client> getAll(){
        return clientRepo.findAll();
    }

    @GetMapping("/get3")
    public List<String> getMesChoix(){
        return clientRepo.getMesChoix();
    }
}
