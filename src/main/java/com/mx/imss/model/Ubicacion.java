package com.mx.imss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "adtsc_ubicaciones")
public class Ubicacion {
    @Id
    @Column(name = "ID_UBICACION", nullable = false)
    private Integer id;

    @Column(name = "ID_TIPO_UBICACION", nullable = false)
    private Integer idTipoUbicacion;

    @Column(name = "ID_NIVEL", nullable = false)
    private Integer idNivel;

    @Column(name = "ID_UNIDAD_MEDICA", nullable = false)
    private String idUnidadMedica;

    @Column(name = "CVE_TIPO_UNIDAD_MEDICA")
    private Integer cveTipoUnidadMedica;

    @Column(name = "CVE_ESPECIALIDAD", nullable = false)
    private String cveEspecialidad;

    @Column(name = "DES_COMPLETA_UBICACION", nullable = false, length = 90)
    private String desCompletaUbicacion;

    @Column(name = "DES_ABREVIADA_UBICACION", nullable = false, length = 45)
    private String desAbreviadaUbicacion;

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

    public Integer getIdTipoUbicacion() {
        return idTipoUbicacion;
    }

    public void setIdTipoUbicacion(Integer idTipoUbicacion) {
        this.idTipoUbicacion = idTipoUbicacion;
    }

    public Integer getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Integer idNivel) {
        this.idNivel = idNivel;
    }

    public String getIdUnidadMedica() {
        return idUnidadMedica;
    }

    public void setIdUnidadMedica(String idUnidadMedica) {
        this.idUnidadMedica = idUnidadMedica;
    }

    public Integer getCveTipoUnidadMedica() {
        return cveTipoUnidadMedica;
    }

    public void setCveTipoUnidadMedica(Integer cveTipoUnidadMedica) {
        this.cveTipoUnidadMedica = cveTipoUnidadMedica;
    }

    public String getCveEspecialidad() {
        return cveEspecialidad;
    }

    public void setCveEspecialidad(String cveEspecialidad) {
        this.cveEspecialidad = cveEspecialidad;
    }

    public String getDesCompletaUbicacion() {
        return desCompletaUbicacion;
    }

    public void setDesCompletaUbicacion(String desCompletaUbicacion) {
        this.desCompletaUbicacion = desCompletaUbicacion;
    }

    public String getDesAbreviadaUbicacion() {
        return desAbreviadaUbicacion;
    }

    public void setDesAbreviadaUbicacion(String desAbreviadaUbicacion) {
        this.desAbreviadaUbicacion = desAbreviadaUbicacion;
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