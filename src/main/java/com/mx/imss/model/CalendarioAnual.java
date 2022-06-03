package com.mx.imss.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "adts_calendario_anual")
public class CalendarioAnual {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cve_calendario_anual")
	private Long cve_calendario_anual;

	
	@Column(name = "fec_inicio")
	private Date fec_inicio;
	
	@Column(name = "tim_hora_inicio")
	private Time tim_hora_inicio;
	
	@Column(name = "num_duracion")
	private Long num_duracion;
	
	@Column(name = "fec_fin")
	private Date fec_fin;
	
	@Column(name = "tim_hora_fin")
	private Time tim_hora_fin;
	
	@Column(name = "maximo_partcipantes")
	private Long maximo_partcipantes;
	
	@Column(name = "fec_baja")
	private Date fec_baja;
	
	@Column(name = "fec_alta")
	private Date fec_alta;
	
	@Column(name = "fec_actualizacion")
	private Date fec_actualizacion;
	
	@Column(name = "ind_activo")
	private Long ind_activo;
	
	@Column(name = "cve_ubicacion")
	private String cve_ubicacion;
	
	@Column(name = "cve_especialidad")
	private String cve_especialidad;
	

	public CalendarioAnual() {

	}
	
	public CalendarioAnual(Long cve_calendario_anual,Date fec_inicio,Time tim_hora_inicio, Long num_duracion,Date fec_fin,
			Time tim_hora_fin,Long maximo_partcipantes,Date fec_baja,Date fec_alta,Date fec_actualizacion,
			Long ind_activo,String cve_ubicacion,String cve_especialidad) {
		super();
		this.cve_calendario_anual = cve_calendario_anual;
		this.fec_inicio = fec_inicio;
		this.tim_hora_inicio = tim_hora_inicio;
		this.fec_baja = fec_baja;
		this.fec_alta = fec_alta;
		this.num_duracion = num_duracion;
		this.ind_activo=ind_activo;
		this.cve_especialidad=cve_especialidad;
		this.fec_fin=fec_fin;		
		this.tim_hora_fin=tim_hora_fin;
		this.maximo_partcipantes=maximo_partcipantes;
		this.cve_ubicacion=cve_ubicacion;
		this.fec_actualizacion=fec_actualizacion;
		
	}

	public Long getCve_calendario_anual() {
		return cve_calendario_anual;
	}

	public void setCve_calendario_anual(Long cve_calendario_anual) {
		this.cve_calendario_anual = cve_calendario_anual;
	}

	public Date getFec_inicio() {
		return fec_inicio;
	}

	public void setFec_inicio(Date fec_inicio) {
		this.fec_inicio = fec_inicio;
	}

	public Time getTim_hora_inicio() {
		return tim_hora_inicio;
	}

	public void setTim_hora_inicio(Time tim_hora_inicio) {
		this.tim_hora_inicio = tim_hora_inicio;
	}

	public Long getNum_duracion() {
		return num_duracion;
	}

	public void setNum_duracion(Long num_duracion) {
		this.num_duracion = num_duracion;
	}

	public Date getFec_fin() {
		return fec_fin;
	}

	public void setFec_fin(Date fec_fin) {
		this.fec_fin = fec_fin;
	}

	public Time getTim_hora_fin() {
		return tim_hora_fin;
	}

	public void setTim_hora_fin(Time tim_hora_fin) {
		this.tim_hora_fin = tim_hora_fin;
	}

	public Long getMaximo_partcipantes() {
		return maximo_partcipantes;
	}

	public void setMaximo_partcipantes(Long maximo_partcipantes) {
		this.maximo_partcipantes = maximo_partcipantes;
	}

	public Date getFec_baja() {
		return fec_baja;
	}

	public void setFec_baja(Date fec_baja) {
		this.fec_baja = fec_baja;
	}

	public Date getFec_alta() {
		return fec_alta;
	}

	public void setFec_alta(Date fec_alta) {
		this.fec_alta = fec_alta;
	}

	public Date getFec_actualizacion() {
		return fec_actualizacion;
	}

	public void setFec_actualizacion(Date fec_actualizacion) {
		this.fec_actualizacion = fec_actualizacion;
	}

	public Long getInd_activo() {
		return ind_activo;
	}

	public void setInd_activo(Long ind_activo) {
		this.ind_activo = ind_activo;
	}

	public String getCve_ubicacion() {
		return cve_ubicacion;
	}

	public void setCve_ubicacion(String cve_ubicacion) {
		this.cve_ubicacion = cve_ubicacion;
	}

	public String getCve_especialidad() {
		return cve_especialidad;
	}

	public void setCve_especialidad(String cve_especialidad) {
		this.cve_especialidad = cve_especialidad;
	}

	
	


}



