package com.example.backend.repo;

import com.example.backend.model.Client;
import com.example.backend.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepo extends JpaRepository<Client,Long> {
    @Query("select c.firstName, c.lastName, c.email from Client c")
    public List<String> getMesChoix();
}
