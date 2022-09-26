package com.americadados.americadados.repo;

import com.americadados.americadados.model.Consulado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsuladoRepo extends JpaRepository<Consulado, Long> {
    // Optional<Embaixada> findEmbaixadaById(Long countryId);
}
