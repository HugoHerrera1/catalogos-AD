package com.mx.imss.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "adtcorebdqa.adtsc_diagnostico_medico_cie10")
public class CIE10 {

    @Id
    @Column(name = "CVE_CODIGO", nullable = false)
    private String cveCodigo;
    @Column(name = "NOM_DIAGNOSTICO_MEDICO_CIE10", nullable = false)
    private String nDiagnosticoMedicoCie;

    public String getCveCodigo() {
        return cveCodigo;
    }

    public void setCveCodigo(String cveCodigo) {
        this.cveCodigo = cveCodigo;
    }
    public String getnDiagnosticoMedicoCie() {
        return nDiagnosticoMedicoCie;
    }

    public void setnDiagnosticoMedicoCie(String nDiagnosticoMedicoCie) {
        this.nDiagnosticoMedicoCie = nDiagnosticoMedicoCie;
    }

}
