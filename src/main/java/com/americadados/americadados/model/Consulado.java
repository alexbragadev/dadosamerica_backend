package com.americadados.americadados.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Consulado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long countryId;
    private String nomePais;
    private String nome;
    private String endereco;
    private String telefone;
    private String fax;
    private String email;
    private String website;
    private String horaAtendimento;

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getHoraAtendimento() {
        return horaAtendimento;
    }

    public void setHoraAtendimento(String horaAtendimento) {
        this.horaAtendimento = horaAtendimento;
    }

    public Consulado() {
    }

    public Consulado(String nomePais, String nome, String endereco, String telefone, String fax, String email, String website, String horaAtendimento) {
        this.nomePais = nomePais;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.fax = fax;
        this.email = email;
        this.website = website;
        this.horaAtendimento = horaAtendimento;
    }

    @Override
    public String toString() {
        return "Consulado{" +
                "countryId=" + countryId +
                ", nomePais='" + nomePais + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", horaAtendimento='" + horaAtendimento + '\'' +
                '}';
    }
}
