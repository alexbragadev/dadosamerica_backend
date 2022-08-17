package com.americadados.americadados.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Noticia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String titulo;
    private String urlImg;
    private String resumo;
    private String texto;
    private String categoria;
    private String fonte;
    private Date dataNoticia;
    private String linkDaNoticia;

    public Noticia() {

    }

    public Noticia(String titulo, String urlImg, String resumo, String texto, Date dataNoticia, String categoria, String fonte, String linkDaNoticia) {
        this.titulo = titulo;
        this.urlImg = urlImg;
        this.resumo = resumo;
        this.texto = texto;
        this.dataNoticia = dataNoticia;
        this.categoria = categoria;
        this.fonte = fonte;
        this.linkDaNoticia = linkDaNoticia;
    }

    public String getLinkDaNoticia() {
        return linkDaNoticia;
    }

    public void setLinkDaNoticia(String linkDaNoticia) {
        this.linkDaNoticia = linkDaNoticia;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public Date getDataNoticia() {
        return dataNoticia;
    }

    public void setDataNoticia(Date dataNoticia) {
        dataNoticia = new java.sql.Date(System.currentTimeMillis());
        this.dataNoticia = dataNoticia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", urlImg='" + urlImg + '\'' +
                ", resumo='" + resumo + '\'' +
                ", texto='" + texto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", fonte='" + fonte + '\'' +
                ", dataNoticia=" + dataNoticia +
                ", linkDaNoticia='" + linkDaNoticia + '\'' +
                '}';
    }

}
