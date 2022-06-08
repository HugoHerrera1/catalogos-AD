package com.mx.imss.repository;

import com.mx.imss.model.CIE10;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CieRepositorio extends JpaRepository<CIE10,Long> {

    @Query(value = "select admc.CVE_CODIGO , admc .NOM_DIAGNOSTICO_MEDICO_CIE10  from adtcorebdqa.adtsc_diagnostico_medico_cie10 admc where admc .IND_ACTIVO =1;",nativeQuery = true)
List<CIE10> getAllCIE();
}
