package co.edu.usta;

import co.edu.usta.persistence.crm.Periodo;
import co.edu.usta.service.CRMService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestScoped
@Named("crmBean")
public class CRMController implements Serializable {

    @EJB
    private CRMService servicio;

    private List<Periodo> listPeriodo;
    private Map<String,String> periodos;

    public CRMController() {
        this.listPeriodo = new ArrayList<>();
        this.periodos = new HashMap<>();
    }

    @PostConstruct
    public void list() {
        try {
            listPeriodo = servicio.listarPeriodos();
            for (Periodo p:listPeriodo) {

                var format = new SimpleDateFormat("dd-MM-yyyy");
                var displayString = "Desde " + format.format(p.getFechaInicio()) + " a " + format.format(p.getFechaFin());
                periodos.put(displayString, p.getCodigo()+"");

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Periodo> getListPeriodo() {
        return listPeriodo;
    }

    public void setListPeriodo(List<Periodo> listPeriodo) {
        this.listPeriodo = listPeriodo;
    }

    public Map<String, String> getPeriodos() {
        return periodos;
    }

    public void setPeriodos(Map<String, String> periodos) {
        this.periodos = periodos;
    }
}
