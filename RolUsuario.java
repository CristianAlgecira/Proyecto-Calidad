package co.edu.usta.persistence.seguridad;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "rol_usuario", schema = "seguridad")
public class RolUsuario implements Serializable {

    @EmbeddedId
    private RolUsuarioPK codigo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rol_cod", nullable = false)
    @MapsId("rol")
    private Rol rol;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_cod", nullable = false)
    @MapsId("usuario")
    private Usuario usuario;

    @Column(name = "fecha", nullable = false)
    private Timestamp fecha;

    public RolUsuario() {



    }

    public RolUsuario(Rol rol, Usuario usuario, Timestamp fecha) {

        this.rol = rol;
        this.usuario = usuario;
        this.fecha = fecha;

    }

    public RolUsuario(RolUsuarioPK codigo, Rol rol, Usuario usuario, Timestamp fecha) {

        this.codigo = codigo;
        this.rol = rol;
        this.usuario = usuario;
        this.fecha = fecha;

    }

    public RolUsuarioPK getCodigo() {

        return codigo;

    }

    public void setCodigo(RolUsuarioPK codigo) {

        this.codigo = codigo;

    }

    public Rol getRol() {

        return rol;

    }

    public void setRol(Rol rol) {

        this.rol = rol;

    }

    public Usuario getUsuario() {

        return usuario;

    }

    public void setUsuario(Usuario usuario) {

        this.usuario = usuario;

    }

    public Timestamp getFecha() {

        return fecha;

    }

    public void setFecha(Timestamp fecha) {

        this.fecha = fecha;

    }

}
