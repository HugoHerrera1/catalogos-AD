package com.mx.imss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mx.imss.model.Turno;

@Repository
public interface TurnoRepositorio extends JpaRepository<Turno, Long>{	
	@Query("select n from Turno n where  n.indActivo=1")
	List<Turno> findByTurno();

	@Query("select n from Turno n where  n.indActivo=1 and n.id=?1")
	List<Turno> findByCveTurno(int cveTurno);
	
}
