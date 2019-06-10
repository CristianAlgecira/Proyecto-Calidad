package co.edu.usta.facade;

import co.edu.usta.persistence.finanzas.*;

import javax.ejb.Remote;
import java.util.Date;
import java.util.List;

@Remote
public interface FinanzasFacade {

    //******************************************************************************
    //*                        TABLE PlAN CONTABLE                                 *
    //******************************************************************************

    /**
     * Metodo que lista todos los Planes Contables de la empresa
     * @return List<PlanContable>. Representa una lista de los Planes Contables obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<PlanContable> listarPlanesContables() throws Exception;

    /**
     * Metodo que permite crear un Plan Contable
     * @param objPlan Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearPlanContable(PlanContable objPlan) throws Exception;

    /**
     * Metodo que permite actualizar un Plan Contable
     * @param objPlan Representa el objeto que será actualizado.
     * @return PlanContable. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    PlanContable editarPlanContable(PlanContable objPlan) throws Exception;

    /**
     * Metodo que elimina un Plan Contable de manera permanente
     * @param codigo Entero que representa el codigo del Plan Contable
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarPlanContable(int codigo) throws Exception;

    /**
     * Metodo que busca un Plan Contable por nombre
     * @param nombre Representa el nombre del Plan Contable que quiere ser buscado
     * @return PlanContable. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    PlanContable listarPlanByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca un Plan Contables por un nombre
     * @param nombre Representa el nombre de los Planes Contables que quieren ser buscados
     * @return List<PlanContable>. Contiene la todos los objetos que coinciden con la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<PlanContable> listarPlanesByNombre(String nombre) throws Exception;

    /**
     * Metodo que busca un Plan Contable por codigo
     * @param codigo Entero que representa el codigo de PlanContable
     * @return PlanContable. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    PlanContable listarPlanContableById(int codigo) throws Exception;

    //******************************************************************************
    //*                          TABLE LIBRO DIARIO                                *
    //******************************************************************************

    /**
     * Metodo que lista todos los Libros Diarios
     * @return List<LibroDiario>. Representa una lista de los Libros Diarios obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<LibroDiario> listarLibrosDiarios() throws Exception;

    /**
     * Metodo que permite crear un Libro Diario
     * @param objLibroDiario Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearLibroDiario(LibroDiario objLibroDiario) throws Exception;

    /**
     * Metodo que permite actualizar un Libro Diario
     * @param objLibroDiario Representa el objeto que será actualizado.
     * @return LibroDiario. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    LibroDiario editarLibroDiario(LibroDiario objLibroDiario) throws Exception;

    /**
     * Metodo que elimina un Libro Diario de manera permanente
     * @param codigo Entero que representa la PK de LibroDiario
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarLibroDiario(int codigo) throws Exception;

    /**
     * Metodo que busca un Libro Diario por fecha
     * @param fecha Date que representa la fecha del libro
     * @return LibroDiario. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    LibroDiario listarLibroDiarioByFecha(Date fecha) throws Exception;

    /**
     * Metodo que busca los Libro Diario en un  periodo
     * @param periodo Entero que representa el codigo de periodo
     * @return List<LibroDiario>. Lista que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<LibroDiario> listarLibroDiarioByPeriodo(int periodo) throws Exception;

    /**
     * Metodo que busca un Libro Diario por codigo
     * @param codigo Entero que representa la PK de LibroDiario
     * @return LibroDiario. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    LibroDiario listarLibroDiarioById(int codigo) throws Exception;

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
    //*                         TABLE LIBRO MAYOR                                  *
    //******************************************************************************

    /**
     * Metodo que lista todos los LibrosMayores
     * @return List<Libro Mayor>. Representa una lista de los Libros Mayores obtenidos
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    List<LibroMayor> listarLibrosMayores() throws Exception;

    /**
     * Metodo que permite crear un Libro Mayor
     * @param objLibroMayor Representa el objeto que será creado.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    void crearLibroMayor(LibroMayor objLibroMayor) throws Exception;

    /**
     * Metodo que permite actualizar un Libro Mayor
     * @param objLibroMayor Representa el objeto que será actualizado.
     * @return Libro Mayor. Representa el objeto que fue actualizado
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    LibroMayor editarLibroMayor(LibroMayor objLibroMayor) throws Exception;

    /**
     * Metodo que elimina un Libro Mayor de manera permanente
     * @param pk Clase que representa la llave primaria de Libro Mayor
     * @return Boolean. True: Si se eliminó correctamente, False si no se borró.
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    boolean eliminarLibroMayor(LibroMayorPK pk) throws Exception;

    /**
     * Metodo que busca un Libro Mayor por periodo
     * @param periodo Entero que representa el codigo de periodo
     * @return LibroMayor. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    LibroMayor listarLibroMayorByPeriodo(int periodo) throws Exception;

    /**
     * Metodo que busca un Libro Mayor por codigo
     * @param pk Entero que representa la Llave primaria de Libro Mayor
     * @return Libro Mayor. Objeto que contiene el resultado de la busqueda
     * @throws Exception Captura todos los posibles errores  sobre la ejecución
     */
    LibroMayor listarLibroMayorById(LibroMayorPK pk) throws Exception;
}
