package co.edu.usta.persistence.seguridad;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RolUsuarioPK implements Serializable {

    private int usuario;
    private int rol;

    public RolUsuarioPK() {



    }

    public RolUsuarioPK(int usuario, int rol) {

        this.usuario = usuario;
        this.rol = rol;

    }

    public int getUsuario() {

        return usuario;

    }

    public void setUsuario(int usuario) {

        this.usuario = usuario;

    }

    public int getRol() {

        return rol;

    }

    public void setRol(int rol) {

        this.rol = rol;

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolUsuarioPK that = (RolUsuarioPK) o;
        return usuario == that.usuario &&
                rol == that.rol;

    }

    @Override
    public int hashCode() {

        return Objects.hash(usuario, rol);

    }
}
