package co.edu.usta.persistence.seguridad;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "rol_permiso", schema = "seguridad")
public class RolPermiso implements Serializable {

    @EmbeddedId
    private RolPermisoPK codigo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rol_cod", nullable = false)
    @MapsId("rol")
    private Rol rol;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "permiso_cod", nullable = false)
    @MapsId("permiso")
    private Permiso permiso;

    @Column(name = "fecha", nullable = false)
    private Timestamp fecha;

    public RolPermiso() {



    }

    public RolPermiso(Rol rol, Permiso permiso, Timestamp fecha) {

        this.rol = rol;
        this.permiso = permiso;
        this.fecha = fecha;

    }

    public RolPermiso(RolPermisoPK codigo, Rol rol, Permiso permiso, Timestamp fecha) {

        this.codigo = codigo;
        this.rol = rol;
        this.permiso = permiso;
        this.fecha = fecha;

    }

    public RolPermisoPK getCodigo() {

        return codigo;

    }

    public void setCodigo(RolPermisoPK codigo) {

        this.codigo = codigo;

    }

    public Rol getRol() {

        return rol;

    }

    public void setRol(Rol rol) {

        this.rol = rol;

    }

    public Permiso getPermiso() {

        return permiso;

    }

    public void setPermiso(Permiso permiso) {

        this.permiso = permiso;

    }

    public Timestamp getFecha() {

        return fecha;

    }

    public void setFecha(Timestamp fecha) {

        this.fecha = fecha;

    }

}
