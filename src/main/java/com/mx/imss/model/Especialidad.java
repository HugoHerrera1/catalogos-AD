package com.mx.imss.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adts_especialidades")
public class Especialidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cve_especialidad")
	private String cve_especialidad;
	
	@Column(name = "des_clave_especialidad", length = 255, nullable = false)
	private String des_clave_especialidad;
	

	@Column(name = "des_especialidad", length = 70, nullable = false)
	private String des_especialidad;

	@Column(name = "ind_ce")
	private Long ind_ce;
	
	@Column(name = "ind_iq")
	private Long ind_iq;
	
	@Column(name = "ind_hospital")
	private Long ind_hospital;
	
	@Column(name = "ind_nivel1")
	private Long ind_nivel1;
	
	@Column(name = "ind_nivel2")
	private Long ind_nivel2;
	
	@Column(name = "ind_nivel3")
	private Long ind_nivel3;
	
	@Column(name = "ind_css")
	private Long ind_css;
	
	@Column(name = "fec_baja")
	private Date fec_baja;
	
	
	@Column(name = "fec_alta")
	private Date fec_alta;
	
	@Column(name = "fec_actualizacion")
	private Date fec_actualizacion;
	
	@Column(name = "ind_activo")
	private Long ind_activo;
	
	
	

	public Especialidad() {

	}
	
	public Especialidad(String cve_especialidad, String des_especialidad,Long ind_ce,Long ind_hospital,Long ind_iq,
			Long ind_nivel1,Long ind_nivel2, Long ind_nivel3, Long ind_css,Date fec_baja,Date fec_alta,Date fec_actualizacion,Long ind_activo,String des_clave_especialidad ) {
		super();
		this.cve_especialidad = cve_especialidad;
		this.des_especialidad = des_especialidad;
		this.ind_ce = ind_ce;
		this.ind_hospital = ind_hospital;
		this.ind_iq = ind_iq;
		this.ind_nivel1 = ind_nivel1;
		this.ind_nivel2 = ind_nivel2;
		this.ind_nivel3 = ind_nivel3;
		this.ind_css = ind_css;
		this.fec_baja = fec_baja;
		this.fec_alta = fec_alta;
		this.fec_actualizacion = fec_actualizacion;
		this.ind_activo=ind_activo;
	}



	public Long getInd_activo() {
		return ind_activo;
	}

	public void setInd_activo(Long ind_activo) {
		this.ind_activo = ind_activo;
	}

	public String getCve_especialidad() {
		return cve_especialidad;
	}

	public void setCve_especialidad(String cve_especialidad) {
		this.cve_especialidad = cve_especialidad;
	}

	public String getDes_especialidad() {
		return des_especialidad;
	}

	public void setDes_especialidad(String des_especialidad) {
		this.des_especialidad = des_especialidad;
	}

	public Long getInd_ce() {
		return ind_ce;
	}

	public void setInd_ce(Long ind_ce) {
		this.ind_ce = ind_ce;
	}

	public Long getInd_iq() {
		return ind_iq;
	}

	public void setInd_iq(Long ind_iq) {
		this.ind_iq = ind_iq;
	}

	public Long getInd_hospital() {
		return ind_hospital;
	}

	public void setInd_hospital(Long ind_hospital) {
		this.ind_hospital = ind_hospital;
	}

	public Long getInd_nivel1() {
		return ind_nivel1;
	}

	public void setInd_nivel1(Long ind_nivel1) {
		this.ind_nivel1 = ind_nivel1;
	}

	public Long getInd_nivel2() {
		return ind_nivel2;
	}

	public void setInd_nivel2(Long ind_nivel2) {
		this.ind_nivel2 = ind_nivel2;
	}

	public Long getInd_nivel3() {
		return ind_nivel3;
	}

	public void setInd_nivel3(Long ind_nivel3) {
		this.ind_nivel3 = ind_nivel3;
	}

	public Long getInd_css() {
		return ind_css;
	}

	public void setInd_css(Long ind_css) {
		this.ind_css = ind_css;
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


	


}



