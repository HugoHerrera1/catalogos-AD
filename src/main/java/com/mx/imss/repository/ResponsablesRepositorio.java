package com.mx.imss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mx.imss.model.Responsables;

@Repository
public interface ResponsablesRepositorio extends JpaRepository<Responsables, String>{	
	
	@Query("select n from Responsables n where  n.indActivo=1 and n.idUbicacion =?1 and n.idTurno =?2")
	List<Responsables> findByResponsables(String Ubicacion,Long cve_turno);
	
}
