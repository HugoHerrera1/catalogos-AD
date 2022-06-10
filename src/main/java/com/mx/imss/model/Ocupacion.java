package com.mx.imss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adtsc_ocupaciones")
public class Ocupacion {
    @Id
    @Column(name = "ID_OCUPACION",nullable = false)
    private Integer id;
    @Column(name = "NOM_OCUPACION",nullable = false)
    private String nombreOcupacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreOcupacion() {
        return nombreOcupacion;
    }

    public void setNombreOcupacion(String nombreOcupacion) {
        this.nombreOcupacion = nombreOcupacion;
    }
}
