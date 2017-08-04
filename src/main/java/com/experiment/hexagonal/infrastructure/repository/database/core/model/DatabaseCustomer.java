package com.experiment.hexagonal.infrastructure.repository.database.core.model;

import java.util.UUID;

public class DatabaseCustomer {       
    private final UUID uuid;
    private UUID userId;
    private UUID adresseId;

    public DatabaseCustomer(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
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
