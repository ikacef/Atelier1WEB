package com.example.backend.model;

import jakarta.persistence.*;

@Entity
public class Credentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nDA;
    private String pwd;

    @OneToOne
    @JoinColumn(name = "idEtudiant")
    private Etudiant etudiant;
}
