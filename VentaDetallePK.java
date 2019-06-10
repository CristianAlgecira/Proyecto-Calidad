package co.edu.usta.persistence.facturacion;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class VentaDetallePK implements Serializable {
    private Integer ventaCodigo;
    private Integer proveedorCodigo;
    private Integer productoCodigo;

    @Column(name = "venta_codigo", nullable = false)
    @Id
    public Integer getVentaCodigo() {

        return ventaCodigo;

    }

    public void setVentaCodigo(Integer ventaCodigo) {

        this.ventaCodigo = ventaCodigo;

    }

    @Column(name = "proveedor_codigo", nullable = false)
    @Id
    public Integer getProveedorCodigo() {

        return proveedorCodigo;

    }

    public void setProveedorCodigo(Integer proveedorCodigo) {

        this.proveedorCodigo = proveedorCodigo;

    }

    @Column(name = "producto_codigo", nullable = false)
    @Id
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
        VentaDetallePK that = (VentaDetallePK) o;
        return Objects.equals(ventaCodigo, that.ventaCodigo) &&
                Objects.equals(proveedorCodigo, that.proveedorCodigo) &&
                Objects.equals(productoCodigo, that.productoCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ventaCodigo, proveedorCodigo, productoCodigo);
    }
}
