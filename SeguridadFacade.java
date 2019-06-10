package co.edu.usta.facade;

import co.edu.usta.persistence.seguridad.*;

import javax.ejb.Remote;
import java.util.Date;
import java.util.List;

@Remote
public interface SeguridadFacade {

    //******************************************************************************
    //*                            TABLE USUARIO                                   *
    //******************************************************************************

    /**
     * Metodo que lista todos los Usuarios
     * @return List<Usuario>. Representa una lista de los Usuarios obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Usuario> listarUsuarios() throws Exception;

    /**
     * Metodo que permite crear un Usuario
     * @param objUsuario Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearUsuario(Usuario objUsuario) throws Exception;

    /**
     * Metodo que permite actualizar un Usuario
     * @param objUsuario Representa el objeto que será actualizado.
     * @return Usuario. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Usuario editarUsuario(Usuario objUsuario) throws Exception;

    /**
     * Metodo que elimina un Usuario de manera permanente
     * @param codigo Entero que representa la PK de Usuario
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarUsuario(int codigo) throws Exception;

    /**
     * Metodo que busca un Usuario por nombre
     * @param nombre Representa el nombre del Usuario que quiere ser buscado
     * @return Usuario. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Usuario listarUsuarioByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca Usuarios por un nombre
     * @param nombre Representa el nombre de los Usuarios que quieren ser buscados
     * @return List<Usuario>. Contiene la todos los objetos que coinciden con la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Usuario> listarUsuariosByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca un Usuario por codigo
     * @param codigo Entero que representa la PK de Usuario
     * @return Usuario. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Usuario listarUsuarioById(int codigo) throws Exception;

//******************************************************************************
    //*                              TABLE ROL                                     *
    //******************************************************************************

    /**
     * Metodo que lista todos los Roles
     * @return List<Rol>. Representa una lista de los Roles obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Rol> listarRoles() throws Exception;

    /**
     * Metodo que permite crear un Rol
     * @param objRol Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearRol(Rol objRol) throws Exception;

    /**
     * Metodo que permite actualizar un Rol
     * @param objRol Representa el objeto que será actualizado.
     * @return Rol. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Rol editarRol(Rol objRol) throws Exception;

    /**
     * Metodo que elimina un Rol de manera permanente
     * @param codigo Entero que representa la PK de Rol
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarRol(int codigo) throws Exception;

    /**
     * Metodo que busca un Rol por nombre
     * @param nombre Representa el nombre del Rol que quiere ser buscado
     * @return Rol. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Rol listarRolByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca Roles por un nombre
     * @param nombre Representa el nombre de los Roles que quieren ser buscados
     * @return List<Rol>. Contiene la todos los objetos que coinciden con la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Rol> listarRolesByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca un Rol por codigo
     * @param codigo Entero que representa la PK de Rol
     * @return Rol. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Rol listarRolById(int codigo) throws Exception;

    //******************************************************************************
    //*                            TABLE PERMISO                                   *
    //******************************************************************************

    /**
     * Metodo que lista todos los Permisos
     * @return List<Permiso>. Representa una lista de los Permisos obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Permiso> listarPermisos() throws Exception;

    /**
     * Metodo que permite crear un Permiso
     * @param objPermiso Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearPermiso(Permiso objPermiso) throws Exception;

    /**
     * Metodo que permite actualizar un Permiso
     * @param objPermiso Representa el objeto que será actualizado.
     * @return Permiso. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Permiso editarPermiso(Permiso objPermiso) throws Exception;

    /**
     * Metodo que elimina un Permiso de manera permanente
     * @param codigo Entero que representa la PK de Permiso
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarPermiso(int codigo) throws Exception;

    /**
     * Metodo que busca un Permiso por nombre
     * @param nombre Representa el nombre del Permiso que quiere ser buscado
     * @return Permiso. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Permiso listarPermisoByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca Permisos por un nombre
     * @param nombre Representa el nombre de los Permisos que quieren ser buscados
     * @return List<Permiso>. Contiene la todos los objetos que coinciden con la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Permiso> listarPermisosByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca un Permiso por codigo
     * @param codigo Entero que representa la PK de Permiso
     * @return Permiso. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Permiso listarPermisoById(int codigo) throws Exception;

    //******************************************************************************
    //*                          TABLE USUARIO LOG                                 *
    //******************************************************************************

    /**
     * Metodo que lista todos los Logs de Usuario
     * @return List<UsuarioLog>. Representa una lista de los Logs de Usuario obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<UsuarioLog> listarUsuarioLogs() throws Exception;

    /**
     * Metodo que permite crear un Log de usuario
     * @param objUsuarioLog Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearUsuarioLog(UsuarioLog objUsuarioLog) throws Exception;

    /**
     * Metodo que permite actualizar un Log de Usuario
     * @param objUsuarioLog Representa el objeto que será actualizado.
     * @return UsuarioLog. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    UsuarioLog editarUsuarioLog(UsuarioLog objUsuarioLog) throws Exception;

    /**
     * Metodo que elimina un Log de Usuario de manera permanente
     * @param codigo Entero que representa la PK de UsuarioLog
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarUsuarioLog(int codigo) throws Exception;

    /**
     * Metodo que busca un Log de Usuario por fecha
     * @param fecha Representa la fecha en la cual se quiere buscar
     * @return UsuarioLog. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    UsuarioLog listarUsuarioLogByDate(Date fecha) throws Exception;

    /**
     * Metodo que busca los Log de un usuario
     * @param usuario Entero que representa el codigo de un usuario
     * @return List<UsuarioLog>. Lista que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<UsuarioLog> listarUsuarioLogByUsuario(int usuario) throws Exception;

    //******************************************************************************
    //*                          TABLE ROL USUARIO                                 *
    //******************************************************************************

    /**
     * Metodo que lista todos los Roles de Usuario
     * @return List<RolUsuario>. Representa una lista de los Roles de Usario obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<RolUsuario> listarRolUsuarios() throws Exception;

    /**
     * Metodo que permite crear un Rol de Usuario
     * @param objRolUsuario Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearRolUsuario(RolUsuario objRolUsuario) throws Exception;

    /**
     * Metodo que permite actualizar un Rol de Usuario
     * @param objRolUsuario Representa el objeto que será actualizado.
     * @return RolUsuario. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    RolUsuario editarRolUsuario(RolUsuario objRolUsuario) throws Exception;

    /**
     * Metodo que elimina un Rol de Usuario de manera permanente
     * @param pk Objeto que representa la PK de RolUsuario
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarRolUsuario(RolUsuarioPK pk) throws Exception;

    /**
     * Metodo que busca los Roles de un usuario
     * @param usuario Entero que representa el codigo de un usuario
     * @return List<RolUsuario>. Lista que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<RolUsuario> listarRolesByUsuario(int usuario) throws Exception;

    //******************************************************************************
    //*                          TABLE ROL PERMISO                                 *
    //******************************************************************************

    /**
     * Metodo que lista todos los Permisos de Rol
     * @return List<RolPermiso>. Representa una lista de los Roles de Usario obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<RolPermiso> listarRolPermisos() throws Exception;

    /**
     * Metodo que permite crear un Permiso de un Rol
     * @param objRolPermiso Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearRolPermiso(RolPermiso objRolPermiso) throws Exception;

    /**
     * Metodo que permite actualizar un Permiso de un Rol
     * @param objRolPermiso Representa el objeto que será actualizado.
     * @return RolPermiso. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    RolPermiso editarRolPermiso(RolPermiso objRolPermiso) throws Exception;

    /**
     * Metodo que elimina un Permiso de un Rol de manera permanente
     * @param codigo Entero que representa la PK de RolPermiso
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarRolPermiso(int codigo) throws Exception;

    /**
     * Metodo que busca los Permisos de un Rol
     * @param rol Entero que representa el codigo de un rol
     * @return List<RolPermiso>. Lista que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<RolPermiso> listarPermisosByRol(int rol) throws Exception;

}
