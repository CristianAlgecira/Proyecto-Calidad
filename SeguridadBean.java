package co.edu.usta.bean;

import co.edu.usta.facade.SeguridadFacade;
import co.edu.usta.persistence.seguridad.*;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;

@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
public class SeguridadBean implements SeguridadFacade {

    @PersistenceContext(unitName = "UstaJPA-Seguridad")
    private EntityManager manager;

    public SeguridadBean() {

    }

    @Override
    public List<Usuario> listarUsuarios() throws Exception {
        return null;
    }

    @Override
    public void crearUsuario(Usuario objUsuario) throws Exception {

    }

    @Override
    public Usuario editarUsuario(Usuario objUsuario) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarUsuario(int codigo) throws Exception {
        return false;
    }

    @Override
    public Usuario listarUsuarioByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public List<Usuario> listarUsuariosByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public Usuario listarUsuarioById(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<Rol> listarRoles() throws Exception {
        return null;
    }

    @Override
    public void crearRol(Rol objRol) throws Exception {

    }

    @Override
    public Rol editarRol(Rol objRol) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarRol(int codigo) throws Exception {
        return false;
    }

    @Override
    public Rol listarRolByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public List<Rol> listarRolesByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public Rol listarRolById(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<Permiso> listarPermisos() throws Exception {
        return null;
    }

    @Override
    public void crearPermiso(Permiso objPermiso) throws Exception {

    }

    @Override
    public Permiso editarPermiso(Permiso objPermiso) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarPermiso(int codigo) throws Exception {
        return false;
    }

    @Override
    public Permiso listarPermisoByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public List<Permiso> listarPermisosByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public Permiso listarPermisoById(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<UsuarioLog> listarUsuarioLogs() throws Exception {
        return null;
    }

    @Override
    public void crearUsuarioLog(UsuarioLog objUsuarioLog) throws Exception {

    }

    @Override
    public UsuarioLog editarUsuarioLog(UsuarioLog objUsuarioLog) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarUsuarioLog(int codigo) throws Exception {
        return false;
    }

    @Override
    public UsuarioLog listarUsuarioLogByDate(Date fecha) throws Exception {
        return null;
    }

    @Override
    public List<UsuarioLog> listarUsuarioLogByUsuario(int usuario) throws Exception {
        return null;
    }

    @Override
    public List<RolUsuario> listarRolUsuarios() throws Exception {
        return null;
    }

    @Override
    public void crearRolUsuario(RolUsuario objRolUsuario) throws Exception {

    }

    @Override
    public RolUsuario editarRolUsuario(RolUsuario objRolUsuario) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarRolUsuario(RolUsuarioPK pk) throws Exception {
        return false;
    }

    @Override
    public List<RolUsuario> listarRolesByUsuario(int usuario) throws Exception {
        return null;
    }

    @Override
    public List<RolPermiso> listarRolPermisos() throws Exception {
        return null;
    }

    @Override
    public void crearRolPermiso(RolPermiso objRolPermiso) throws Exception {

    }

    @Override
    public RolPermiso editarRolPermiso(RolPermiso objRolPermiso) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarRolPermiso(int codigo) throws Exception {
        return false;
    }

    @Override
    public List<RolPermiso> listarPermisosByRol(int rol) throws Exception {
        return null;
    }
}
