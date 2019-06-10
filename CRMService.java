package co.edu.usta.service;

import co.edu.usta.facade.CRMFacade;
import co.edu.usta.persistence.crm.*;

import javax.ejb.*;
import java.util.List;

@Stateless
@LocalBean
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class CRMService {

    @EJB
    CRMFacade facade;

    public List<Periodo> listarPeriodos() throws Exception {
        return facade.listarPeriodos();
    }

    public void crearPeriodo(Periodo objPeriodo) throws Exception{
        facade.crearPeriodo(objPeriodo);
    }

    public Periodo editarPeriodo(Periodo objPeriodo) throws Exception {
        return facade.editarPeriodo(objPeriodo);
    }

    public boolean eliminarPeriodo(int codigo) throws Exception {
        return facade.eliminarPeriodo(codigo);
    }

    public Periodo listarPeriodoById(int codigo) throws Exception {
        return facade.listarPeriodoById(codigo);
    }

    public List<Campania> listarCampanias() throws Exception {
        return facade.listarCampanias();
    }

    public void crearCampania(Campania objCampania,List<Evento> eventos, List<Medio> medios) throws Exception {
        facade.crearCampania(objCampania,eventos,medios);
    }

    public Campania editarCampania(Campania objCampania) throws Exception {
        return facade.editarCampania(objCampania);
    }

    public boolean eliminarCampania(int codigo) throws Exception {
        return facade.eliminarCampania(codigo);
    }

    public Campania listarCampaniaByNombre(String nombre) throws Exception {
        return facade.listarCampaniaByNombre(nombre);
    }

    public List<Campania> listarCampaniasByNombre(String nombre) throws Exception {
        return facade.listarCampaniasByNombre(nombre);
    }

    public Campania listarCampaniaById(int codigo) throws Exception {
        return facade.listarCampaniaById(codigo);
    }

    public List<Evento> listarEventos() throws Exception {
        return facade.listarEventos();
    }

    public void crearEvento(Evento objEvento) throws Exception {
        facade.crearEvento(objEvento);
    }

    public Evento editarEvento(Evento objEvento) throws Exception {
        return facade.editarEvento(objEvento);
    }

    public boolean eliminarEvento(int codigo) throws Exception {
        return facade.eliminarEvento(codigo);
    }

    public Evento listarEventoByNombre(String nombre) throws Exception {
        return facade.listarEventoByNombre(nombre);
    }

    public List<Evento> listarEventosByNombre(String nombre) throws Exception {
        return facade.listarEventosByNombre(nombre);
    }

    public Evento listarEventoById(int codigo) throws Exception {
        return facade.listarEventoById(codigo);
    }

    public List<Recurso> listarRecursos() throws Exception {
        return facade.listarRecursos();
    }

    public void crearRecurso(Recurso objRecurso) throws Exception {
        facade.crearRecurso(objRecurso);
    }

    public Recurso editarRecurso(Recurso objRecurso) throws Exception {
        return facade.editarRecurso(objRecurso);
    }

    public boolean eliminarRecurso(int codigo) throws Exception {
        return facade.eliminarRecurso(codigo);
    }

    public Recurso listarRecursoByNombre(String nombre) throws Exception {
        return facade.listarRecursoByNombre(nombre);
    }

    public List<Recurso> listarRecursosByNombre(String nombre) throws Exception {
        return facade.listarRecursosByNombre(nombre);
    }

    public Recurso listarRecursoById(int codigo) throws Exception {
        return facade.listarRecursoById(codigo);
    }

    public List<Recurso> listarTipoMedio() throws Exception {
        return facade.listarTipoMedio();
    }

    public void crearTipoMedio(TipoMedio objTipoMedio) throws Exception {
        facade.crearTipoMedio(objTipoMedio);
    }

    public TipoMedio editarTipoMedio(TipoMedio objTipoMedio) throws Exception {
        return facade.editarTipoMedio(objTipoMedio);
    }

    public boolean eliminarTipoMedio(int codigo) throws Exception {
        return facade.eliminarTipoMedio(codigo);
    }

    public TipoMedio listarTipoMedioByNombre(String nombre) throws Exception {
        return facade.listarTipoMedioByNombre(nombre);
    }

    public List<TipoMedio> listarTiposMedioByNombre(String nombre) throws Exception {
        return facade.listarTiposMedioByNombre(nombre);
    }

    public TipoMedio listarTipoMedioById(int codigo) throws Exception {
        return facade.listarTipoMedioById(codigo);
    }

    public List<Medio> listarMedios() throws Exception {
        return facade.listarMedios();
    }

    public void crearMedio(Medio objMedio) throws Exception {
        facade.crearMedio(objMedio);
    }

    public Medio editarMedio(Medio objMedio) throws Exception {
        return facade.editarMedio(objMedio);
    }

    public boolean eliminarMedio(int codigo) throws Exception {
        return facade.eliminarMedio(codigo);
    }

    public Medio listarMedioByNombre(String nombre) throws Exception {
        return facade.listarMedioByNombre(nombre);
    }

    public List<Medio> listarMediosByNombre(String nombre) throws Exception {
        return facade.listarMediosByNombre(nombre);
    }

    public Medio listarMedioById(int codigo) throws Exception {
        return facade.listarMedioById(codigo);
    }

}
