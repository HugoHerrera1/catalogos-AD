package com.mx.imss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adtsc_estados")
public class Estados {

    @Id
    @Column(name = "ID_ESTADO", nullable = false)
    private Integer idEstado;

    @Column(name = "NOM_COMPLETO", nullable = false)
    private String nomCompleto;

    @Column(name = "NOM_ABREVIADO", nullable = false)
    private String nomAbreviado;

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public String getNomAbreviado() {
        return nomAbreviado;
    }

    public void setNomAbreviado(String nomAbreviado) {
        this.nomAbreviado = nomAbreviado;
    }
}
