package co.edu.usta.facade;

import co.edu.usta.persistence.crm.*;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface CRMFacade {

    //******************************************************************************
    //*                            TABLE PERIODO                                   *
	//******************************************************************************

    /**
     * Metodo que lista todos los Periodos
     * @return List<Periodo>. Representa una lista de los Periodos obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Periodo> listarPeriodos() throws Exception;

    /**
     * Metodo que permite crear un Periodo
     * @param objPeriodo Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearPeriodo(Periodo objPeriodo) throws Exception;

    /**
     * Metodo que permite actualizar un Periodo
     * @param objPeriodo Representa el objeto que será actualizado.
     * @return Periodo. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Periodo editarPeriodo(Periodo objPeriodo) throws Exception;

    /**
     * Metodo que elimina un Periodo de manera permanente
     * @param codigo Entero que representa la PK de Periodo
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarPeriodo(int codigo) throws Exception;

    /**
     * Metodo que busca un Periodo por codigo
     * @param codigo Entero que representa la PK de Periodo
     * @return Periodo. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Periodo listarPeriodoById(int codigo) throws Exception;


    //******************************************************************************
    //*                            TABLE CAMPAÑA                                   *
    //******************************************************************************

    /**
     * Metodo que lista todas las Campañas
     * @return List<Campania>. Representa una lista de las campañas obtenidas
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Campania> listarCampanias() throws Exception;

    /**
     * Metodo que permite crear una Campaña
     * @param objCampania Representa el objeto que será creado.
     * @param eventos Representa la lista de eventos de la campaña
     * @param medios Representa la lista de medios de la campaña
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearCampania(Campania objCampania,List<Evento> eventos, List<Medio> medios) throws Exception;

    /**
     * Metodo que permite actualizar una Campaña
     * @param objCampania Representa el objeto que será actualizado.
     * @return Campania. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Campania editarCampania(Campania objCampania) throws Exception;

    /**
     * Metodo que elimina una Campaña de manera permanente
     * @param codigo Entero que representa la PK de Campaña
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarCampania(int codigo) throws Exception;

    /**
     * Metodo que busca una Campaña por nombre
     * @param nombre Representa el nombre dela Campaña que quiere ser buscada
     * @return Campania. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Campania listarCampaniaByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca Campañas por un nombre
     * @param nombre Representa el nombre de las Campañas que quieren ser buscadas
     * @return List<Campania>. Contiene la todos los objetos que coinciden con la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Campania> listarCampaniasByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca un Campaña por codigo
     * @param codigo Entero que representa la PK de Campaña
     * @return Campania. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Campania listarCampaniaById(int codigo) throws Exception;


    //******************************************************************************
    //*                             TABLE EVENTO                                   *
    //******************************************************************************

    /**
     * Metodo que lista todos los Eventos
     * @return List<Evento>. Representa una lista de los Eventos obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Evento> listarEventos() throws Exception;

    /**
     * Metodo que permite crear un Evento
     * @param objEvento Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearEvento(Evento objEvento) throws Exception;

    /**
     * Metodo que permite actualizar un Evento
     * @param objEvento Representa el objeto que será actualizado.
     * @return Evento. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Evento editarEvento(Evento objEvento) throws Exception;

    /**
     * Metodo que elimina un Evento de manera permanente
     * @param codigo Entero que representa la PK de Evento
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarEvento(int codigo) throws Exception;

    /**
     * Metodo que busca un Evento por nombre
     * @param nombre Representa el nombre del Evento que quiere ser buscado
     * @return Evento. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Evento listarEventoByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca Eventos por un nombre
     * @param nombre Representa el nombre de los Eventos que quieren ser buscados
     * @return List<Evento>. Contiene la todos los objetos que coinciden con la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Evento> listarEventosByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca un Evento por codigo
     * @param codigo Entero que representa la PK de Evento
     * @return Evento. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Evento listarEventoById(int codigo) throws Exception;

    //******************************************************************************
    //*                            TABLE RECURSO                                   *
    //******************************************************************************

    /**
     * Metodo que lista todos los Recursos
     * @return List<Recurso>. Representa una lista de los Recursos obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Recurso> listarRecursos() throws Exception;

    /**
     * Metodo que permite crear un Recurso
     * @param objRecurso Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearRecurso(Recurso objRecurso) throws Exception;

    /**
     * Metodo que permite actualizar un Recurso
     * @param objRecurso Representa el objeto que será actualizado.
     * @return Recurso. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Recurso editarRecurso(Recurso objRecurso) throws Exception;

    /**
     * Metodo que elimina un Recurso de manera permanente
     * @param codigo Entero que representa la PK de Recurso
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarRecurso(int codigo) throws Exception;

    /**
     * Metodo que busca un Recurso por nombre
     * @param nombre Representa el nombre del Recurso que quiere ser buscado
     * @return Recurso. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Recurso listarRecursoByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca Recursos por un nombre
     * @param nombre Representa el nombre de los Recursos que quieren ser buscados
     * @return List<Recurso>. Contiene la todos los objetos que coinciden con la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Recurso> listarRecursosByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca un Recurso por codigo
     * @param codigo Entero que representa la PK de Recurso
     * @return Recurso. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Recurso listarRecursoById(int codigo) throws Exception;


    //******************************************************************************
    //*                            TABLE TIPO MEDIO                                *
    //******************************************************************************

    /**
     * Metodo que lista todos los Tipos de medio
     * @return List<Recurso>. Representa una lista de los Tipos de medio obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Recurso> listarTipoMedio() throws Exception;

    /**
     * Metodo que permite crear un Tipo de medio
     * @param objTipoMedio Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearTipoMedio(TipoMedio objTipoMedio) throws Exception;

    /**
     * Metodo que permite actualizar un Tipo de medio
     * @param objTipoMedio Representa el objeto que será actualizado.
     * @return TipoMedio. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    TipoMedio editarTipoMedio(TipoMedio objTipoMedio) throws Exception;

    /**
     * Metodo que elimina un Tipo de medio de manera permanente
     * @param codigo Entero que representa la PK de TipoMedio
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarTipoMedio(int codigo) throws Exception;

    /**
     * Metodo que busca un Tipo de medio por nombre
     * @param nombre Representa el nombre del TipoMedio que quiere ser buscado
     * @return TipoMedio. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    TipoMedio listarTipoMedioByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca Tipos de medio por un nombre
     * @param nombre Representa el nombre de los TipoMedio que quieren ser buscados
     * @return List<TipoMedio>. Contiene la todos los objetos que coinciden con la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<TipoMedio> listarTiposMedioByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca un Tipo de medio por codigo
     * @param codigo Entero que representa la PK de TipoMedio
     * @return TipoMedio. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    TipoMedio listarTipoMedioById(int codigo) throws Exception;

    //******************************************************************************
    //*                            TABLE MEDIO                                   *
    //******************************************************************************

    /**
     * Metodo que lista todos los Medios
     * @return List<Medio>. Representa una lista de los Medios obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Medio> listarMedios() throws Exception;

    /**
     * Metodo que permite crear un Medio
     * @param objMedio Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearMedio(Medio objMedio) throws Exception;

    /**
     * Metodo que permite actualizar un Medio
     * @param objMedio Representa el objeto que será actualizado.
     * @return Medio. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Medio editarMedio(Medio objMedio) throws Exception;

    /**
     * Metodo que elimina un Medio de manera permanente
     * @param codigo Entero que representa la PK de Medio
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarMedio(int codigo) throws Exception;

    /**
     * Metodo que busca un Medio por nombre
     * @param nombre Representa el nombre del Medio que quiere ser buscado
     * @return Medio. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Medio listarMedioByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca Medios por un nombre
     * @param nombre Representa el nombre de los Medios que quieren ser buscados
     * @return List<Medio>. Contiene la todos los objetos que coinciden con la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Medio> listarMediosByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca un Medio por codigo
     * @param codigo Entero que representa la PK de Medio
     * @return Medio. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Medio listarMedioById(int codigo) throws Exception;
}
