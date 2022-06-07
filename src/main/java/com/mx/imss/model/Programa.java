package com.mx.imss.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "adtsc_grupos_programas")
public class Programa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GRUPO_PROGRAMA", nullable = false)
    private Integer id;

    @Column(name = "CVE_ESPECIALIDAD", nullable = false)
    private String cveEspecialidad;

    @Column(name = "NOM_GRUPO_PROGRAMA", nullable = false, length = 100)
    private String nomGrupoPrograma;

    @Column(name = "CVE_CODIGO", length = 10)
    private String cveCodigo;

    @Column(name = "DES_ACTIVIDAD", length = 200)
    private String desActividad;

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

    public String getCveEspecialidad() {
        return cveEspecialidad;
    }

    public void setCveEspecialidad(String cveEspecialidad) {
        this.cveEspecialidad = cveEspecialidad;
    }

    public String getNomGrupoPrograma() {
        return nomGrupoPrograma;
    }

    public void setNomGrupoPrograma(String nomGrupoPrograma) {
        this.nomGrupoPrograma = nomGrupoPrograma;
    }

    public String getCveCodigo() {
        return cveCodigo;
    }

    public void setCveCodigo(String cveCodigo) {
        this.cveCodigo = cveCodigo;
    }

    public String getDesActividad() {
        return desActividad;
    }

    public void setDesActividad(String desActividad) {
        this.desActividad = desActividad;
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