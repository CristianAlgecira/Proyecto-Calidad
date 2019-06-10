package co.edu.usta.persistence.crm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "evento", schema = "crm")
@NoArgsConstructor
@AllArgsConstructor
public class Evento implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "codigo", nullable = false)
    private @Getter @Setter
    int codigo;

    @Column(name = "nombre", length = 200, nullable = false)
    private @Getter @Setter
    String nombre;

    @Column(name = "descripcion", length = 200, nullable = false)
    private @Getter @Setter
    String descripcion;

    @Column(name = "fecha", nullable = false)
    private @Getter @Setter
    Date fecha;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "campania_cod", nullable = false)
    private @Getter @Setter
    Campania campania;

    @Column(name = "estado", nullable = false)
    private @Getter @Setter
    boolean estado;

    public Evento(int codigo) {

        this.codigo = codigo;

    }

}
