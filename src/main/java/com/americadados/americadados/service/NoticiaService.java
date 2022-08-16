package com.americadados.americadados.service;

import com.americadados.americadados.exception.UserNotFoundException;
import com.americadados.americadados.model.Noticia;
import com.americadados.americadados.repo.NoticiaRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class NoticiaService {
    private NoticiaRepo noticiaRepo;

    public NoticiaService(NoticiaRepo noticiaRepo) {
        this.noticiaRepo = noticiaRepo;
    }

    public Noticia addNoticia(Noticia noticia) {
        return noticiaRepo.save(noticia);
    }

    public List<Noticia> findAllNoticia() {
        return noticiaRepo.findAll();
    }

    public Noticia updateNoticia(Noticia noticia) {
        return noticiaRepo.save(noticia);
    }

    public Noticia findNoticiaById(Long id) {
        return noticiaRepo.findNoticiaById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteNoticia(Long id){
        noticiaRepo.deleteNoticiaById(id);
    }
}
