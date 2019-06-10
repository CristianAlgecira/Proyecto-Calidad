package co.edu.usta.persistence.finanzas;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "plan_contable", schema = "finanzas")
public class PlanContable implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "codigo", nullable = false)
    private int codigo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 30)
    private String descripcion;

    @Column(name = "tipo", nullable = false)
    private int tipo;

    @Column(name = "vigencia", nullable = false)
    private Date vigencia;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_padre", nullable = false)
    private PlanContable padre;

    public PlanContable() {



    }

    public PlanContable(String nombre, String descripcion, int tipo, Date vigencia, PlanContable padre) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.vigencia = vigencia;
        this.padre = padre;

    }

    public int getCodigo() {

        return codigo;

    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getDescripcion() {

        return descripcion;

    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;

    }

    public int getTipo() {

        return tipo;

    }

    public void setTipo(int tipo) {

        this.tipo = tipo;

    }

    public Date getVigencia() {

        return vigencia;

    }

    public void setVigencia(Date vigencia) {

        this.vigencia = vigencia;

    }

    public PlanContable getPadre() {

        return padre;

    }

    public void setPadre(PlanContable padre) {

        this.padre = padre;

    }

}
