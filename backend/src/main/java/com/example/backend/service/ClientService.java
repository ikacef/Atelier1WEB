package com.example.backend.service;

import com.example.backend.model.Client;
import com.example.backend.model.ClientDTO;
import com.example.backend.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    private final ClientRepo clientRepo;


    //Injection par Constructeur  / alternative de @AutoWired
    public ClientService(ClientRepo cclientRepo){
       this.clientRepo = cclientRepo;
    }


    public List<ClientDTO> getall(){
        List<Client> clientList = clientRepo.findAll();
        List<ClientDTO> listFiltre = new ArrayList<>();

        for (Client c: clientList) {
            ClientDTO cdto = new ClientDTO();
            cdto.setFirstName(c.getFirstName());
            cdto.setLastName(c.getLastName());
            cdto.setEmail(c.getEmail());

            listFiltre.add(cdto);

        }
        return listFiltre;

    }

}
