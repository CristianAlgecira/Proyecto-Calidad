package co.edu.usta.persistence.seguridad;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "usuario_log", schema = "seguridad")
public class UsuarioLog implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "codigo", nullable = false)
    private int codigo;

    @Column(name = "fecha", nullable = false)
    private Timestamp fecha;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_cod", nullable = false)
    private Usuario usuario;

    @Column(name = "proceso", nullable = false, length = 50)
    private String proceso;

    @Column(name = "dml", nullable = false, length = 50)
    private String dml;

    public UsuarioLog() {



    }

    public UsuarioLog(Timestamp fecha, Usuario usuario, String proceso, String dml) {

        this.fecha = fecha;
        this.usuario = usuario;
        this.proceso = proceso;
        this.dml = dml;

    }

    public int getCodigo() {

        return codigo;

    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;

    }

    public Timestamp getFecha() {

        return fecha;

    }

    public void setFecha(Timestamp fecha) {

        this.fecha = fecha;

    }

    public Usuario getUsuario() {

        return usuario;

    }

    public void setUsuario(Usuario usuario) {

        this.usuario = usuario;

    }

    public String getProceso() {

        return proceso;

    }

    public void setProceso(String proceso) {

        this.proceso = proceso;

    }

    public String getDml() {

        return dml;

    }

    public void setDml(String dml) {

        this.dml = dml;

    }

}
