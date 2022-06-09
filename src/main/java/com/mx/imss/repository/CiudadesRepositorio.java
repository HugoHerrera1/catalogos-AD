package com.mx.imss.repository;

import com.mx.imss.model.Ciudades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CiudadesRepositorio extends JpaRepository<Ciudades,Long> {
    @Query(value = "select ac.ID_CIUDAD, ac.ID_ESTADO, ac.ID_DELEGACION_MUNICIPIO, ac.NOM_CIUDAD  from adtsc_ciudades ac where ac.ID_ESTADO = ?1 and ac.ID_DELEGACION_MUNICIPIO = ?2 and ac.IND_ACTIVO = 1;", nativeQuery = true)
    List<Ciudades> getCiudadesByEstadoAndMunicipio(Integer idEstado, Integer idDelegacion);
}
