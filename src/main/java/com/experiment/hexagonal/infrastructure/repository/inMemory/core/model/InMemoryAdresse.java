package com.experiment.hexagonal.infrastructure.repository.inMemory.core.model;

import java.util.UUID;

public class InMemoryAdresse extends InMemoryEntity {       
    private String id;
    private String ville;

    public InMemoryAdresse(UUID uuid) {
        super(uuid);
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
}
