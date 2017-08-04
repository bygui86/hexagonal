package com.experiment.hexagonal.infrastructure.repository.inMemory.core.model;

import java.util.UUID;

public class InMemoryUser extends InMemoryEntity {       
    private String id;
    private String email;
    private String passwordHash;
    private String gender;
    private String fullName;

    public InMemoryUser(UUID uuid) {
        super(uuid);
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
