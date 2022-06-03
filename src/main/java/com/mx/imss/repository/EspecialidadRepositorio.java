package com.mx.imss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mx.imss.model.Especialidad;
import com.mx.imss.model.Turno;

@Repository
public interface EspecialidadRepositorio extends JpaRepository<Especialidad, Long>{	
	
	@Query("select n from Especialidad n where  n.ind_activo=1")
	List<Especialidad> findByEspecialidad();
	
	
	@Query("select n from Especialidad n where  n.ind_activo=1 and n.cve_especialidad=?1")
	List<Especialidad> findByCvEspecialidad(String cve_especialidad);
	
}
