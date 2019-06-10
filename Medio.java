package co.edu.usta.persistence.crm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "medio", schema = "crm")
@NoArgsConstructor
@AllArgsConstructor
public class Medio implements Serializable {

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipo_medio_cod", nullable = false)
    private @Getter @Setter
    TipoMedio tipo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "evento_cod", nullable = false)
    private @Getter @Setter
    Evento evento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "recurso_cod", nullable = false)
    private @Getter @Setter
    Recurso recurso;

    @Column(name = "valor", nullable = false)
    private @Getter @Setter
    Double valor;

    @Column(name = "estado", nullable = false)
    private @Getter @Setter
    boolean estado;

    public Medio(int codigo) {

        this.codigo = codigo;

    }

}
