package co.edu.usta.persistence.finanzas;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LibroMayorPK implements Serializable {

    private int planContable;
    private int periodo;

    public LibroMayorPK() {



    }

    public LibroMayorPK(int planContable, int periodo) {

        this.planContable = planContable;
        this.periodo = periodo;

    }

    public int getPlanContable() {

        return planContable;

    }

    public void setPlanContable(int planContable) {

        this.planContable = planContable;

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
        LibroMayorPK that = (LibroMayorPK) o;
        return planContable == that.planContable &&
                periodo == that.periodo;

    }

    @Override
    public int hashCode() {

        return Objects.hash(planContable, periodo);

    }

}
