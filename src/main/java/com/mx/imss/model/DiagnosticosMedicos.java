package com.mx.imss.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adts_diagnosticos_medicos")
public class DiagnosticosMedicos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_diagnostico")
	private Long id_diagnostico;
	
	@Column(name = "cve_diagnostico", nullable = false, length = 5)
	private String cve_diagnostico;
	
	@Column(name = "des_diagnostico")
	private String des_diagnostico;
	
	@Column(name = "fec_baja")
	private Date fec_baja;
	
	@Column(name = "fec_alta")
	private Date fec_alta;
	
	@Column(name = "fec_actualizacion")
	private Date fec_actualizacion;
	
	@Column(name = "ind_activo")
	private Long ind_activo;

	public Long getId_diagnostico() {
		return id_diagnostico;
	}

	public void setId_diagnostico(Long id_diagnostico) {
		this.id_diagnostico = id_diagnostico;
	}

	public String getCve_diagnostico() {
		return cve_diagnostico;
	}

	public void setCve_diagnostico(String cve_diagnostico) {
		this.cve_diagnostico = cve_diagnostico;
	}

	public String getDes_diagnostico() {
		return des_diagnostico;
	}

	public void setDes_diagnostico(String des_diagnostico) {
		this.des_diagnostico = des_diagnostico;
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

}



