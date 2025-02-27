package com.example.atelier6;

import com.example.atelier6.model.Crypto;
import com.example.atelier6.repo.CryptoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//Thread à haute priorité
@Component
@Order(1)
public class InserData implements CommandLineRunner {

    @Autowired
    CryptoRepo cryptoRepo;

    private String [] symbols = {"BTC-USD", "ETH-USDX", "USDT-USD", "XRP-USD", "BNB-USD"};
    private String [] tabNames = {"BTC", "ETH", "USDT", "XRP", "BNB"};

    private void randomData(){
        List<Crypto> listCrypto = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Crypto crypto = new Crypto();
            crypto.setSymbol(symbols[i]);
            crypto.setName(tabNames[i]);
            crypto.setPrice(Math.random() * 100);

            listCrypto.add(crypto);
        }
        cryptoRepo.saveAll(listCrypto);
    }
    @Override
    public void run(String... args) throws Exception {
        randomData();
    }
}
