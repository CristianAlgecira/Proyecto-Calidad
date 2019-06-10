package co.edu.usta.persistence.nomina;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class NominaPK implements Serializable {

    private int contrato;
    private int concepto;
    private int periodo;

    public NominaPK() {



    }

    public NominaPK(int contrato, int concepto, int periodo) {

        this.contrato = contrato;
        this.concepto = concepto;
        this.periodo = periodo;

    }

    public int getContrato() {

        return contrato;

    }

    public void setContrato(int contrato) {

        this.contrato = contrato;

    }

    public int getConcepto() {

        return concepto;

    }

    public void setConcepto(int concepto) {

        this.concepto = concepto;

    }

    public int getPeriodo() {

        return periodo;

    }

    public void setPeriodo(int periodo) {

        this.periodo = periodo;

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NominaPK nominaPK = (NominaPK) o;
        return contrato == nominaPK.contrato &&
                concepto == nominaPK.concepto &&
                periodo == nominaPK.periodo;

    }

    @Override
    public int hashCode() {

        return Objects.hash(contrato, concepto, periodo);

    }

}
