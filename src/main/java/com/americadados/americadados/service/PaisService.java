package com.americadados.americadados.service;

import com.americadados.americadados.exception.UserNotFoundException;
import com.americadados.americadados.model.Pais;
import com.americadados.americadados.repo.PaisRepo;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class PaisService {
    private final PaisRepo paisRepo;

    public PaisService(PaisRepo paisRepo) {
        this.paisRepo = paisRepo;
    }

    public Pais addPais(Pais pais) {
        pais.setPaisCode(UUID.randomUUID().toString());
        return paisRepo.save(pais);
    }

    public List<Pais> findAllPais() {
        return paisRepo.findAll(Sort.by(Sort.Direction.ASC, "nome"));
    }

    public Pais updatePais(Pais pais) {
        return paisRepo.save(pais);
    }

    public Pais findPaisById(Long id) {
        return paisRepo.findPaisById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deletePais(Long id){
        paisRepo.deletePaisById(id);
    }
}
