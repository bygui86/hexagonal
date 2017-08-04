package com.experiment.hexagonal.infrastructure.repository.inMemory.core.api;

import com.experiment.hexagonal.infrastructure.repository.inMemory.core.model.InMemoryCustomer;
import com.experiment.hexagonal.infrastructure.repository.inMemory.core.model.Repository;
import java.util.List;
import java.util.UUID;

public interface CrudInMemoryCustomer extends Repository<InMemoryCustomer> {
    List<InMemoryCustomer> getForUser(UUID userId);
    List<InMemoryCustomer> getForAdresse(UUID adresseId);
}
