package com.americadados.americadados.service;

import com.americadados.americadados.model.Embaixada;
import com.americadados.americadados.repo.EmbaixadaRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional
public class EmbaixadaService {

    private final EmbaixadaRepo embaixadaRepo;

    public EmbaixadaService(EmbaixadaRepo embaixadaRepo) {
        this.embaixadaRepo = embaixadaRepo;
    }

    public List<Embaixada> addEmbaixada(List<Embaixada> embaixadas) {
        return embaixadaRepo.saveAll(embaixadas);
    }

    public List<Embaixada> updateEmbaixadas(List<Embaixada> embaixadas) {
        return embaixadaRepo.saveAll(embaixadas);
    }

    public List<Embaixada> findAllEmbaixadas() {
        return embaixadaRepo.findAll();
    }

    public List<Embaixada> findEmbaixadasById(String nomePais, List<Embaixada> embaixadas) {
        List<Embaixada> embaixadaList = new ArrayList<>();

        embaixadas.forEach(embaixada -> {
            if (embaixada.getNomePais().equals(nomePais)) {
                embaixadaList.add(embaixada);
            }
        });
        return embaixadaList;
    }
}
