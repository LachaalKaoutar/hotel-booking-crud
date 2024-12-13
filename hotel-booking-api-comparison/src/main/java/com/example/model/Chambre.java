package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chambre {

    @Id
    private Long id;

    private String name;  // Par exemple, nom de la chambre

    // Constructeurs
    public Chambre() {
    }

    public Chambre(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter pour `id`
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter et setter pour `name`
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
