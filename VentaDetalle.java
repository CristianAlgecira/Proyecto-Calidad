package co.edu.usta.persistence.facturacion;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "venta_detalle", schema = "facturacion", catalog = "ustaempresarial")
@IdClass(VentaDetallePK.class)
public class VentaDetalle {

    private Integer cantidad;
    private BigDecimal descuento;
    private Integer ventaCodigo;
    private Integer proveedorCodigo;
    private Integer productoCodigo;

    @Basic
    @Column(name = "cantidad", nullable = false)
    public Integer getCantidad() {

        return cantidad;

    }

    public void setCantidad(Integer cantidad) {

        this.cantidad = cantidad;

    }

    @Basic
    @Column(name = "descuento", nullable = false, precision = 4)
    public BigDecimal getDescuento() {

        return descuento;

    }

    public void setDescuento(BigDecimal descuento) {

        this.descuento = descuento;

    }

    @Id
    @Column(name = "venta_codigo", nullable = false)
    public Integer getVentaCodigo() {

        return ventaCodigo;

    }

    public void setVentaCodigo(Integer ventaCodigo) {

        this.ventaCodigo = ventaCodigo;

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
        VentaDetalle that = (VentaDetalle) o;
        return Objects.equals(cantidad, that.cantidad) &&
                Objects.equals(descuento, that.descuento) &&
                Objects.equals(ventaCodigo, that.ventaCodigo) &&
                Objects.equals(proveedorCodigo, that.proveedorCodigo) &&
                Objects.equals(productoCodigo, that.productoCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cantidad, descuento, ventaCodigo, proveedorCodigo, productoCodigo);
    }
}
