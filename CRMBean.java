package co.edu.usta.bean;

import co.edu.usta.facade.CRMFacade;
import co.edu.usta.persistence.crm.*;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
public class CRMBean implements CRMFacade{

    @PersistenceContext(unitName = "UstaJPA-CRM")
    private EntityManager manager;

    public CRMBean() {
    }

    @Override
    public List<Periodo> listarPeriodos() throws Exception {
        List<Periodo> periodos = new ArrayList<>();
        Query q = manager.createNamedQuery(Periodo.LISTAR_PERIODO);
        periodos = q.getResultList();
        return periodos;
    }

    @Override
    public void crearPeriodo(Periodo objPeriodo) throws Exception{
        Date fechaInicio = objPeriodo.getFechaInicio();
        Date fechaFin = objPeriodo.getFechaFin();
        if(fechaInicio.before(fechaFin)){
            manager.persist(objPeriodo);
        }
    }

    @Override
    public Periodo editarPeriodo(Periodo objPeriodo) throws Exception {
        Periodo periodo = buscarPeriodoById(objPeriodo.getCodigo());
        if (periodo.getCodigo() > 0) {
            Date fechaInicio = objPeriodo.getFechaInicio();
            Date fechaFin = objPeriodo.getFechaFin();
            if(fechaInicio.before(fechaFin)){
                manager.merge(objPeriodo);
            }
        } else {
            periodo = null;
        }
        return periodo;
    }

    @Override
    public boolean eliminarPeriodo(int codigo) throws Exception {
        Periodo objPeriodo = buscarPeriodoById(codigo);
        boolean retorno = false;
        if (objPeriodo.getCodigo() > 0) {
            manager.remove(objPeriodo);
            retorno = true;
        }
        return retorno;
    }

    @Override
    public Periodo listarPeriodoById(int codigo) throws Exception {
        /*Periodo objPeriodo = new Periodo();
        if (codigo > 0) {
            Query q = em.createNamedQuery(Periodo.LISTAR_PLANBYID).setParameter("codigo", codigo);
            objPeriodo = (Periodo) q.getSingleResult();
        }
        return objPeriodo;*/
        return null;
    }

    private Periodo buscarPeriodoById(int codigo) throws Exception {
        Periodo objPeriodo;
        objPeriodo = manager.find(Periodo.class, codigo);
        return objPeriodo;
    }

    @Override
    public List<Campania> listarCampanias() throws Exception {
        return null;
    }

    @Override
    public void crearCampania(Campania objCampania,List<Evento> eventos, List<Medio> medios) throws Exception {
        Date fechaInicio = objCampania.getFechaInicio();
        Date fechaFin = objCampania.getFechaFin();
        if(fechaInicio.before(fechaFin)&&numeroDias(fechaInicio,fechaFin)<=90&&objCampania.getValor()<5000000){
            if(eventos.size()>=2 && eventos.size()<=10 && medios.size()>0){
                manager.persist(objCampania);
                for (Evento evento : eventos) {
                    crearEvento(evento);
                }
                for (Medio medio:medios){
                    crearMedio(medio);
                }
            }
        }
    }

    private int numeroDias(Date inicio, Date fin){
        long startTime = inicio.getTime();
        long endTime = fin.getTime();
        long diffTime = endTime - startTime;
        return (int) TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
    }

    @Override
    public Campania editarCampania(Campania objCampania) throws Exception {
        Campania campania = buscarCampaniaById(objCampania.getCodigo());
        if (campania.getCodigo() > 0) {
            manager.merge(objCampania);
        } else {
            campania = null;
        }
        return campania;
    }

    @Override
    public boolean eliminarCampania(int codigo) throws Exception {
        Campania objCampania = buscarCampaniaById(codigo);
        boolean retorno = false;
        if (objCampania.getCodigo() > 0) {
            manager.remove(objCampania);
            retorno = true;
        }
        return retorno;
    }

    @Override
    public Campania listarCampaniaByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public List<Campania> listarCampaniasByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public Campania listarCampaniaById(int codigo) throws Exception {
        return null;
    }

    private Campania buscarCampaniaById(int codigo) throws Exception {
        Campania objCampania;
        objCampania = manager.find(Campania.class, codigo);
        return objCampania;
    }

    @Override
    public List<Evento> listarEventos() throws Exception {
        return null;
    }

    @Override
    public void crearEvento(Evento objEvento) throws Exception {
        manager.persist(objEvento);
    }

