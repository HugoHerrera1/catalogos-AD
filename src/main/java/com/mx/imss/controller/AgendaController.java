package com.mx.imss.controller;

import java.util.List;

//import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.imss.excepciones.ResourceNotFoundException;
import com.mx.imss.model.CalendarioAnual;
import com.mx.imss.model.Especialidad;
import com.mx.imss.model.Programa;
import com.mx.imss.model.Responsables;
import com.mx.imss.model.Turno;
import com.mx.imss.model.Ubicacion;
import com.mx.imss.model.DiagnosticosMedicos;
import com.mx.imss.repository.CalendarioAnualRepositorio;
import com.mx.imss.repository.EspecialidadRepositorio;
import com.mx.imss.repository.ProgramaRepositorio;
import com.mx.imss.repository.ResponsablesRepositorio;
import com.mx.imss.repository.TurnoRepositorio;
import com.mx.imss.repository.UbicacionRepositorio;
import com.mx.imss.repository.DiagnosticosMedicosRepositorio;
import com.mx.imss.utility.Crypto;
import com.mx.imss.utility.Mensaje;


@RestController
@RequestMapping("/api/")
@CrossOrigin(origins="http://localhost:4200/")
public class AgendaController {
	
	private final static Logger logger = LoggerFactory.getLogger(AgendaController.class);
	
	Crypto crypto = new Crypto();
	
	@Autowired
	private EspecialidadRepositorio especialidadRepositorio;

	@Autowired
	private TurnoRepositorio turno;
	
	@Autowired
	private ProgramaRepositorio programa;
	
	@Autowired
	private ResponsablesRepositorio responsables;
	
	@Autowired
	private UbicacionRepositorio ubicacion;
	
	@Autowired
	private CalendarioAnualRepositorio calendario;
	
	@Autowired
	private DiagnosticosMedicosRepositorio diagnosticos;

	
	@GetMapping("/listservicios")
	public List<Especialidad> listservicios(){	
		return especialidadRepositorio.findByEspecialidad();
	} 
	
	@GetMapping("/listEspecialidad/{especialidad}")
	public List<Especialidad> listEspecialidad(@PathVariable String especialidad){	
		return especialidadRepositorio.findByCvEspecialidad(especialidad);
	} 
	@GetMapping("/listTurnos")
	public List<Turno> listTurnos(){	
		return turno.findByTurno();
	}

	@GetMapping("/listTurnose/{cveturno}")
	public List<Turno> listTurnosb(@PathVariable Long cveturno){
		return turno.findByCveTurno(cveturno);
	}
	@GetMapping("/listPrograma/{especialidad}")
	public List<Programa> listPrograma(@PathVariable String especialidad){	
		return programa.findByPrograma(especialidad);
	}	
	
	@GetMapping("/listResponsables/{ubicacion}/{turno}")
	public List<Responsables> listResponsables(@PathVariable String ubicacion,@PathVariable Long turno){	
		return responsables.findByResponsables(ubicacion,turno);
	}	

	
	@GetMapping("/listUbicacion/{especialidad}")
	public List<Ubicacion> listUbicacion(@PathVariable String especialidad){	
		return ubicacion.findByUbicacion(especialidad);
	}
	
	@GetMapping("/listCalendario")
	public List<CalendarioAnual> listCalendario(){	
		return calendario.findByCalendario();
	}
	
	@GetMapping("/listCalendarioAnual/{programa}/{ubicacion}")
	public List<CalendarioAnual> listCalendarioAnual(@PathVariable String programa,@PathVariable String ubicacion){	
		return calendario.findByCalendarioAnual(programa,ubicacion);
	}
	
	@GetMapping("/listDiagnosticos/{cadena}")
	public List<DiagnosticosMedicos> listDiagnosticos(@PathVariable String cadena){	
		return diagnosticos.findDiagnosticosByDesc(cadena);
	}
	
	/*@GetMapping("/listUbicaciones/{especialidad}/{cve_tipo_unidad_medica}/{cve_nivel}/{cve_unidad_medica}")
	public List<Ubicacion> listUbicaciones(@PathVariable Long especialidad,@PathVariable Long cve_tipo_unidad_medica,@PathVariable Long cve_nivel,@PathVariable Long cve_unidad_medica){	
		return ubicacion.findByUbr(especialidad,cve_tipo_unidad_medica,cve_nivel,cve_unidad_medica);
	}
	
	*/
}
