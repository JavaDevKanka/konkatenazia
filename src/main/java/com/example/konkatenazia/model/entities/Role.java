package com.example.konkatenazia.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Role implements GrantedAuthority {
    @Id
    private String id;

    @ManyToMany
    private final List<Operation> allowedOperations = new ArrayList<>();

    @Override
    public String getAuthority() {
        return id;
    }

    public Collection<? extends GrantedAuthority> getAllowedOperations() {
        return allowedOperations;
    }
}
