package com.mx.imss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mx.imss.model.DiagnosticosMedicos;

@Repository
public interface DiagnosticosMedicosRepositorio extends JpaRepository<DiagnosticosMedicos, String>{	
	
	@Query("select n from DiagnosticosMedicos n where n.nombre like upper(?1) and n.ind_activo = 1")
	List<DiagnosticosMedicos> findDiagnosticosByDesc(String texto);
	
}
