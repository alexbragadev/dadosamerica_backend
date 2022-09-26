package com.americadados.americadados;

import com.americadados.americadados.model.Consulado;
import com.americadados.americadados.service.ConsuladoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulado")
public class ConsuladoResouce {
    private final ConsuladoService consuladoService;

    public ConsuladoResouce(ConsuladoService consuladoService) {
        this.consuladoService = consuladoService;
    }

    @PostMapping("/add")
    public ResponseEntity<List<Consulado>> addConsulado(@RequestBody List<Consulado> consulado) {

        consuladoService.addConsulado(consulado);

        return new ResponseEntity<>(consulado, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<List<Consulado>> updateConsulado(@RequestBody List<Consulado> consulado) {

        List<Consulado> consuladoList = consuladoService.updateConsulado(consulado);

        return new ResponseEntity<>(consuladoList, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Consulado>> getAllConsulado () {
        List<Consulado> consulado = consuladoService.findAllConsulado();
        return new ResponseEntity<>(consulado, HttpStatus.OK);
    }

    @GetMapping("/find/{nomePais}")
    public ResponseEntity<List<Consulado>> getConsuladoById (@PathVariable("nomePais") String nomePais) {

        List<Consulado> consulado = consuladoService.findAllConsulado();

        List<Consulado> consuladoById = consuladoService.findConsuladoById(nomePais, consulado);

        return new ResponseEntity<>(consuladoById, HttpStatus.OK);
    }
}
