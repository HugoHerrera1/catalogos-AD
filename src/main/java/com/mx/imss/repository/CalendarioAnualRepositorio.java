package com.mx.imss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mx.imss.model.CalendarioAnual;

@Repository
public interface CalendarioAnualRepositorio extends JpaRepository<CalendarioAnual, Long>{	
	@Query("select n from CalendarioAnual n where  n.indActivo=1")
	List<CalendarioAnual> findByCalendario();

	@Query("select n from CalendarioAnual n where  n.indActivo=1 and n.idGrupoPrograma=?1 and n.idUbicacion=?2 ")
	List<CalendarioAnual>findByCalendarioAnual(String cve_especialidad,String cve_ubicacion);
	
}
