package co.edu.usta.persistence.facturacion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "proveedor", schema = "facturacion")
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "codigo", nullable = false)
    private @Getter @Setter
    int codigo;

    @Column(name = "nombre", length = 100, nullable = false)
    private @Getter @Setter
    String nombre;

    @Column(name = "direccion", length = 100, nullable = false)
    private @Getter @Setter
    String direccion;

    @Column(name = "telefono", length = 12, nullable = false)
    private @Getter @Setter
    String telefono;

    @Column(name = "pagina_web", length = 100, nullable = true)
    private @Getter @Setter
    String paginaWeb;

    public Proveedor(int codigo) {

        this.codigo = codigo;

    }

}
