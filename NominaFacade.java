package co.edu.usta.facade;

import co.edu.usta.persistence.nomina.*;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface NominaFacade {

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
    //*                            TABLE CONCEPTO                                  *
    //******************************************************************************

    /**
     * Metodo que lista todos los Conceptos
     * @return List<Concepto>. Representa una lista de los Conceptos obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Concepto> listarConceptos() throws Exception;

    /**
     * Metodo que permite crear un Concepto
     * @param objConcepto Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearConcepto(Concepto objConcepto) throws Exception;

    /**
     * Metodo que permite actualizar un Concepto
     * @param objConcepto Representa el objeto que será actualizado.
     * @return Concepto. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Concepto editarConcepto(Concepto objConcepto) throws Exception;

    /**
     * Metodo que elimina un Concepto de manera permanente
     * @param codigo Entero que representa la PK de Concepto
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarConcepto(int codigo) throws Exception;

    /**
     * Metodo que busca un Concepto por nombre
     * @param nombre Representa el nombre del Concepto que quiere ser buscado
     * @return Concepto. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Concepto listarConceptoByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca Conceptos por un nombre
     * @param nombre Representa el nombre de los Conceptos que quieren ser buscados
     * @return List<Concepto>. Contiene la todos los objetos que coinciden con la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Concepto> listarConceptosByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca un Concepto por codigo
     * @param codigo Entero que representa la PK de Concepto
     * @return Concepto. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Concepto listarConceptoById(int codigo) throws Exception;

    //******************************************************************************
    //*                              TABLE CARGO                                   *
    //******************************************************************************

    /**
     * Metodo que lista todos los Cargos
     * @return List<Cargo>. Representa una lista de los Cargos obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Cargo> listarCargos() throws Exception;

    /**
     * Metodo que permite crear un Cargo
     * @param objCargo Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearCargo(Cargo objCargo) throws Exception;

    /**
     * Metodo que permite actualizar un Cargo
     * @param objCargo Representa el objeto que será actualizado.
     * @return Cargo. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Cargo editarCargo(Cargo objCargo) throws Exception;

    /**
     * Metodo que elimina un Cargo de manera permanente
     * @param codigo Entero que representa la PK de Cargo
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarCargo(int codigo) throws Exception;

    /**
     * Metodo que busca un Cargo por nombre
     * @param nombre Representa el nombre del Cargo que quiere ser buscado
     * @return Cargo. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Cargo listarCargoByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca Cargos por un nombre
     * @param nombre Representa el nombre de los Cargos que quieren ser buscados
     * @return List<Cargo>. Contiene la todos los objetos que coinciden con la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Cargo> listarCargosByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca un Cargo por codigo
     * @param codigo Entero que representa la PK de Cargo
     * @return Cargo. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Cargo listarCargoById(int codigo) throws Exception;

    //******************************************************************************
    //*                           TABLE CONTRATO                                   *
    //******************************************************************************

    /**
     * Metodo que lista todos los Contratos
     * @return List<Contrato>. Representa una lista de los Contratos obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Contrato> listarContratos() throws Exception;

    /**
     * Metodo que permite crear un Contrato
     * @param objContrato Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearContrato(Contrato objContrato) throws Exception;

    /**
     * Metodo que permite actualizar un Contrato
     * @param objContrato Representa el objeto que será actualizado.
     * @return Contrato. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Contrato editarContrato(Contrato objContrato) throws Exception;

    /**
     * Metodo que elimina un Contrato de manera permanente
     * @param codigo Entero que representa la PK de Contrato
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarContrato(int codigo) throws Exception;

    /**
     * Metodo que busca un Contrato por dependencia
     * @param dependencia Entero que representa el codigo de la dependencia
     * @return List<Contrato> Lista que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Contrato> listarContratoByDependencia(int dependencia) throws Exception;

    /**
     * Metodo que busca un Contrato por cargo
     * @param cargo Entero que representa el codigo de la cargo
     * @return List<Contrato> Lista que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Contrato> listarContratoByCargo(int cargo) throws Exception;

    /**
     * Metodo que busca un Contrato por hoja de vida
     * @param hojaVida Entero que representa el codigo de la hoja de vida
     * @return List<Contrato> Lista que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<Contrato> listarContratoByHojaDeVida(int hojaVida) throws Exception;

    /**
     * Metodo que busca un Contrato por codigo
     * @param codigo Entero que representa la PK de Contrato
     * @return Contrato. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    Contrato listarContratoById(int codigo) throws Exception;

    //******************************************************************************
    //*                         TABLE DEPENDENCIA                                  *
    //******************************************************************************

    /**
     * Metodo que lista todas las Dependencias
     * @return List<Dependencia>. Representa una lista de las Dependencias obtenidas
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    List<Dependencia> listarDependencias() throws Exception;

    /**
     * Metodo que permite crear una Dependencia
     * @param objDependencia Representa el objeto que será creado.
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    void crearDependencia(Dependencia objDependencia) throws Exception;

    /**
     * Metodo que permite actualizar una Dependencia
     * @param objDependencia Representa el objeto que será actualizado.
     * @return Dependencia. Representa el objeto que fue actualizado
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    Dependencia editarDependencia(Dependencia objDependencia) throws Exception;

    /**
     * Metodo que elimina una Dependencia de manera permanente
     * @param codigo Entero que representa la PK de Dependencia
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    boolean eliminarDependencia(int codigo) throws Exception;

    /**
     * Metodo que busca una Dependencia por nombre
     * @param nombre Representa el nombre del Dependencia que quiere ser buscada
     * @return Dependencia. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    Dependencia listarDependenciaByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca Dependencias por un nombre
     * @param nombre Representa el nombre de las Dependencias que quieren ser buscadas
     * @return List<Dependencia>. Contiene la todos las objetos que coinciden con la busqueda
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    List<Dependencia> listarDependenciasByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca una Dependencia por codigo
     * @param codigo Entero que representa la PK de Dependencia
     * @return Dependencia. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    Dependencia listarDependenciaById(int codigo) throws Exception;

    //******************************************************************************
    //*                            TABLE NOMINA                                    *
    //******************************************************************************

    /**
     * Metodo que lista todas las Nominas
     * @return List<Nomina>. Representa una lista de las Nominas obtenidas
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    List<Nomina> listarNominas() throws Exception;

    /**
     * Metodo que permite crear una Nomina
     * @param objNomina Representa el objeto que será creado.
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    void crearNomina(Nomina objNomina) throws Exception;

    /**
     * Metodo que permite actualizar una Nomina
     * @param objNomina Representa el objeto que será actualizado.
     * @return Nomina. Representa el objeto que fue actualizado
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    Nomina editarNomina(Nomina objNomina) throws Exception;

    /**
     * Metodo que elimina una Nomina de manera permanente
     * @param codigo Entero que representa la PK de Nomina
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    boolean eliminarNomina(int codigo) throws Exception;

    /**
     * Metodo que busca una Nomina por nombre
     * @param nombre Representa el nombre del Nomina que quiere ser buscada
     * @return Nomina. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    Nomina listarNominaByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca Nominas por un nombre
     * @param nombre Representa el nombre de las Nominas que quieren ser buscadas
     * @return List<Nomina>. Contiene la todos las objetos que coinciden con la busqueda
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    List<Nomina> listarNominasByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca una Nomina por codigo
     * @param codigo Entero que representa la PK de Nomina
     * @return Nomina. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    Nomina listarNominaById(int codigo) throws Exception;

    //******************************************************************************
    //*                         TABLE HOJA DE VIDA                                 *
    //******************************************************************************

    /**
     * Metodo que lista todas las Hojas de Vida
     * @return List<HojaVida>. Representa una lista de las Hojas de Vida obtenidas
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    List<HojaVida> listarHojasDeVida() throws Exception;

    /**
     * Metodo que permite crear una HojaVida
     * @param objHojaVida Representa el objeto que será creado.
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    void crearHojaVida(HojaVida objHojaVida) throws Exception;

    /**
     * Metodo que permite actualizar una HojaVida
     * @param objHojaVida Representa el objeto que será actualizado.
     * @return HojaVida. Representa el objeto que fue actualizado
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    HojaVida editarHojaVida(HojaVida objHojaVida) throws Exception;

    /**
     * Metodo que elimina una Hoja de Vida de manera permanente
     * @param codigo Entero que representa la PK de HojaVida
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    boolean eliminarHojaVida(int codigo) throws Exception;

    /**
     * Metodo que busca una Hoja de Vida por nombre
     * @param nombre Representa el nombre del Hoja de Vida que quiere ser buscada
     * @return HojaVida. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    HojaVida listarHojaVidaByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca Hojas de Vida por un nombre
     * @param nombre Representa el nombre de las Hojas de Vida que quieren ser buscadas
     * @return List<HojaVida>. Contiene la todos las objetos que coinciden con la busqueda
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    List<HojaVida> listarHojasDeVidaByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca una Hoja de Vida por codigo
     * @param codigo Entero que representa la PK de HojaVida
     * @return HojaVida. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos las posibles errores  sobre la ejecución
     */
    HojaVida listarHojaVidaById(int codigo) throws Exception;
}
