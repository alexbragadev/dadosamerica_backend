package com.americadados.americadados.repo;

import com.americadados.americadados.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaisRepo extends JpaRepository<Pais, Long> {

    void deletePaisById(Long id);

    Optional<Pais> findPaisById(Long id);

}
