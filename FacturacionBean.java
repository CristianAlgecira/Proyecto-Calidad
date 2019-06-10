package co.edu.usta.bean;

import co.edu.usta.facade.FacturacionFacade;
import co.edu.usta.persistence.facturacion.*;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
public class FacturacionBean implements FacturacionFacade{

    @PersistenceContext(unitName = "UstaJPA-Facturacion")
    private EntityManager manager;

    public FacturacionBean(){
    }

    /**
     * En este metodo se va a listar las categorias correspondientes a los productos
     *
     * @return List<CategoriaProducto>: listado de productos
     * @throws Exception Capturar errores posibles sobre ejecucion
     */
    @Override
    public List<CategoriaProducto> traerProductos() throws Exception {
        List<CategoriaProducto> categoriaProductos = new ArrayList<CategoriaProducto>();

        Query query = manager.createNamedQuery(CategoriaProducto.LISTAR_CATEGORIAPRODUCTO);

        categoriaProductos = query.getResultList();

        return categoriaProductos;
    }

    /**
     * metodo que crea la categoria correspodiente a un producto
     *
     * @param producto : tipo de objeto a crear
     * @throws Exception errores posibles sobre ejecucion
     */
    @Override
    public void crearCagtegoriaProducto(CategoriaProducto producto) throws Exception {
        if (producto.getNombre() != null && !producto.getNombre().equals("")) {
            manager.persist(producto);
        }

    }

    /**
     * metodo encargado de actualizar la cagtegoria
     *
     * @param categoriaProducto
     * @return la Categoria de Producto que se creo
     * @throws Exception
     */
    @Override
    public CategoriaProducto editarCategoriaProducto(CategoriaProducto categoriaProducto) throws Exception {
       return null;
    }

    /**
     * metodo que borra la categoria del producto seleccionado
     *
     * @param codigo
     * @return true: donde si borra y false donde hay error de ejecucion
     * @throws Exception
     */
    @Override
    public boolean borrarCategoriaProducto(int codigo) throws Exception {
        return false;
    }

    /**
     * metodo que busca por el nombre de la categoria del produco
     *
     * @param nombre : nombre de la categoria
     * @throws Exception
     * @return: la objeto categoria producto
     */
    @Override
    public List<CategoriaProducto> buscarCategoriaPorNombre(String nombre) throws Exception {
        return null;
    }

    /**
     * metodo que actualiza la venta detalle de una compra
     *
     * @param detalle
     * @return
     * @throws Exception
     */
    @Override
    public VentaDetalle actualizarVentaDetalle(VentaDetalle detalle) throws Exception {
        return null;
    }

    /**
     * Crea un detalle de venta
     *
     * @param detalle Objeto VentaDetalle
     * @throws Exception
     */
    @Override
    public void crearVentaDetalle(VentaDetalle detalle) throws Exception {

    }

    /**
     * Eliminar una venta detalle
     *
     * @param id
     **/
    @Override
    public boolean borrarVentaDetalle(VentaDetallePK id) throws Exception {
        return false;
    }

    /**
     * metodo que busca por el PK de la venta detalle
     *
     * @param id
     * @throws Exception
     * @return: VentaDetalle
     */
    @Override
    public VentaDetalle buscarPorID(VentaDetallePK id) throws Exception {
    return null;
    }

    /**
     * metodo que actualiza la información del cliente
     *
     * @param cliente
     * @return
     * @throws Exception
     */
    @Override
    public Cliente actualizarCliente(Cliente cliente) throws Exception {
        return null;
    }

    /**
     * Crear un nuevo cliente
     *
     * @param cliente
     * @throws Exception
     */
    @Override
    public void crearCliente(Cliente cliente) throws Exception {

    }

    /**
     * Eliminar un cliente
     *
     * @param codigo
     **/
    @Override
    public boolean borrarCliente(int codigo) throws Exception {
        return false;
    }

