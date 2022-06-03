package com.mx.imss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mx.imss.model.Programa;
import com.mx.imss.model.Ubicacion;

@Repository
public interface UbicacionRepositorio extends JpaRepository<Ubicacion, String>{	
	@Query("select n from Ubicacion n where  n.ind_activo=1 and n.cve_especialidad=?1")
	List<Ubicacion> findByUbicacion(String cve_especialidad);
	
	/*@Query("select n from Ubicacion  where  ind_activo=1 and n.cve_especialidad=?1 and n.cve_tipo_unidad_medica=?1 and n.cve_nivel=?1 and n.cve_unidad_medica=?1 ")
	List<Ubicacion> findByUbr(String especialidad,Long cve_tipo_unidad_medica,Long cve_nivel,Long cve_unidad_medica);
	*/
}
