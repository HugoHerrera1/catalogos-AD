package com.mx.imss.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "adtsc_calendario_anual")
public class CalendarioAnual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CALENDARIO_ANUAL", nullable = false)
    private Integer id;

    @Column(name = "ID_UBICACION", nullable = false)
    private Integer idUbicacion;

    @Column(name = "ID_GRUPO_PROGRAMA", nullable = false)
    private Integer idGrupoPrograma;

    @Column(name = "ID_ESTATUS", nullable = false)
    private Integer idEstatus;

    @Column(name = "ID_TURNO")
    private Integer idTurno;

    @Column(name = "FEC_INICIO", nullable = false)
    private LocalDate fecInicio;

    @Column(name = "TIM_HORA_INICIO", nullable = false)
    private LocalTime timHoraInicio;

    @Column(name = "NUM_DURACION", nullable = false)
    private Integer numDuracion;

    @Column(name = "FEC_FIN", nullable = false)
    private Date fecFin;

    @Column(name = "TIM_HORA_FIN", nullable = false)
    private LocalTime timHoraFin;

    @Column(name = "NUM_MAXIMO_PARTCIPANTES", nullable = false)
    private Integer numMaximoPartcipantes;

    @Column(name = "DES_TRABAJADOR_SOCIAL", length = 100)
    private String desTrabajadorSocial;

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

    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public Integer getIdGrupoPrograma() {
        return idGrupoPrograma;
    }

    public void setIdGrupoPrograma(Integer idGrupoPrograma) {
        this.idGrupoPrograma = idGrupoPrograma;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public LocalDate getFecInicio() {
        return fecInicio;
    }

    public void setFecInicio(LocalDate fecInicio) {
        this.fecInicio = fecInicio;
    }

    public LocalTime getTimHoraInicio() {
        return timHoraInicio;
    }

    public void setTimHoraInicio(LocalTime timHoraInicio) {
        this.timHoraInicio = timHoraInicio;
    }

    public Integer getNumDuracion() {
        return numDuracion;
    }

    public void setNumDuracion(Integer numDuracion) {
        this.numDuracion = numDuracion;
    }

    public Date getFecFin() {
        return fecFin;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }

    public LocalTime getTimHoraFin() {
        return timHoraFin;
    }

    public void setTimHoraFin(LocalTime timHoraFin) {
        this.timHoraFin = timHoraFin;
    }

    public Integer getNumMaximoPartcipantes() {
        return numMaximoPartcipantes;
    }

    public void setNumMaximoPartcipantes(Integer numMaximoPartcipantes) {
        this.numMaximoPartcipantes = numMaximoPartcipantes;
    }

    public String getDesTrabajadorSocial() {
        return desTrabajadorSocial;
    }

    public void setDesTrabajadorSocial(String desTrabajadorSocial) {
        this.desTrabajadorSocial = desTrabajadorSocial;
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