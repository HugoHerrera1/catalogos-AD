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
	
	@Column(name = "codigo", nullable = false, length = 5)
	private String codigo;
	
	@Column(name = "a")
	private String a;
	
	@Column(name = "nombre")
	private String nombre;
	
	/*@Column(name = "limite_sexo")
	private String limiteSexo;
	
	@Column(name = "limite_sexo_nece")
	private String limiteSexoNece;
	
	@Column(name = "limite_edad_inferior")
	private String limiteEdadInferior;
	
	@Column(name = "edad_inferior_semanas")
	private String edadInferiorSemanas;
	
	@Column(name = "limite_edad_superior")
	private String limiteEdadSuperior;
	
	@Column(name = "edad_supeiror_semanas")
	private String edadSuperiorSemanas;
	
	@Column(name = "triv")
	private String triv;
	
	@Column(name = "errad")
	private String errad;
	
	@Column(name = "notif_internacional")
	private String notifInternacional;
	
	@Column(name = "notif_obligatoria")
	private String notifObligatoria;
	
	@Column(name = "notif_inmediata")
	private String notifInmediata;
	
	@Column(name = "notif_inm_mortal_obstetricia")
	private String notifInmMortalObstetricia;
	
	@Column(name = "no_valida_causa_basica_def")
	private String noValidaCausaBasicaDef;
	
	@Column(name = "no_valida_afeccion_princ_hosp")
	private String noValidaAfeccionPrincHosp;
	
	@Column(name = "valida_muerte_fetal")
	private String validaMuerteFetal;
	
	@Column(name = "actualizaciones_cie10")
	private String actualizacionesCie10;
	
	@Column(name = "anio_modificacion")
	private String anioModificacion;
	
	@Column(name = "anio_vigencia")
	private String anioVigencia;
	
	@Column(name = "vigente")
	private String vigente;
	
	@Column(name = "catalogo")
	private String catalogo;
	
	@Column(name = "ind_cronica")
	private Integer indCronica;
	
	@Column(name = "cve_aparato")
	private Integer cveAparato;
	
	@Column(name = "ind_transmisible")
	private Integer indTransmisible;
	
	@Column(name = "ind_principal_const_ext")
	private Integer indPrincipalConstExt;

	@Column(name = "ind_nivel1")
	private Integer indnivel1;
	
	@Column(name = "ind_nivel2")
	private Integer indnivel2;
	
	@Column(name = "ind_nivel3")
	private Integer indnivel3;
	
	@Column(name = "renglon")
	private Integer renglon;
	
	@Column(name = "nombreM")
	private String nombreM;
	
	@Column(name = "filtro")
	private String filtro;
	
	@Column(name = "cve_capitulo")
	private String cveCapitulo;

	@Column(name = "cve_grupo")
	private String cveGrupo;
	
	@Column(name = "cve_sub_grupo")
	private String cveSubGrupo;
	
	@Column(name = "cve_categoria")
	private String cveCategoria;
	
	@Column(name = "exclusion")
	private Integer exclusion;
	
	@Column(name = "agrupamiento")
	private Integer agrupamiento;
	
	@Column(name = "consec_codigo")
	private Integer consec_codigo;
	
	@Column(name = "control")
	private Integer control; */
	
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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



