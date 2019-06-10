package co.edu.usta.persistence.facturacion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "venta", schema = "facturacion")
@NoArgsConstructor
@AllArgsConstructor
public class Venta implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "codigo", nullable = false)
    private @Getter @Setter
    int codigo;

    @Column(name = "fecha", nullable = false)
    private @Getter @Setter
    Date fecha;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_codigo", nullable = false)
    private @Getter @Setter
    Cliente cliente;

    public Venta(int codigo) {

        this.codigo = codigo;

    }

}
