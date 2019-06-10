package co.edu.usta.persistence.nomina;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "nomina", schema = "nomina")
public class Nomina implements Serializable {

    @EmbeddedId
    private NominaPK codigo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "contrato_cod", nullable = false)
    @MapsId("contrato")
    private Contrato contrato;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "concepto_cod", nullable = false)
    @MapsId("concepto")
    private Concepto concepto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "periodo_cod", nullable = false)
    @MapsId("periodo")
    private Periodo periodo;

    @Column(name = "valor", nullable = false)
    private int valor;

    @Column(name = "usuario_insert", nullable = false, length = 100)
    private String usuarioInsert;

    @Column(name = "fecha_insert", nullable = false, length = 100)
    private String fechaInsert;

    @Column(name = "usuario_update", nullable = false, length = 100)
    private String usuarioUpdate;

    @Column(name = "fecha_update", nullable = false, length = 100)
    private String fechaUpdate;

    public Nomina() {



    }

    public Nomina(Contrato contrato, Concepto concepto, Periodo periodo, int valor, String usuarioInsert, String fechaInsert, String usuarioUpdate, String fechaUpdate) {

        this.contrato = contrato;
        this.concepto = concepto;
        this.periodo = periodo;
        this.valor = valor;
        this.usuarioInsert = usuarioInsert;
        this.fechaInsert = fechaInsert;
        this.usuarioUpdate = usuarioUpdate;
        this.fechaUpdate = fechaUpdate;

    }

    public Nomina(NominaPK codigo, Contrato contrato, Concepto concepto, Periodo periodo, int valor, String usuarioInsert, String fechaInsert, String usuarioUpdate, String fechaUpdate) {

        this.codigo = codigo;
        this.contrato = contrato;
        this.concepto = concepto;
        this.periodo = periodo;
        this.valor = valor;
        this.usuarioInsert = usuarioInsert;
        this.fechaInsert = fechaInsert;
        this.usuarioUpdate = usuarioUpdate;
        this.fechaUpdate = fechaUpdate;

    }

    public NominaPK getCodigo() {

        return codigo;

    }

    public void setCodigo(NominaPK codigo) {

        this.codigo = codigo;

    }

    public Contrato getContrato() {

        return contrato;

    }

    public void setContrato(Contrato contrato) {

        this.contrato = contrato;

    }

    public Concepto getConcepto() {

        return concepto;

    }

    public void setConcepto(Concepto concepto) {

        this.concepto = concepto;

    }

    public Periodo getPeriodo() {

        return periodo;

    }

    public void setPeriodo(Periodo periodo) {

        this.periodo = periodo;

    }

    public int getValor() {

        return valor;

    }

    public void setValor(int valor) {

        this.valor = valor;

    }

    public String getUsuarioInsert() {

        return usuarioInsert;

    }

    public void setUsuarioInsert(String usuarioInsert) {

        this.usuarioInsert = usuarioInsert;

    }

    public String getFechaInsert() {

        return fechaInsert;

    }

    public void setFechaInsert(String fechaInsert) {

        this.fechaInsert = fechaInsert;

    }

    public String getUsuarioUpdate() {

        return usuarioUpdate;

    }

    public void setUsuarioUpdate(String usuarioUpdate) {

        this.usuarioUpdate = usuarioUpdate;

    }

    public String getFechaUpdate() {

        return fechaUpdate;

    }

    public void setFechaUpdate(String fechaUpdate) {

        this.fechaUpdate = fechaUpdate;

    }

}
