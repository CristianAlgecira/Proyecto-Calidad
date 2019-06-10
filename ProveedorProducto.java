package co.edu.usta.persistence.facturacion;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "proveedor_producto", schema = "facturacion", catalog = "ustaempresarial")
@IdClass(ProveedorProductoPK.class)
public class ProveedorProducto {

    private Integer precioUnitario;
    private Date fechaVigencia;
    private BigDecimal peso;
    private Integer proveedorCodigo;
    private Integer productoCodigo;

    @Basic
    @Column(name = "precio_unitario", nullable = false)
    public Integer getPrecioUnitario() {

        return precioUnitario;

    }

    public void setPrecioUnitario(Integer precioUnitario) {

        this.precioUnitario = precioUnitario;

    }

    @Basic
    @Column(name = "fecha_vigencia", nullable = false)
    public Date getFechaVigencia() {

        return fechaVigencia;

    }

    public void setFechaVigencia(Date fechaVigencia) {

        this.fechaVigencia = fechaVigencia;

    }

    @Basic
    @Column(name = "peso", nullable = false, precision = 4)
    public BigDecimal getPeso() {

        return peso;

    }

    public void setPeso(BigDecimal peso) {

        this.peso = peso;

    }

    @Id
    @Column(name = "proveedor_codigo", nullable = false)
    public Integer getProveedorCodigo() {

        return proveedorCodigo;

    }

    public void setProveedorCodigo(Integer proveedorCodigo) {

        this.proveedorCodigo = proveedorCodigo;

    }

    @Id
    @Column(name = "producto_codigo", nullable = false)
    public Integer getProductoCodigo() {

        return productoCodigo;

    }

    public void setProductoCodigo(Integer productoCodigo) {

        this.productoCodigo = productoCodigo;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProveedorProducto that = (ProveedorProducto) o;
        return Objects.equals(precioUnitario, that.precioUnitario) &&
                Objects.equals(fechaVigencia, that.fechaVigencia) &&
                Objects.equals(peso, that.peso) &&
                Objects.equals(proveedorCodigo, that.proveedorCodigo) &&
                Objects.equals(productoCodigo, that.productoCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precioUnitario, fechaVigencia, peso, proveedorCodigo, productoCodigo);
    }

}
