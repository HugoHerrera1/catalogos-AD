package com.mx.imss.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adts_grupos_programas")
public class Programa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cve_grupo_programa")
	private Long cve_grupo_programa;
	
	@Column(name = "des_grupo_programa")
	private String des_grupo_programa;
	

	@Column(name = "des_actividad", length = 15, nullable = false)
	private String des_actividad;
	
	@Column(name = "des_codigo", length = 15, nullable = false)
	private String des_codigo;

	
	
	@Column(name = "fec_baja")
	private Date fec_baja;
	
	
	@Column(name = "fec_alta")
	private Date fec_alta;
	
	@Column(name = "fec_modificacion")
	private Date fec_modificacion;
	
	@Column(name = "ind_activo")
	private Long ind_activo;
	
	@Column(name = "cve_especialidad")
	private String cve_especialidad;
	
	

	public Programa() {

	}
	
	public Programa(Long cve_grupo_programa, String des_grupo_programa,String des_codigo,
			Date fec_baja,Date fec_alta,Date fec_modificacion,Long ind_activo,String cve_especialidad ) {
		super();
		this.cve_grupo_programa = cve_grupo_programa;
		this.des_grupo_programa = des_grupo_programa;
		this.des_codigo = des_codigo;
		this.fec_baja = fec_baja;
		this.fec_alta = fec_alta;
		this.fec_modificacion = fec_modificacion;
		this.ind_activo=ind_activo;
		this.cve_especialidad=cve_especialidad;
	}

	public Long getCve_grupo_programa() {
		return cve_grupo_programa;
	}

	public void setCve_grupo_programa(Long cve_grupo_programa) {
		this.cve_grupo_programa = cve_grupo_programa;
	}

	public String getDes_grupo_programa() {
		return des_grupo_programa;
	}

	public void setDes_grupo_programa(String des_grupo_programa) {
		this.des_grupo_programa = des_grupo_programa;
	}

	public String getDes_actividad() {
		return des_actividad;
	}

	public void setDes_actividad(String des_actividad) {
		this.des_actividad = des_actividad;
	}

	public String getDes_codigo() {
		return des_codigo;
	}

	public void setDes_codigo(String des_codigo) {
		this.des_codigo = des_codigo;
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

	public Date getFec_modificacion() {
		return fec_modificacion;
	}

	public void setFec_modificacion(Date fec_modificacion) {
		this.fec_modificacion = fec_modificacion;
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

	


}



