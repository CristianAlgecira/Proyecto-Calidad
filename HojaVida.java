package co.edu.usta.persistence.nomina;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "hoja_vida", schema = "nomina")
public class HojaVida implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "documento", nullable = false)
    private int documento;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 100)
    private String apellido;

    @Column(name = "nacimiento_fecha", nullable = false)
    private Date fechaNacimiento;

    @Column(name = "nacimiento_lugar", nullable = false, length = 100)
    private String lugarNacimiento;

    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;

    @Column(name = "telefono", nullable = false)
    private int telefono;

    public HojaVida() {



    }

    public HojaVida(String nombre, String apellido, Date fechaNacimiento, String lugarNacimiento, String direccion, int telefono) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;

    }

    public int getDocumento() {

        return documento;

    }

    public void setDocumento(int documento) {

        this.documento = documento;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getApellido() {

        return apellido;

    }

    public void setApellido(String apellido) {

        this.apellido = apellido;

    }

    public Date getFechaNacimiento() {

        return fechaNacimiento;

    }

    public void setFechaNacimiento(Date fechaNacimiento) {

        this.fechaNacimiento = fechaNacimiento;

    }

    public String getLugarNacimiento() {

        return lugarNacimiento;

    }

    public void setLugarNacimiento(String lugarNacimiento) {

        this.lugarNacimiento = lugarNacimiento;

    }

    public String getDireccion() {

        return direccion;

    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;

    }

    public int getTelefono() {

        return telefono;

    }

    public void setTelefono(int telefono) {

        this.telefono = telefono;

    }

}
