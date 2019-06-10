package co.edu.usta.persistence.facturacion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "producto", schema = "facturacion")
@NoArgsConstructor
@AllArgsConstructor
public class Producto implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "codigo", nullable = false)
    private @Getter @Setter
    int codigo;

    @Column(name = "nombre", length = 50, nullable = false)
    private @Getter @Setter
    String nombre;

    @Column(name = "caracteristica", length = 200, nullable = false)
    private @Getter @Setter
    String caracteristica;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cate_prod_codigo", nullable = false)
    private @Getter @Setter
    CategoriaProducto categoriaProducto;

    public Producto(int codigo) {

        this.codigo = codigo;

    }

}
