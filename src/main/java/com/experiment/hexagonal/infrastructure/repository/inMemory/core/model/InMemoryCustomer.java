package com.experiment.hexagonal.infrastructure.repository.inMemory.core.model;

import java.util.UUID;

public class InMemoryCustomer extends InMemoryEntity {       
    private UUID userId;
    private UUID adresseId;

    public InMemoryCustomer(UUID uuid) {
        super(uuid);
    }
    
    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getAdresseId() {
        return adresseId;
    }

    public void setAdresseId(UUID adresseId) {
        this.adresseId = adresseId;
    }
    
}
