package com.mx.imss.repository;

import com.mx.imss.model.DelegacionMunicipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DelegacionMunicipioRepositorio extends JpaRepository<DelegacionMunicipio,Long> {
    @Query(value = "select adm.ID_DELEGACION_MUNICIPIO , adm.ID_ESTADO , adm.NOM_MUNICIPIO from adtcorebdqa.adtsc_delegacion_municipio adm where adm.ID_ESTADO =?1 and adm.IND_ACTIVO =1;",nativeQuery = true)
    List<DelegacionMunicipio> getDelegacionesByEstado(Long idEstado);
}
