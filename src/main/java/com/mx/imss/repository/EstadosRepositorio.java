package com.mx.imss.repository;

import com.mx.imss.model.Estados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadosRepositorio  extends JpaRepository<Estados,Long> {
    @Query(value = "select ae.ID_ESTADO, ae.NOM_COMPLETO , ae.NOM_ABREVIADO  from adtsc_estados ae  where ae .IND_ACTIVO = 1;",nativeQuery = true)
    List<Estados> getAllEstados ();

    @Query(value = "select ae.ID_ESTADO, ae.NOM_COMPLETO , ae.NOM_ABREVIADO  from adtsc_estados ae  where ae.ID_ESTADO = ?1 and ae.IND_ACTIVO = 1;",nativeQuery = true)
    Estados getEstadoById(Integer idEstado);
}
