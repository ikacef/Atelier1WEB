package com.example.atelier6.controller;

import com.example.atelier6.model.Crypto;
import com.example.atelier6.repo.CryptoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/myapi")
@CrossOrigin
public class CryptoController {

    @Autowired
    CryptoRepo cryptoRepo;

    @GetMapping("/getAllCryptos")
    public List<Crypto> getAll(){
        List<Crypto> list = cryptoRepo.findAll();
        List<Crypto> result = new ArrayList<>();
        for (Crypto c: list){
            c.setPrice(Math.random()*750);
            result.add(c);
        }
        return result;
    }

    @GetMapping("/getBySymbol/{symbol}")
    public List<Crypto> getCryptoBySymbols(@PathVariable String symbol){
        return cryptoRepo.findCryptoBySymbol(symbol);
    }
}
