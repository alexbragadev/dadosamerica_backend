package com.americadados.americadados;

import com.americadados.americadados.model.Embaixada;
import com.americadados.americadados.service.EmbaixadaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/embaixada")
public class EmbaixadaResouce {
    private final EmbaixadaService embaixadaService;

    public EmbaixadaResouce(EmbaixadaService embaixadaService) {
        this.embaixadaService = embaixadaService;
    }

    @PostMapping("/add")
    public ResponseEntity<List<Embaixada>> addEmbaixada(@RequestBody List<Embaixada> embaixadas) {

        embaixadaService.addEmbaixada(embaixadas);

        return new ResponseEntity<>(embaixadas, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<List<Embaixada>> updateEmbaixadas(@RequestBody List<Embaixada> embaixadas) {

        List<Embaixada> embaixadaList = embaixadaService.updateEmbaixadas(embaixadas);

        return new ResponseEntity<>(embaixadaList, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Embaixada>> getAllEmbaixadas () {
        List<Embaixada> embaixada = embaixadaService.findAllEmbaixadas();
        return new ResponseEntity<>(embaixada, HttpStatus.OK);
    }

    @GetMapping("/find/{nomePais}")
    public ResponseEntity<List<Embaixada>> getEmbaixadasById (@PathVariable("nomePais") String nomePais) {

        List<Embaixada> embaixadas = embaixadaService.findAllEmbaixadas();

        List<Embaixada> embaixadasById = embaixadaService.findEmbaixadasById(nomePais, embaixadas);

        return new ResponseEntity<>(embaixadasById, HttpStatus.OK);
    }
}
