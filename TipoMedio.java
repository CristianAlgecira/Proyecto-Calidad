package co.edu.usta.persistence.crm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tipo_medio", schema = "crm")
@NoArgsConstructor
@AllArgsConstructor
public class TipoMedio implements Serializable {

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

    @Column(name = "valor_prom", nullable = false)
    private @Getter @Setter
    int valorProm;

    @Column(name = "estado", nullable = false)
    private @Getter @Setter
    boolean estado;

    public TipoMedio(int codigo) {

        this.codigo = codigo;

    }

}
