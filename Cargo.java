package co.edu.usta.persistence.nomina;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cargo", schema = "nomina")
public class Cargo implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "codigo", nullable = false)
    private int codigo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "funcion", nullable = false, length = 100)
    private String funcion;

    @Column(name = "competencias", nullable = false, length = 100)
    private String competencias;

    public Cargo() {



    }

    public Cargo(String nombre, String funcion, String competencias) {

        this.nombre = nombre;
        this.funcion = funcion;
        this.competencias = competencias;

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

    public String getFuncion() {

        return funcion;

    }

    public void setFuncion(String funcion) {

        this.funcion = funcion;

    }

    public String getCompetencias() {

        return competencias;

    }

    public void setCompetencias(String competencias) {

        this.competencias = competencias;

    }

}
