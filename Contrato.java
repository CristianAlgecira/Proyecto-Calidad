package co.edu.usta.persistence.nomina;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "contrato", schema = "nomina")
public class Contrato implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "codigo", nullable = false)
    private int codigo;

    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private Date fechaFin;

    @Column(name = "salario", nullable = false)
    private int salario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hoja_vida_doc", nullable = false)
    private HojaVida hojaVida;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dependencia_cod", nullable = false)
    private Dependencia dependencia;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cargo_cod", nullable = false)
    private Cargo cargo;

    public Contrato() {



    }

    public Contrato(Date fechaInicio, Date fechaFin, int salario, HojaVida hojaVida, Dependencia dependencia, Cargo cargo) {

        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.salario = salario;
        this.hojaVida = hojaVida;
        this.dependencia = dependencia;
        this.cargo = cargo;

    }

    public int getCodigo() {

        return codigo;

    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;

    }

    public Date getFechaInicio() {

        return fechaInicio;

    }

    public void setFechaInicio(Date fechaInicio) {

        this.fechaInicio = fechaInicio;

    }

    public Date getFechaFin() {

        return fechaFin;

    }

    public void setFechaFin(Date fechaFin) {

        this.fechaFin = fechaFin;

    }

    public int getSalario() {

        return salario;

    }

    public void setSalario(int salario) {

        this.salario = salario;

    }

    public HojaVida getHojaVida() {

        return hojaVida;

    }

    public void setHojaVida(HojaVida hojaVida) {

        this.hojaVida = hojaVida;

    }

    public Dependencia getDependencia() {

        return dependencia;

    }

    public void setDependencia(Dependencia dependencia) {

        this.dependencia = dependencia;

    }

    public Cargo getCargo() {

        return cargo;

    }

    public void setCargo(Cargo cargo) {

        this.cargo = cargo;

    }

}
