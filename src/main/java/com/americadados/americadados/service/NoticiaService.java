package com.americadados.americadados.service;

import com.americadados.americadados.exception.UserNotFoundException;
import com.americadados.americadados.model.Noticia;
import com.americadados.americadados.model.NoticiaPrincipal;
import com.americadados.americadados.repo.NoticiaPrincipalRepo;
import com.americadados.americadados.repo.NoticiaRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class NoticiaService {
    private NoticiaRepo noticiaRepo;
    private NoticiaPrincipalRepo noticiaPrincipalRepo;

    public NoticiaService(NoticiaRepo noticiaRepo, NoticiaPrincipalRepo noticiaPrincipalRepo) {
        this.noticiaRepo = noticiaRepo;
        this.noticiaPrincipalRepo = noticiaPrincipalRepo;
    }

    public NoticiaPrincipal addNoticiaP(NoticiaPrincipal noticiaPrincipal) {
        return noticiaPrincipalRepo.save(noticiaPrincipal);
    }

    public Noticia addNoticia(Noticia noticia) {
        return noticiaRepo.save(noticia);
    }

    public List<Noticia> findAllNoticia() {
        return noticiaRepo.findAll();
    }

    public NoticiaPrincipal updateNoticiaP(NoticiaPrincipal noticiaPrincipal) {
        return noticiaPrincipalRepo.save(noticiaPrincipal);
    }

    public Noticia updateNoticia(Noticia noticia) {
        return noticiaRepo.save(noticia);
    }

    public NoticiaPrincipal findPrincipalNoticiaById(Integer id) {
        return noticiaPrincipalRepo.findNoticiaPrincipalById(id);
    }

    public Noticia findNoticiaById(Long id) {
        return noticiaRepo.findNoticiaById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteNoticia(Long id){
        noticiaRepo.deleteNoticiaById(id);
    }
}