    @Override
    public Evento editarEvento(Evento objEvento) throws Exception {
        Evento evento = buscarEventoById(objEvento.getCodigo());
        if (evento.getCodigo() > 0) {
            manager.merge(objEvento);
        } else {
            evento = null;
        }
        return evento;
    }

    @Override
    public boolean eliminarEvento(int codigo) throws Exception {
        Evento objEvento = buscarEventoById(codigo);
        boolean retorno = false;
        if (objEvento.getCodigo() > 0) {
            manager.remove(objEvento);
            retorno = true;
        }
        return retorno;
    }

    @Override
    public Evento listarEventoByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public List<Evento> listarEventosByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public Evento listarEventoById(int codigo) throws Exception {
        return null;
    }

    private Evento buscarEventoById(int codigo) throws Exception {
        Evento objEvento;
        objEvento = manager.find(Evento.class, codigo);
        return objEvento;
    }

    @Override
    public List<Recurso> listarRecursos() throws Exception {
        return null;
    }

    @Override
    public void crearRecurso(Recurso objRecurso) throws Exception {
        manager.persist(objRecurso);
    }

    @Override
    public Recurso editarRecurso(Recurso objRecurso) throws Exception {
        Recurso recurso = buscarRecursoById(objRecurso.getCodigo());
        if (recurso.getCodigo() > 0) {
            manager.merge(objRecurso);
        } else {
            recurso = null;
        }
        return recurso;
    }

    @Override
    public boolean eliminarRecurso(int codigo) throws Exception {
        Recurso objRecurso = buscarRecursoById(codigo);
        boolean retorno = false;
        if (objRecurso.getCodigo() > 0) {
            manager.remove(objRecurso);
            retorno = true;
        }
        return retorno;
    }

    @Override
    public Recurso listarRecursoByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public List<Recurso> listarRecursosByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public Recurso listarRecursoById(int codigo) throws Exception {
        return null;
    }

    private Recurso buscarRecursoById(int codigo) throws Exception {
        Recurso objRecurso;
        objRecurso = manager.find(Recurso.class, codigo);
        return objRecurso;
    }

    @Override
    public List<Recurso> listarTipoMedio() throws Exception {
        return null;
    }

    @Override
    public void crearTipoMedio(TipoMedio objTipoMedio) throws Exception {
        manager.persist(objTipoMedio);
    }

    @Override
    public TipoMedio editarTipoMedio(TipoMedio objTipoMedio) throws Exception {
        TipoMedio tipoMedio = buscarTipoMedioById(objTipoMedio.getCodigo());
        if (tipoMedio.getCodigo() > 0) {
            manager.merge(objTipoMedio);
        } else {
            tipoMedio = null;
        }
        return tipoMedio;
    }

    @Override
    public boolean eliminarTipoMedio(int codigo) throws Exception {
        TipoMedio objTipoMedio = buscarTipoMedioById(codigo);
        boolean retorno = false;
        if (objTipoMedio.getCodigo() > 0) {
            manager.remove(objTipoMedio);
            retorno = true;
        }
        return retorno;
    }

    @Override
    public TipoMedio listarTipoMedioByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public List<TipoMedio> listarTiposMedioByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public TipoMedio listarTipoMedioById(int codigo) throws Exception {
        return null;
    }

    private TipoMedio buscarTipoMedioById(int codigo) throws Exception {
        TipoMedio objTipoMedio;
        objTipoMedio = manager.find(TipoMedio.class, codigo);
        return objTipoMedio;
    }

    @Override
    public List<Medio> listarMedios() throws Exception {
        return null;
    }

    @Override
    public void crearMedio(Medio objMedio) throws Exception {
        manager.persist(objMedio);
    }

    @Override
    public Medio editarMedio(Medio objMedio) throws Exception {
        Medio medio = buscarMedioById(objMedio.getCodigo());
        if (medio.getCodigo() > 0) {
            manager.merge(objMedio);
        } else {
            medio = null;
        }
        return medio;
    }

    @Override
    public boolean eliminarMedio(int codigo) throws Exception {
        Medio objMedio = buscarMedioById(codigo);
        boolean retorno = false;
        if (objMedio.getCodigo() > 0) {
            manager.remove(objMedio);
            retorno = true;
        }
        return retorno;
    }

    @Override
    public Medio listarMedioByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public List<Medio> listarMediosByNombre(String nombre) throws Exception {
        return null;
    }

    @Override
    public Medio listarMedioById(int codigo) throws Exception {
        return null;
    }

    private Medio buscarMedioById(int codigo) throws Exception {
        Medio objMedio;
        objMedio = manager.find(Medio.class, codigo);
        return objMedio;
    }
}
