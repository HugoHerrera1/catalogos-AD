package com.mx.imss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "adtst_responsables")
public class Responsables {
    @Id
    @Column(name = "ID_MATRICULA", nullable = false, length = 45)
    private String id;

    @Column(name = "ID_UBICACION", nullable = false)
    private Integer idUbicacion;

    @Column(name = "ID_TURNO")
    private Integer idTurno;

    @Column(name = "ID_TIPO_UBICACION")
    private Integer idTipoUbicacion;

    @Column(name = "NOM_RESPONSABLE", length = 45)
    private String nomResponsable;

    @Column(name = "CVE_RESPONSABLE", nullable = false)
    private Integer cveResponsable;

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

    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public Integer getIdTipoUbicacion() {
        return idTipoUbicacion;
    }

    public void setIdTipoUbicacion(Integer idTipoUbicacion) {
        this.idTipoUbicacion = idTipoUbicacion;
    }

    public String getNomResponsable() {
        return nomResponsable;
    }

    public void setNomResponsable(String nomResponsable) {
        this.nomResponsable = nomResponsable;
    }

    public Integer getCveResponsable() {
        return cveResponsable;
    }

    public void setCveResponsable(Integer cveResponsable) {
        this.cveResponsable = cveResponsable;
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