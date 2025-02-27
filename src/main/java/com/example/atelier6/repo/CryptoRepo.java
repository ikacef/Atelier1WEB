package com.example.atelier6.repo;

import com.example.atelier6.model.Crypto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CryptoRepo extends JpaRepository<Crypto,Long> {

    List<Crypto> findCryptoBySymbol(String symbol);
}
