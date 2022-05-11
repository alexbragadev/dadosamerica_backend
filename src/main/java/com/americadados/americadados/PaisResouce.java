package com.americadados.americadados;

import com.americadados.americadados.model.Pais;
import com.americadados.americadados.service.PaisService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisResouce {
    private final PaisService paisService;

    public PaisResouce(PaisService paisService) {
        this.paisService = paisService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pais>> getAllPais () {
        List<Pais> pais = paisService.findAllPais();
        return new ResponseEntity<>(pais, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Pais> getPaisById (@PathVariable("id") Long id) {
        Pais pais = paisService.findPaisById(id);
        return new ResponseEntity<>(pais, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Pais> addPais(@RequestBody Pais pais) {
        Pais newPais = paisService.addPais(pais);
        return new ResponseEntity<>(newPais, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Pais> updatePais(@RequestBody Pais pais) {
        Pais updatePais = paisService.updatePais(pais);
        return new ResponseEntity<>(updatePais, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePais(@PathVariable("id") Long id) {
        paisService.deletePais(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
