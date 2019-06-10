package co.edu.usta.persistence.crm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "campania", schema = "crm")
@NoArgsConstructor
@AllArgsConstructor
public class Campania implements Serializable {

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

    @Column(name = "fecha_inicio", nullable = false)
    private @Getter @Setter
    Date fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private @Getter @Setter
    Date fechaFin;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "periodo_cod", nullable = false)
    private @Getter @Setter
    Periodo periodo;

    @Column(name = "valor", nullable = false)
    private @Getter @Setter
    Double valor;

    @Column(name = "estado", nullable = false)
    private @Getter @Setter
    boolean estado;

    public Campania(int codigo) {

        this.codigo = codigo;

    }

}
