package co.edu.usta.bean;

import co.edu.usta.facade.FinanzasFacade;
import co.edu.usta.persistence.finanzas.*;

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
public class FinanzasBean implements FinanzasFacade{

    @PersistenceContext(unitName = "UstaJPA-Finanzas")
    private EntityManager manager;

    public FinanzasBean() {

    }

    @Override
    public List<PlanContable> listarPlanesContables() throws Exception {
        return null;
    }

    @Override
    public void crearPlanContable(PlanContable objPlan) throws Exception {

    }

    @Override
    public PlanContable editarPlanContable(PlanContable objPlan) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarPlanContable(int codigo) throws Exception {
        return false;
    }

    @Override
    public PlanContable listarPlanByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public List<PlanContable> listarPlanesByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public PlanContable listarPlanContableById(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<LibroDiario> listarLibrosDiarios() throws Exception {
        return null;
    }

    @Override
    public void crearLibroDiario(LibroDiario objLibroDiario) throws Exception {

    }

    @Override
    public LibroDiario editarLibroDiario(LibroDiario objLibroDiario) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarLibroDiario(int codigo) throws Exception {
        return false;
    }

    @Override
    public LibroDiario listarLibroDiarioByFecha(Date fecha) throws Exception {
        return null;
    }

    @Override
    public List<LibroDiario> listarLibroDiarioByPeriodo(int periodo) throws Exception {
        return null;
    }

    @Override
    public LibroDiario listarLibroDiarioById(int codigo) throws Exception {
        return null;
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
    public List<LibroMayor> listarLibrosMayores() throws Exception {
        return null;
    }

    @Override
    public void crearLibroMayor(LibroMayor objLibroMayor) throws Exception {

    }

    @Override
    public LibroMayor editarLibroMayor(LibroMayor objLibroMayor) throws Exception {
        return null;
    }

    @Override
    public boolean eliminarLibroMayor(LibroMayorPK pk) throws Exception {
        return false;
    }

    @Override
    public LibroMayor listarLibroMayorByPeriodo(int periodo) throws Exception {
        return null;
    }

    @Override
    public LibroMayor listarLibroMayorById(LibroMayorPK pk) throws Exception {
        return null;
    }
}
