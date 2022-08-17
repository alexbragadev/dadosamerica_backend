package com.americadados.americadados.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class NoticiaPrincipal implements Serializable {

    @Id
    private Integer id;
    private String titulo;
    private String urlImg;
    private String resumo;
    private String fonte;
    private String linkDaNoticia;

    public NoticiaPrincipal() {
    }

    public NoticiaPrincipal(int id, String titulo, String urlImg, String resumo, String fonte, String linkDaNoticia) {
        this.id = id;
        this.titulo = titulo;
        this.urlImg = urlImg;
        this.resumo = resumo;
        this.fonte = fonte;
        this.linkDaNoticia = linkDaNoticia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getLinkDaNoticia() {
        return linkDaNoticia;
    }

    public void setLinkDaNoticia(String linkDaNoticia) {
        this.linkDaNoticia = linkDaNoticia;
    }

    @Override
    public String toString() {
        return "NoticiaPrincipal{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", urlImg='" + urlImg + '\'' +
                ", resumo='" + resumo + '\'' +
                ", fonte='" + fonte + '\'' +
                ", linkDaNoticia='" + linkDaNoticia + '\'' +
                '}';
    }
}
