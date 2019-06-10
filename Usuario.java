package co.edu.usta.persistence.seguridad;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "usuario", schema = "seguridad")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "codigo", nullable = false)
    private int codigo;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "fecha_inicio", nullable = false)
    private Timestamp fechaInicio;

    @Column(name = "fecha_fin", nullable = true)
    private Timestamp fechaFin;

    @Column(name = "tipo", nullable = false)
    private int tipo;

    public Usuario() {



    }

    public Usuario(String nombre, String email, String password, Timestamp fechaInicio, Timestamp fechaFin, int tipo) {

        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipo = tipo;

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

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getPassword() {

        return password;

    }

    public void setPassword(String password) {

        this.password = password;

    }

    public Timestamp getFechaInicio() {

        return fechaInicio;

    }

    public void setFechaInicio(Timestamp fechaInicio) {

        this.fechaInicio = fechaInicio;

    }

    public Timestamp getFechaFin() {

        return fechaFin;

    }

    public void setFechaFin(Timestamp fechaFin) {

        this.fechaFin = fechaFin;

    }

    public int getTipo() {

        return tipo;

    }

    public void setTipo(int tipo) {

        this.tipo = tipo;

    }

}
