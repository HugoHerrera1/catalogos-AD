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
@Table(name = "adts_turnos")
public class Turno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cve_turno")
	private Long cve_turno;

	@Column(name = "des_turno", length = 45, nullable = false)
	private String des_turno;


		
	@Column(name = "fec_baja")
	private Date fec_baja;
	
	
	@Column(name = "fec_alta")
	private Date fec_alta;
	
	@Column(name = "fec_actualizacion")
	private Date fec_actualizacion;
	
	@Column(name = "ind_activo")
	private Long ind_activo;
	public Turno() {

	}
	
	public Turno(Long cve_turno, String des_turno,Date fec_baja,Date fec_alta,Date fec_actualizacion,Long ind_activo ) {
		super();
		this.cve_turno = cve_turno;
		this.des_turno = des_turno;
		this.fec_baja = fec_baja;
		this.fec_alta = fec_alta;
		this.fec_actualizacion = fec_actualizacion;
		this.ind_activo=ind_activo;
	}

	
	public Long getCve_turno() {
		return cve_turno;
	}

	public void setCve_turno(Long cve_turno) {
		this.cve_turno = cve_turno;
	}

	public String getDes_turno() {
		return des_turno;
	}

	public void setDes_turno(String des_turno) {
		this.des_turno = des_turno;
	}

	public Long getInd_activo() {
		return ind_activo;
	}

	public void setInd_activo(Long ind_activo) {
		this.ind_activo = ind_activo;
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



