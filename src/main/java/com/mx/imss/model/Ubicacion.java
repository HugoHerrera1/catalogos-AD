package com.mx.imss.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adts_ubicaciones")
public class Ubicacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cve_ubicacion")
	private String cve_ubicacion;
	
	@Column(name = "des_completa_ubicacion")
	private String des_completa_ubicacion;
	

	@Column(name = "des_abreviada_ubicacion", length = 15, nullable = false)
	private String des_abreviada_ubicacion;

	@Column(name = "fec_baja")
	private Date fec_baja;
	
	
	@Column(name = "fec_alta")
	private Date fec_alta;
	
	@Column(name = "fec_actualizacion")
	private Date fec_actualizacion;
	
	@Column(name = "ind_activo")
	private Long ind_activo;
	
	@Column(name = "cve_tipo_unidad_medica")
	private Long cve_tipo_unidad_medica;
	
	
	@Column(name = "cve_nivel")
	private Long cve_nivel;
	
	@Column(name = "cve_especialidad")
	private String cve_especialidad;
	
	@Column(name = "cve_unidad_medica")
	private String cve_unidad_medica;

	public Ubicacion() {

	}
	
	public Ubicacion(String cve_ubicacion, String des_completa_ubicacion,String des_abreviada_ubicacion,
			Date fec_baja,Date fec_alta,Date fec_actualizacion,Long ind_activo,Long cve_tipo_unidad_medica,
			Long cve_nivel,String cve_especialidad,String  cve_unidad_medica) {
		super();
		this.cve_ubicacion = cve_ubicacion;
		this.des_completa_ubicacion = des_completa_ubicacion;
		this.des_abreviada_ubicacion = des_abreviada_ubicacion;
		this.fec_baja = fec_baja;
		this.fec_alta = fec_alta;
		this.fec_actualizacion = fec_actualizacion;
		this.ind_activo=ind_activo;
		this.cve_tipo_unidad_medica=cve_tipo_unidad_medica;
		this.cve_nivel=cve_nivel;
		this.cve_especialidad=cve_especialidad;
		this.cve_unidad_medica=cve_unidad_medica;
		}

	public String getCve_ubicacion() {
		return cve_ubicacion;
	}

	public void setCve_ubicacion(String cve_ubicacion) {
		this.cve_ubicacion = cve_ubicacion;
	}

	public String getDes_completa_ubicacion() {
		return des_completa_ubicacion;
	}

	public void setDes_completa_ubicacion(String des_completa_ubicacion) {
		this.des_completa_ubicacion = des_completa_ubicacion;
	}

	public String getDes_abreviada_ubicacion() {
		return des_abreviada_ubicacion;
	}

	public void setDes_abreviada_ubicacion(String des_abreviada_ubicacion) {
		this.des_abreviada_ubicacion = des_abreviada_ubicacion;
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

	public Long getCve_tipo_unidad_medica() {
		return cve_tipo_unidad_medica;
	}

	public void setCve_tipo_unidad_medica(Long cve_tipo_unidad_medica) {
		this.cve_tipo_unidad_medica = cve_tipo_unidad_medica;
	}

	public Long getCve_nivel() {
		return cve_nivel;
	}

	public void setCve_nivel(Long cve_nivel) {
		this.cve_nivel = cve_nivel;
	}

	public String getCve_especialidad() {
		return cve_especialidad;
	}

	public void setCve_especialidad(String cve_especialidad) {
		this.cve_especialidad = cve_especialidad;
	}

	public String getCve_unidad_medica() {
		return cve_unidad_medica;
	}

	public void setCve_unidad_medica(String cve_unidad_medica) {
		this.cve_unidad_medica = cve_unidad_medica;
	}





	


}