package co.edu.usta.persistence.finanzas;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "libro_mayor", schema = "finanzas")
public class LibroMayor implements Serializable {

    @EmbeddedId
    private LibroMayorPK codigo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "plan_contable_cod", nullable = false)
    @MapsId("planContable")
    private PlanContable planContable;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "periodo_cod", nullable = false)
    @MapsId("periodo")
    private Periodo periodo;

    @Column(name = "debe", nullable = false)
    private Double debe;

    @Column(name = "haber", nullable = false)
    private Double haber;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "estado", nullable = false)
    private boolean estado;

    public LibroMayor() {



    }

    public LibroMayor(PlanContable planContable, Periodo periodo, Double debe, Double haber, Date fecha, boolean estado) {

        this.planContable = planContable;
        this.periodo = periodo;
        this.debe = debe;
        this.haber = haber;
        this.fecha = fecha;
        this.estado = estado;

    }

    public LibroMayor(LibroMayorPK codigo, PlanContable planContable, Periodo periodo, Double debe, Double haber, Date fecha, boolean estado) {

        this.codigo = codigo;
        this.planContable = planContable;
        this.periodo = periodo;
        this.debe = debe;
        this.haber = haber;
        this.fecha = fecha;
        this.estado = estado;

    }

    public LibroMayorPK getCodigo() {

        return codigo;

    }

    public void setCodigo(LibroMayorPK codigo) {

        this.codigo = codigo;

    }

    public PlanContable getPlanContable() {

        return planContable;

    }

    public void setPlanContable(PlanContable planContable) {

        this.planContable = planContable;

    }

    public Periodo getPeriodo() {

        return periodo;

    }

    public void setPeriodo(Periodo periodo) {

        this.periodo = periodo;

    }

    public Double getDebe() {

        return debe;

    }

    public void setDebe(Double debe) {

        this.debe = debe;

    }

    public Double getHaber() {

        return haber;

    }

    public void setHaber(Double haber) {

        this.haber = haber;

    }

    public Date getFecha() {

        return fecha;

    }

    public void setFecha(Date fecha) {

        this.fecha = fecha;

    }

    public boolean isEstado() {

        return estado;

    }

    public void setEstado(boolean estado) {

        this.estado = estado;

    }

}
