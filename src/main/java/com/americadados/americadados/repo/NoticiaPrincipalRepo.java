package com.americadados.americadados.repo;

import com.americadados.americadados.model.NoticiaPrincipal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticiaPrincipalRepo extends JpaRepository<NoticiaPrincipal, Integer> {
    NoticiaPrincipal findNoticiaPrincipalById(Integer id);
}
