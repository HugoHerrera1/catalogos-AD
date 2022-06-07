package com.mx.imss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "adtsc_turnos")
public class Turno {
    @Id
    @Column(name = "ID_TURNO", nullable = false)
    private Integer id;

    @Column(name = "DES_TURNO", nullable = false, length = 50)
    private String desTurno;

    @Column(name = "CVE_TURNO", length = 45)
    private String cveTurno;

    @Column(name = "FEC_EXPIRA")
    private LocalDate fecExpira;

    @Column(name = "FEC_ALTA")
    private Date fecAlta;

    @Column(name = "FEC_ACTUALIZACION")
    private Date fecActualizacion;

    @Column(name = "FEC_BAJA")
    private Date fecBaja;

    @Column(name = "IND_ACTIVO")
    private Boolean indActivo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesTurno() {
        return desTurno;
    }

    public void setDesTurno(String desTurno) {
        this.desTurno = desTurno;
    }

    public String getCveTurno() {
        return cveTurno;
    }

    public void setCveTurno(String cveTurno) {
        this.cveTurno = cveTurno;
    }

    public LocalDate getFecExpira() {
        return fecExpira;
    }

    public void setFecExpira(LocalDate fecExpira) {
        this.fecExpira = fecExpira;
    }

    public Date getFecAlta() {
        return fecAlta;
    }

    public void setFecAlta(Date fecAlta) {
        this.fecAlta = fecAlta;
    }

    public Date getFecActualizacion() {
        return fecActualizacion;
    }

    public void setFecActualizacion(Date fecActualizacion) {
        this.fecActualizacion = fecActualizacion;
    }

    public Date getFecBaja() {
        return fecBaja;
    }

    public void setFecBaja(Date fecBaja) {
        this.fecBaja = fecBaja;
    }

    public Boolean getIndActivo() {
        return indActivo;
    }

    public void setIndActivo(Boolean indActivo) {
        this.indActivo = indActivo;
    }

}