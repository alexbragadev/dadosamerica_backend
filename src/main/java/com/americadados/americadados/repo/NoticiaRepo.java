package com.americadados.americadados.repo;

import com.americadados.americadados.model.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoticiaRepo extends JpaRepository<Noticia, Long> {

    void deleteNoticiaById(Long id);

    Optional<Noticia> findNoticiaById(Long id);

}
