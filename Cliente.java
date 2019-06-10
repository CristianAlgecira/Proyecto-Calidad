package co.edu.usta.persistence.facturacion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "cliente", schema = "facturacion")
@NoArgsConstructor
@AllArgsConstructor
public class Cliente implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "codigo", nullable = false)
    private @Getter @Setter
    int codigo;

    @Column(name = "nombre", length = 50, nullable = false)
    private @Getter @Setter
    String nombre;

    @Column(name = "apellido", length = 100, nullable = false)
    private @Getter @Setter
    String apellido;

    @Column(name = "telefono", length = 10, nullable = false)
    private @Getter @Setter
    String telefono;

    @Column(name = "codigo_postal", length = 5, nullable = false)
    private @Getter @Setter
    String codigoPostal;

    @Column(name = "sexo", length = 1, nullable = false)
    private @Getter @Setter
    Character sexo;

    @Column(name = "fecha_nacimiento", nullable = false)
    private @Getter @Setter
    Date fechaNacimiento;

    @Column(name = "poblacion", length = 20, nullable = false)
    private @Getter @Setter
    String poblacion;

    public Cliente(int codigo) {

        this.codigo = codigo;

    }

}
