package com.mx.imss.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "adts_responsables")
public class Responsables {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cve_responsable")
	private Long cve_responsable;
	
	@Column(name = "des_matricula")
	private String des_matricula;
	

	@Column(name = "nom_nombre", length = 15, nullable = false)
	private String nom_nombre;

	@Column(name = "fec_baja")
	private Date fec_baja;
	
	
	@Column(name = "fec_alta")
	private Date fec_alta;
	
	@Column(name = "fec_actualizacion")
	private Date fec_actualizacion;
	
	@Column(name = "ind_activo")
	private Long ind_activo;
	
	@Column(name = "cve_tipo_ubicacion")
	private Long cve_tipo_ubicacion;
	
	
	@Column(name = "cve_turno")
	private Long cve_turno;
	
	
	@Column(name = "cve_ubicacion")
	private String cve_ubicacion;

	public Responsables() {

	}
	
	public Responsables(Long cve_responsable, String des_matricula,String nom_nombre,
			Date fec_baja,Date fec_alta,Date fec_actualizacion,Long ind_activo,Long cve_tipo_ubicacion,Long cve_turno,String cve_ubicacion ) {
		super();
		this.cve_responsable = cve_responsable;
		this.des_matricula = des_matricula;
		this.nom_nombre = nom_nombre;
		this.fec_baja = fec_baja;
		this.fec_alta = fec_alta;
		this.fec_actualizacion = fec_actualizacion;
		this.ind_activo=ind_activo;
		this.cve_tipo_ubicacion=cve_tipo_ubicacion;
		this.cve_turno=cve_turno;
		this.cve_ubicacion=cve_ubicacion;
	}

	public String getCve_ubicacion() {
		return cve_ubicacion;
	}

	public void setCve_ubicacion(String cve_ubicacion) {
		this.cve_ubicacion = cve_ubicacion;
	}

	public Long getCve_responsable() {
		return cve_responsable;
	}

	public void setCve_responsable(Long cve_responsable) {
		this.cve_responsable = cve_responsable;
	}

	public String getDes_matricula() {
		return des_matricula;
	}

	public void setDes_matricula(String des_matricula) {
		this.des_matricula = des_matricula;
	}

	public String getNom_nombre() {
		return nom_nombre;
	}

	public void setNom_nombre(String nom_nombre) {
		this.nom_nombre = nom_nombre;
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

	public Long getCve_tipo_ubicacion() {
		return cve_tipo_ubicacion;
	}

	public void setCve_tipo_ubicacion(Long cve_tipo_ubicacion) {
		this.cve_tipo_ubicacion = cve_tipo_ubicacion;
	}

	public Long getCve_turno() {
		return cve_turno;
	}

	public void setCve_turno(Long cve_turno) {
		this.cve_turno = cve_turno;
	}



	


}



