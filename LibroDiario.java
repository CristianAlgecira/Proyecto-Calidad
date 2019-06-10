package co.edu.usta.persistence.finanzas;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "libro_diario", schema = "finanzas")
public class LibroDiario implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "asiento", nullable = false)
    private int asiento;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "valor", nullable = false)
    private Double valor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "periodo_cod", nullable = false)
    private Periodo periodo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "concepto_cod", nullable = false)
    private Concepto concepto;

    @Column(name = "estado", nullable = false)
    private boolean estado;

    public LibroDiario() {



    }

    public LibroDiario(Date fecha, Double valor, Periodo periodo, Concepto concepto, boolean estado) {

        this.fecha = fecha;
        this.valor = valor;
        this.periodo = periodo;
        this.concepto = concepto;
        this.estado = estado;

    }

    public int getAsiento() {

        return asiento;

    }

    public void setAsiento(int asiento) {

        this.asiento = asiento;

    }

    public Date getFecha() {

        return fecha;

    }

    public void setFecha(Date fecha) {

        this.fecha = fecha;

    }

    public Double getValor() {

        return valor;

    }

    public void setValor(Double valor) {

        this.valor = valor;

    }

    public Periodo getPeriodo() {

        return periodo;

    }

    public void setPeriodo(Periodo periodo) {

        this.periodo = periodo;

    }

    public Concepto getConcepto() {

        return concepto;

    }

    public void setConcepto(Concepto concepto) {

        this.concepto = concepto;

    }

    public boolean isEstado() {

        return estado;

    }

    public void setEstado(boolean estado) {

        this.estado = estado;

    }

}
