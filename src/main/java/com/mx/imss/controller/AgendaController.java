package com.mx.imss.controller;

import com.mx.imss.model.*;
import com.mx.imss.repository.*;
import com.mx.imss.utility.Crypto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;


@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "http://localhost:4200/")
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
    private CieRepositorio cie;

    @Autowired
    private EstadosRepositorio estados;

    @Autowired
    private DelegacionMunicipioRepositorio delegacionMunicipio;

    @Autowired
    private CiudadesRepositorio ciudades;

//	@Autowired
//	private DiagnosticosMedicosRepositorio diagnosticos;

    // eflofe
    @GetMapping("/getCatalogoCie")
    public List<CIE10> listCie() {
        return cie.getAllCIE();
    }

    @GetMapping("/listEstados")
    public List<Estados> listEstados() {
        return estados.getAllEstados();
    }

    @GetMapping("/getDelegacionMunicipio/{idEstado}")
    public List<DelegacionMunicipio> listDelegacion(@PathVariable Long idEstado) {
        return delegacionMunicipio.getDelegacionesByEstado(idEstado);
    }

    @GetMapping("/getCiudades/{idEstado}/{idDelegacion}")
    public List<Ciudades> listCiudades(@PathVariable Integer idEstado, @PathVariable Integer idDelegacion) {
        return ciudades.getCiudadesByEstadoAndMunicipio(idEstado, idDelegacion);
    }

    @GetMapping("/getNombreDiagnostico/{idDiagnostico}")
    public ResponseEntity getNombreDiagnostico(@PathVariable Integer idDiagnostico) {
        return new ResponseEntity<>(cie.getDatosById(idDiagnostico), HttpStatus.OK);
    }

    // fin eflofe
    @GetMapping("/listservicios")
    public List<Especialidad> listservicios() {
        return especialidadRepositorio.findByEspecialidad();
    }

    @GetMapping("/listEspecialidad/{especialidad}")
    public List<Especialidad> listEspecialidad(@PathVariable String especialidad) {
        return especialidadRepositorio.findByCvEspecialidad(especialidad);
    }

    @GetMapping("/listTurnos")
    public List<Turno> listTurnos() {
        return turno.findByTurno();
    }

    @GetMapping("/listTurnose/{cveturno}")
    public List<Turno> listTurnosb(@PathVariable int cveturno) {
        return turno.findByCveTurno(cveturno);
    }

    @GetMapping("/listPrograma/{idGrupo}")
    public List<Programa> listPrograma(@PathVariable Integer idGrupo) {
        return programa.findByPrograma(idGrupo);
    }

    @GetMapping("/listResponsables/{ubicacion}/{turno}")
    public List<Responsables> listResponsables(@PathVariable String ubicacion, @PathVariable Long turno) {
        return responsables.findByResponsables(ubicacion, turno);
    }


    @GetMapping("/listUbicacion/{idUbicacion}")
    public List<Ubicacion> listUbicacion(@PathVariable Integer idUbicacion) {
        return ubicacion.findByUbicacion(idUbicacion);
    }

    @GetMapping("/listCalendario")
    public List<CalendarioAnual> listCalendario() {
        return calendario.findByCalendario();
    }

    @GetMapping("/listCalendarioAnual/{programa}/{ubicacion}")
    public List<CalendarioAnual> listCalendarioAnual(@PathVariable String programa, @PathVariable String ubicacion) {
        return calendario.findByCalendarioAnual(programa, ubicacion);
    }

//	@GetMapping("/listDiagnosticos/{cadena}")
//	public List<DiagnosticosMedicos> listDiagnosticos(@PathVariable String cadena){
//		return diagnosticos.findDiagnosticosByDesc(cadena);
//	}
	
	/*@GetMapping("/listUbicaciones/{especialidad}/{cve_tipo_unidad_medica}/{cve_nivel}/{cve_unidad_medica}")
	public List<Ubicacion> listUbicaciones(@PathVariable Long especialidad,@PathVariable Long cve_tipo_unidad_medica,@PathVariable Long cve_nivel,@PathVariable Long cve_unidad_medica){	
		return ubicacion.findByUbr(especialidad,cve_tipo_unidad_medica,cve_nivel,cve_unidad_medica);
	}
	
	*/


}
