package com.experiment.hexagonal.infrastructure.repository.database.core.model;

import java.util.Objects;
import java.util.UUID;

public class DatabaseUser {       
    private final UUID uuid;
    private String id;
    private String email;
    private String passwordHash;
    private String gender;
    private String fullName;

    public DatabaseUser(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.uuid, ((DatabaseUser) obj).uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }
}
