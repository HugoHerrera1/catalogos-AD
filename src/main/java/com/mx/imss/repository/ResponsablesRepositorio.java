package com.mx.imss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mx.imss.model.Responsables;

@Repository
public interface ResponsablesRepositorio extends JpaRepository<Responsables, String>{	
	
	@Query("select n from Responsables n where  n.ind_activo=1 and n.cve_ubicacion =?1 and n.cve_turno =?2")
	List<Responsables> findByResponsables(String Ubicacion,Long cve_turno);
	
}
