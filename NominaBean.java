package co.edu.usta.bean;

import co.edu.usta.facade.NominaFacade;
import co.edu.usta.persistence.nomina.*;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
public class NominaBean implements NominaFacade {

    @PersistenceContext(unitName = "UstaJPA-Nomina")
    private EntityManager manager;

    public NominaBean() {

    }

    @Override
    public List<Periodo> listarPeriodos() throws Exception {
        return null;
    }

    @Override
    public void crearPeriodo(Periodo objPeriodo) throws Exception {

    }

    @Override
    public Periodo editarPeriodo(Periodo objPeriodo) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarPeriodo(int codigo) throws Exception {
        return false;
    }

    @Override
    public Periodo listarPeriodoById(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<Concepto> listarConceptos() throws Exception {
        return null;
    }

    @Override
    public void crearConcepto(Concepto objConcepto) throws Exception {

    }

    @Override
    public Concepto editarConcepto(Concepto objConcepto) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarConcepto(int codigo) throws Exception {
        return false;
    }

    @Override
    public Concepto listarConceptoByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public List<Concepto> listarConceptosByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public Concepto listarConceptoById(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<Cargo> listarCargos() throws Exception {
        return null;
    }

    @Override
    public void crearCargo(Cargo objCargo) throws Exception {

    }

    @Override
    public Cargo editarCargo(Cargo objCargo) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarCargo(int codigo) throws Exception {
        return false;
    }

    @Override
    public Cargo listarCargoByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public List<Cargo> listarCargosByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public Cargo listarCargoById(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<Contrato> listarContratos() throws Exception {
        return null;
    }

    @Override
    public void crearContrato(Contrato objContrato) throws Exception {

    }

    @Override
    public Contrato editarContrato(Contrato objContrato) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarContrato(int codigo) throws Exception {
        return false;
    }

    @Override
    public List<Contrato> listarContratoByDependencia(int dependencia) throws Exception {
        return null;
    }

    @Override
    public List<Contrato> listarContratoByCargo(int cargo) throws Exception {
        return null;
    }

    @Override
    public List<Contrato> listarContratoByHojaDeVida(int hojaVida) throws Exception {
        return null;
    }

    @Override
    public Contrato listarContratoById(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<Dependencia> listarDependencias() throws Exception {
        return null;
    }

    @Override
    public void crearDependencia(Dependencia objDependencia) throws Exception {

    }

    @Override
    public Dependencia editarDependencia(Dependencia objDependencia) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarDependencia(int codigo) throws Exception {
        return false;
    }

    @Override
    public Dependencia listarDependenciaByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public List<Dependencia> listarDependenciasByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public Dependencia listarDependenciaById(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<Nomina> listarNominas() throws Exception {
        return null;
    }

    @Override
    public void crearNomina(Nomina objNomina) throws Exception {

    }

    @Override
    public Nomina editarNomina(Nomina objNomina) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarNomina(int codigo) throws Exception {
        return false;
    }

    @Override
    public Nomina listarNominaByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public List<Nomina> listarNominasByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public Nomina listarNominaById(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<HojaVida> listarHojasDeVida() throws Exception {
        return null;
    }

    @Override
    public void crearHojaVida(HojaVida objHojaVida) throws Exception {

    }

    @Override
    public HojaVida editarHojaVida(HojaVida objHojaVida) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarHojaVida(int codigo) throws Exception {
        return false;
    }

    @Override
    public HojaVida listarHojaVidaByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public List<HojaVida> listarHojasDeVidaByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public HojaVida listarHojaVidaById(int codigo) throws Exception {
        return null;
    }
}
