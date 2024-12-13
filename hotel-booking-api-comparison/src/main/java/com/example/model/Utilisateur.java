package com.example.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomUtilisateur;
    private String motDePasse;
    private String role;
}

