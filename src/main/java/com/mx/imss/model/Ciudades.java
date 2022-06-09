package com.mx.imss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adtsc_ciudades")
public class Ciudades {

    @Id
    @Column(name = "ID_CIUDAD",nullable = false)
    private Integer idCiudad;

    @Column(name = "ID_ESTADO",nullable = false)
    private Integer idEstado;

    @Column(name = "ID_DELEGACION_MUNICIPIO",nullable = false)
    private Integer idDelegacionMunicipio;

    @Column(name = "NOM_CIUDAD",nullable = false)
    private String nomCiudad;

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdDelegacionMunicipio() {
        return idDelegacionMunicipio;
    }

    public void setIdDelegacionMunicipio(Integer idDelegacionMunicipio) {
        this.idDelegacionMunicipio = idDelegacionMunicipio;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }
}
