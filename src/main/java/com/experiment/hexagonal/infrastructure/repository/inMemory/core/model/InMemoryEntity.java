package com.experiment.hexagonal.infrastructure.repository.inMemory.core.model;

import java.util.Objects;
import java.util.UUID;

public class InMemoryEntity {       
    private final UUID uuid;

    public InMemoryEntity(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
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
        return Objects.equals(this.uuid, ((InMemoryEntity) obj).uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }
}
