package com.example.backend.repo;

import com.example.backend.model.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialsRepo extends JpaRepository<Credentials,Long> {

}
