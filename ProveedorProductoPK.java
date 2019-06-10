package co.edu.usta.persistence.facturacion;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ProveedorProductoPK implements Serializable {
    private Integer proveedorCodigo;
    private Integer productoCodigo;

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
        ProveedorProductoPK that = (ProveedorProductoPK) o;
        return Objects.equals(proveedorCodigo, that.proveedorCodigo) &&
                Objects.equals(productoCodigo, that.productoCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proveedorCodigo, productoCodigo);
    }
}
