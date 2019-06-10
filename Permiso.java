package co.edu.usta.persistence.seguridad;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "permiso", schema = "seguridad")
public class Permiso implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "codigo", nullable = false)
    private int codigo;

    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 250)
    private String descripcion;

    @Column(name = "estado", nullable = false)
    private boolean estado;

    public Permiso() {



    }

    public Permiso(String nombre, String descripcion, boolean estado) {

        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public boolean isEstado() {

        return estado;

    }

    public void setEstado(boolean estado) {

        this.estado = estado;

    }

}
