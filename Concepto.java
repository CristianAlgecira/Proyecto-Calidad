package co.edu.usta.persistence.nomina;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "concepto", schema = "nomina")
public class Concepto implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "codigo", nullable = false)
    private int codigo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;

    @Column(name = "tipo", nullable = false)
    private boolean tipo;

    @Column(name = "formula", nullable = false, length = 100)
    private String formula;

    @Column(name = "estado", nullable = false)
    private boolean estado;

    public Concepto() {



    }

    public Concepto(String nombre, String descripcion, boolean tipo, String formula, boolean estado) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.formula = formula;
        this.estado = estado;

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

    public boolean isTipo() {

        return tipo;

    }

    public void setTipo(boolean tipo) {

        this.tipo = tipo;

    }

    public String getFormula() {

        return formula;

    }

    public void setFormula(String formula) {

        this.formula = formula;

    }

    public boolean isEstado() {

        return estado;

    }

    public void setEstado(boolean estado) {

        this.estado = estado;

    }

}
