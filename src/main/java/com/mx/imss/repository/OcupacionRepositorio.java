package com.mx.imss.repository;

import com.mx.imss.model.Ocupacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OcupacionRepositorio extends JpaRepository<Ocupacion,Long> {
    @Query(value = "select ao.ID_OCUPACION ,ao.NOM_OCUPACION from adtsc_ocupaciones ao where ao.ID_OCUPACION =?1 and ao.IND_ACTIVO = 1;",nativeQuery = true)
    Ocupacion getOcupacionByID(Long idOcupacion);
}
