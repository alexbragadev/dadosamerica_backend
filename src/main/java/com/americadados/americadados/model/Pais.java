package com.americadados.americadados.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Pais implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nome;
    private String urlImg;
    private String descrisao;
    @Column(nullable = false, updatable = false)
    private String PaisCode;

    public Pais() {
    }

    public Pais(String nome, String urlImg, String descrisao, String paisCode) {
        this.nome = nome;
        this.urlImg = urlImg;
        this.descrisao = descrisao;
        PaisCode = paisCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public String getDescrisao() {
        return descrisao;
    }

    public void setDescrisao(String descrisao) {
        this.descrisao = descrisao;
    }

    public String getPaisCode() {
        return PaisCode;
    }

    public void setPaisCode(String paisCode) {
        PaisCode = paisCode;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", urlImg='" + urlImg + '\'' +
                ", descrisao='" + descrisao + '\'' +
                '}';
    }
}
