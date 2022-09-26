package com.americadados.americadados.service;

import com.americadados.americadados.model.Consulado;
import com.americadados.americadados.repo.ConsuladoRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ConsuladoService {
    private final ConsuladoRepo consuladoRepo;

    public ConsuladoService(ConsuladoRepo consuladoRepo) {
        this.consuladoRepo = consuladoRepo;
    }

    public List<Consulado> addConsulado(List<Consulado> consulado) {
        return consuladoRepo.saveAll(consulado);
    }

    public List<Consulado> updateConsulado(List<Consulado> consulado) {
        return consuladoRepo.saveAll(consulado);
    }

    public List<Consulado> findAllConsulado() {
        return consuladoRepo.findAll();
    }

    public List<Consulado> findConsuladoById(String nomePais, List<Consulado> consulados) {
        List<Consulado> consuladoList = new ArrayList<>();

        consulados.forEach(consulado -> {
            if (consulado.getNomePais().equals(nomePais)) {
                consuladoList.add(consulado);
            }
        });
        return consuladoList;
    }
}
