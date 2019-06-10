package co.edu.usta.facade;

import co.edu.usta.persistence.facturacion.*;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface FacturacionFacade {

    //******************************************************************************
    //*                            TABLE CATEGORIAPRODUCTO                         *
    //******************************************************************************

    /**
     * En este metodo se va a listar las categorias correspondientes a los productos
     *
     * @return List<CategoriaProducto>: listado de productos
     * @throws Exception Capturar errores posibles sobre ejecucion
     */
    public List<CategoriaProducto> traerProductos() throws Exception;

    /**
     * metodo que crea la categoria correspodiente a un producto
     *
     * @param producto: tipo de objeto a crear
     * @throws Exception errores posibles sobre ejecucion
     */
    public void crearCagtegoriaProducto(CategoriaProducto producto) throws Exception;

    /**
     * metodo encargado de actualizar la cagtegoria
     *
     * @param categoriaProducto
     * @return la Categoria de Producto que se creo
     * @throws Exception
     */
    public CategoriaProducto editarCategoriaProducto(CategoriaProducto categoriaProducto) throws Exception;

    /**
     * metodo que borra la categoria del producto seleccionado
     *
     * @param codigo
     * @return true: donde si borra y false donde hay error de ejecucion
     * @throws Exception
     */
    public boolean borrarCategoriaProducto(int codigo) throws Exception;

    /**
     * metodo que busca por el nombre de la categoria del produco
     *
     * @param nombre: nombre de la categoria
     * @throws Exception
     * @return: la objeto categoria producto
     */
    public List<CategoriaProducto> buscarCategoriaPorNombre(String nombre) throws Exception;


    //******************************************************************************
    //*                            TABLE VENTA-DETALLE - PK                        *
    //******************************************************************************

    /**
     * metodo que actualiza la venta detalle de una compra
     *
     * @return
     * @throws Exception
     */
    public VentaDetalle actualizarVentaDetalle(VentaDetalle detalle) throws Exception;

    /**
     * Crea un detalle de venta
     *
     * @param detalle Objeto VentaDetalle
     * @throws Exception
     */
    public void crearVentaDetalle(VentaDetalle detalle) throws Exception;

    /**
     * Eliminar una venta detalle
     *
     * @param
     **/
    public boolean borrarVentaDetalle(VentaDetallePK id) throws Exception;

    /**
     * metodo que busca por el PK de la venta detalle
     *
     * @throws Exception
     * @return: VentaDetalle
     */
    public VentaDetalle buscarPorID(VentaDetallePK id) throws Exception;

    //******************************************************************************
    //*                            TABLE CLIENTE                                   *
    //******************************************************************************


    /**
     * metodo que actualiza la información del cliente
     *
     * @return
     * @throws Exception
     */
    public Cliente actualizarCliente(Cliente cliente) throws Exception;

    /**
     * Crear un nuevo cliente
     *
     * @throws Exception
     */
    public void crearCliente(Cliente cliente) throws Exception;

    /**
     * Eliminar un cliente
     *
     * @param
     **/
    public boolean borrarCliente(int codigo) throws Exception;

    /**
     * metodo que trae todos los clientes
     *
     * @throws Exception
     * @return: la objeto cliente
     */
    public List<Cliente> traerCliente() throws Exception;

    /**
     * metodo que trae las ventas detalle
     *
     * @throws Exception
     * @return: la lista de objetos venta detalle
     */
    public List<VentaDetalle> buscarVentadetalle(int ventaId, int productoId, int proveedorId, int cantidad, int descuento) throws Exception;

    //******************************************************************************
    //*                            TABLE VENTA                                     *
    //******************************************************************************

    /**
     * metodo que actualiza la información de la venta
     *
     * @return
     * @throws Exception
     */
    public Venta actualizarVenta(Venta venta) throws Exception;

    /**
     * Crear una nueva venta
     *
     * @throws Exception
     */
    public void crearVenta(Venta venta) throws Exception;

    /**
     * Eliminar una venta
     *
     * @param
     **/
    public boolean borrarVenta(int codigo) throws Exception;

    /**
     * metodo que trae las ventas
     *
     * @throws Exception
     * @return: la objeto venta
     */
    public List<Venta> traerVenta() throws Exception;

    //******************************************************************************
    //*                            TABLE PRODUCTO                                  *
    //******************************************************************************

    /**
     * metodo que actualiza la información del producto
     *
     * @return
     * @throws Exception
     */
    public Producto actualizarProducto(Producto producto) throws Exception;

    /**
     * Crear un nuevo producto
     *
     * @throws Exception
     */
    public void crearProducto(Producto producto) throws Exception;

    /**
     * Eliminar un Producto
     *
     * @param
     **/
    public boolean borrarProducto(int codigo) throws Exception;

    /**
     * metodo que trae los Productos
     *
     * @throws Exception
     * @return: la lista de objetos Producto
     */
    public List<Producto> traerProducto() throws Exception;
    //------------------------CRUD DE PROVEEDOR--------------------------------

    /**
     * metodo que actualiza la información del proveedor
     *
     * @return
     * @throws Exception
     */
    public Proveedor actualizarProveedor(Proveedor proveedor) throws Exception;

    /**
     * Crear un nuevo proveedor
     *
     * @param detalle Objeto proveedor
     * @throws Exception
     */
    public void crearProveedor(Proveedor proveedor) throws Exception;

    /**
     * Eliminar un proveedor
     *
     * @param
     **/
    public boolean borrarProveedor(int codigo) throws Exception;

    /**
     * metodo que trae los proveedores
     *
     * @throws Exception
     * @return: la objeto proveedor
     */
    public List<Proveedor> traerProveedor() throws Exception;

    //******************************************************************************
    //*                            TABLE PROVEEDOR-PRODUCTO -PK                    *
    //******************************************************************************

    /**
     * metodo que actualiza el ProveedorProducto
     * @return ProveedorProducto
     * @throws Exception
     */
    public ProveedorProducto actualizarProveedorProducto(ProveedorProducto detalle) throws Exception;

    /**
     * Crea un ProveedorProducto
     *
     * @param detalle Objeto ProveedorProducto
     * @throws Exception
     */
    public void crearProveedorProducto(ProveedorProducto detalle) throws Exception;

    /**
     * Eliminar un ProveedorProducto
     **/
    public boolean borrarProveedorProducto(ProveedorProductoPK id) throws Exception;

    /**
     * metodo que trae todos los ProveedorProducto
     *
     * @throws Exception
     * @return: List ProveedorProducto
     */
    public List<ProveedorProducto> traerProveedorProducto() throws Exception;

}
