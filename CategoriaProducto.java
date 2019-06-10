package co.edu.usta.persistence.facturacion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "categoria_producto", schema = "facturacion")
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name="CategoriaProducto.findAll", query="SELECT cp FROM CategoriaProducto cp")

public class CategoriaProducto implements Serializable {

    public static final String LISTAR_CATEGORIAPRODUCTO = "CategoriaProducto.findAll";
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

    public CategoriaProducto(int codigo) {

        this.codigo = codigo;

    }

}
