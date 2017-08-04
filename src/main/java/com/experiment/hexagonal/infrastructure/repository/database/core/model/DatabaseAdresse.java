package com.experiment.hexagonal.infrastructure.repository.database.core.model;

import java.util.Objects;
import java.util.UUID;

public class DatabaseAdresse {       
    private final UUID uuid;
    private String id;
    private String ville;

    public DatabaseAdresse(UUID uuid) {
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

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
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
        return Objects.equals(this.uuid, ((DatabaseAdresse) obj).uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }
}
