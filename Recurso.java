package co.edu.usta.persistence.crm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "recurso", schema = "crm")
@NoArgsConstructor
@AllArgsConstructor
public class Recurso implements Serializable {

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

    @Column(name = "tipo", nullable = false)
    private @Getter @Setter
    int tipo;

    @Column(name = "valor", nullable = false)
    private @Getter @Setter
    double valor;

    public Recurso(int codigo) {

        this.codigo = codigo;

    }

}
