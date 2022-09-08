package com.americadados.americadados.repo;

import com.americadados.americadados.model.Embaixada;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmbaixadaRepo extends JpaRepository<Embaixada, Long> {
    // Optional<Embaixada> findEmbaixadaById(Long countryId);
}
