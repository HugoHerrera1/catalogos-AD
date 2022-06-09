package com.mx.imss.repository;

import com.mx.imss.model.CIE10;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CieRepositorio extends JpaRepository<CIE10, Long> {

    @Query(value = "select admc.CVE_CODIGO , admc.ID_DIAGNOSTICO_MEDICO_CIE10 , admc .NOM_DIAGNOSTICO_MEDICO_CIE10  from adtsc_diagnostico_medico_cie10 admc where admc .IND_ACTIVO =1;", nativeQuery = true)
    List<CIE10> getAllCIE();

    @Query(value = "select admc.CVE_CODIGO , admc.ID_DIAGNOSTICO_MEDICO_CIE10 , admc .NOM_DIAGNOSTICO_MEDICO_CIE10  from adtsc_diagnostico_medico_cie10 admc where admc.ID_DIAGNOSTICO_MEDICO_CIE10 = ?1 and admc.IND_ACTIVO =1;",nativeQuery = true)
    CIE10 getDatosById(Integer idDiagnostico);
}
