package com.mx.imss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "adtst_especialidades")
public class Especialidad {
    @Id
    @Column(name = "CVE_ESPECIALIDAD", nullable = false, length = 45)
    private String id;

    @Column(name = "DES_CLAVE_ESPECIALIDAD", nullable = false)
    private String desClaveEspecialidad;

    @Column(name = "NOM_ESPECIALIDAD", nullable = false, length = 70)
    private String nomEspecialidad;

    @Column(name = "IND_CE", nullable = false)
    private Boolean indCe = false;

    @Column(name = "IND_HOSPITAL", nullable = false)
    private Boolean indHospital = false;

    @Column(name = "IND_IQ", nullable = false)
    private Boolean indIq = false;

    @Column(name = "IND_NIVEL1", nullable = false)
    private Boolean indNivel1 = false;

    @Column(name = "IND_NIVEL2", nullable = false)
    private Boolean indNivel2 = false;

    @Column(name = "IND_NIVEL3", nullable = false)
    private Boolean indNivel3 = false;

    @Column(name = "IND_CSS", nullable = false)
    private Boolean indCss = false;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesClaveEspecialidad() {
        return desClaveEspecialidad;
    }

    public void setDesClaveEspecialidad(String desClaveEspecialidad) {
        this.desClaveEspecialidad = desClaveEspecialidad;
    }

    public String getNomEspecialidad() {
        return nomEspecialidad;
    }

    public void setNomEspecialidad(String nomEspecialidad) {
        this.nomEspecialidad = nomEspecialidad;
    }

    public Boolean getIndCe() {
        return indCe;
    }

    public void setIndCe(Boolean indCe) {
        this.indCe = indCe;
    }

    public Boolean getIndHospital() {
        return indHospital;
    }

    public void setIndHospital(Boolean indHospital) {
        this.indHospital = indHospital;
    }

    public Boolean getIndIq() {
        return indIq;
    }

    public void setIndIq(Boolean indIq) {
        this.indIq = indIq;
    }

    public Boolean getIndNivel1() {
        return indNivel1;
    }

    public void setIndNivel1(Boolean indNivel1) {
        this.indNivel1 = indNivel1;
    }

    public Boolean getIndNivel2() {
        return indNivel2;
    }

    public void setIndNivel2(Boolean indNivel2) {
        this.indNivel2 = indNivel2;
    }

    public Boolean getIndNivel3() {
        return indNivel3;
    }

    public void setIndNivel3(Boolean indNivel3) {
        this.indNivel3 = indNivel3;
    }

    public Boolean getIndCss() {
        return indCss;
    }

    public void setIndCss(Boolean indCss) {
        this.indCss = indCss;
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