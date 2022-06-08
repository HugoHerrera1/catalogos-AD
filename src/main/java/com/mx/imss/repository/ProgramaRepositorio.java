package com.mx.imss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mx.imss.model.Programa;
import com.mx.imss.model.Responsables;
import com.mx.imss.model.Turno;


@Repository
public interface ProgramaRepositorio extends JpaRepository<Programa, String>{	
	@Query("select n from Programa n where  n.indActivo=1 and n.id=?1")
	List<Programa> findByPrograma(String especialidad);
	
	
	
	
	
}
