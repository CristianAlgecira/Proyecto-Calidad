package co.edu.usta.persistence.seguridad;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RolPermisoPK implements Serializable {

    private int rol;
    private int permiso;

    public RolPermisoPK() {



    }

    public RolPermisoPK(int rol, int permiso) {

        this.rol = rol;
        this.permiso = permiso;

    }

    public int getRol() {

        return rol;

    }

    public void setRol(int rol) {

        this.rol = rol;

    }

    public int getPermiso() {

        return permiso;

    }

    public void setPermiso(int permiso) {

        this.permiso = permiso;

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolPermisoPK that = (RolPermisoPK) o;
        return rol == that.rol &&
                permiso == that.permiso;

    }

    @Override
    public int hashCode() {

        return Objects.hash(rol, permiso);

    }

}
