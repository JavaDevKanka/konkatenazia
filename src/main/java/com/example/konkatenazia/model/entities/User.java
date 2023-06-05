package com.example.konkatenazia.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class User {
    @Id
    private String id;

    private String username;
    private String name;
    private String telegram;

    @ManyToMany
    private final List<Role> roles = new ArrayList<>();

    public Collection<Role> getRoles() {
        return roles;
    }
}
