package com.americadados.americadados;

import com.americadados.americadados.model.Noticia;
import com.americadados.americadados.service.NoticiaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/noticia")
public class NoticiaResouce {
    private final NoticiaService noticiaService;

    public NoticiaResouce(NoticiaService noticiaService) {
        this.noticiaService = noticiaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Noticia>> getAllNoticia () {
        List<Noticia> noticia = noticiaService.findAllNoticia();
        return new ResponseEntity<>(noticia, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Noticia> getNoticiaById (@PathVariable("id") Long id) {
        Noticia noticia = noticiaService.findNoticiaById(id);
        return new ResponseEntity<>(noticia, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Noticia> addNoticia(@RequestBody Noticia noticia) {
        Noticia newNoticia = noticiaService.addNoticia(noticia);
        return new ResponseEntity<>(newNoticia, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Noticia> updateNoticia(@RequestBody Noticia noticia) {
        Noticia updateNoticia = noticiaService.updateNoticia(noticia);
        return new ResponseEntity<>(updateNoticia, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteNoticia(@PathVariable("id") Long id) {
        noticiaService.deleteNoticia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
