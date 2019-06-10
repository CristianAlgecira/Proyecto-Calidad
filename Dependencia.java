package co.edu.usta.persistence.nomina;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dependencia", schema = "nomina")
public class Dependencia implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "codigo", nullable = false)
    private int codigo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dependencia_padre", nullable = false)
    private Dependencia padre;

    @Column(name = "estado", nullable = false)
    private boolean estado;

    public Dependencia() {



    }

    public Dependencia(String nombre, Dependencia padre, boolean estado) {

        this.nombre = nombre;
        this.padre = padre;
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

    public Dependencia getPadre() {

        return padre;

    }

    public void setPadre(Dependencia padre) {

        this.padre = padre;

    }

    public boolean isEstado() {

        return estado;

    }

    public void setEstado(boolean estado) {

        this.estado = estado;

    }

}
