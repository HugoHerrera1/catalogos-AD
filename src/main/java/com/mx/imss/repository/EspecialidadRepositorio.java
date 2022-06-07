package com.mx.imss.repository;

import java.util.List;

import com.mx.imss.model.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepositorio extends JpaRepository<Especialidad, Long>{	
	
	@Query("select n from Especialidad n where  n.indActivo=1")
	List<Especialidad> findByEspecialidad();
	
	
	@Query("select n from Especialidad n where  n.indActivo=1 and n.id=?1")
	List<Especialidad> findByCvEspecialidad(String cve_especialidad);
	
}
