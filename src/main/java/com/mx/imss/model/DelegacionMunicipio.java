package com.mx.imss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adtcorebdqa.adtsc_delegacion_municipio")
public class DelegacionMunicipio {

    @Id
    @Column(name = "ID_DELEGACION_MUNICIPIO",nullable = false)
    private Integer idDelegacionMunicipio;

    @Column(name = "ID_ESTADO",nullable = false)
    private Integer idEstado;

    @Column(name = "NOM_MUNICIPIO",nullable = false)
    private String nomMunicipio;

    public Integer getIdDelegacionMunicipio() {
        return idDelegacionMunicipio;
    }

    public void setIdDelegacionMunicipio(Integer idDelegacionMunicipio) {
        this.idDelegacionMunicipio = idDelegacionMunicipio;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomMunicipio() {
        return nomMunicipio;
    }

    public void setNomMunicipio(String nomMunicipio) {
        this.nomMunicipio = nomMunicipio;
    }
}