    /**
     * metodo que trae todos los clientes
     *
     * @throws Exception
     * @return: la objeto cliente
     */
    @Override
    public List<Cliente> traerCliente() throws Exception {
        return null;
    }

    /**
     * metodo que trae las ventas detalle
     *
     * @param ventaId
     * @param productoId
     * @param proveedorId
     * @param cantidad
     * @param descuento
     * @throws Exception
     * @return: la lista de objetos venta detalle
     */
    @Override
    public List<VentaDetalle> buscarVentadetalle(int ventaId, int productoId, int proveedorId, int cantidad, int descuento) throws Exception {
        return null;
    }

    /**
     * metodo que actualiza la información de la venta
     *
     * @param venta
     * @return
     * @throws Exception
     */
    @Override
    public Venta actualizarVenta(Venta venta) throws Exception {
        return null;
    }

    /**
     * Crear una nueva venta
     *
     * @param venta
     * @throws Exception
     */
    @Override
    public void crearVenta(Venta venta) throws Exception {

    }

    /**
     * Eliminar una venta
     *
     * @param codigo
     **/
    @Override
    public boolean borrarVenta(int codigo) throws Exception {
        return false;
    }

    /**
     * metodo que trae las ventas
     *
     * @throws Exception
     * @return: la objeto venta
     */
    @Override
    public List<Venta> traerVenta() throws Exception {
        return null;
    }

    /**
     * metodo que actualiza la información del producto
     *
     * @param producto
     * @return
     * @throws Exception
     */
    @Override
    public Producto actualizarProducto(Producto producto) throws Exception {
        return null;
    }

    /**
     * Crear un nuevo producto
     *
     * @param producto
     * @throws Exception
     */
    @Override
    public void crearProducto(Producto producto) throws Exception {

    }

    /**
     * Eliminar un Producto
     *
     * @param codigo
     **/
    @Override
    public boolean borrarProducto(int codigo) throws Exception {
        return false;
    }

    /**
     * metodo que trae los Productos
     *
     * @throws Exception
     * @return: la lista de objetos Producto
     */
    @Override
    public List<Producto> traerProducto() throws Exception {
        return null;
    }

    /**
     * metodo que actualiza la información del proveedor
     *
     * @param proveedor
     * @return
     * @throws Exception
     */
    @Override
    public Proveedor actualizarProveedor(Proveedor proveedor) throws Exception {
        return null;
    }

    /**
     * Crear un nuevo proveedor
     *
     * @param proveedor@throws Exception
     */
    @Override
    public void crearProveedor(Proveedor proveedor) throws Exception {

    }

    /**
     * Eliminar un proveedor
     *
     * @param codigo
     **/
    @Override
    public boolean borrarProveedor(int codigo) throws Exception {
        return false;
    }

    /**
     * metodo que trae los proveedores
     *
     * @throws Exception
     * @return: la objeto proveedor
     */
    @Override
    public List<Proveedor> traerProveedor() throws Exception {
        return null;
    }

    /**
     * metodo que actualiza el ProveedorProducto
     *
     * @param detalle
     * @return ProveedorProducto
     * @throws Exception
     */
    @Override
    public ProveedorProducto actualizarProveedorProducto(ProveedorProducto detalle) throws Exception {
        return null;
    }

    /**
     * Crea un ProveedorProducto
     *
     * @param detalle Objeto ProveedorProducto
     * @throws Exception
     */
    @Override
    public void crearProveedorProducto(ProveedorProducto detalle) throws Exception {

    }

    /**
     * Eliminar un ProveedorProducto
     *
     * @param id
     */
    @Override
    public boolean borrarProveedorProducto(ProveedorProductoPK id) throws Exception {
        return false;
    }

    /**
     * metodo que trae todos los ProveedorProducto
     *
     * @throws Exception
     * @return: List ProveedorProducto
     */
    @Override
    public List<ProveedorProducto> traerProveedorProducto() throws Exception {
        return null;
    }
}
