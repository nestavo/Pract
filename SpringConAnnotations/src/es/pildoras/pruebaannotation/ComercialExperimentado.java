package es.pildoras.pruebaannotation;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component

public class ComercialExperimentado implements Empleado, InitializingBean , DisposableBean {

	
	//ejecucion de codigo despues de la creacion del bean
	
    
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Ejecutado tras creacion de Bean");
	}

	
	
	//ejecucion de codigo despues del aoagado del contendor Spring
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ejecutado antes de la destruccion");
	}
		
		
	
	//constructores
	public ComercialExperimentado() {
		
	}
	
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

    /* @Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

	
	
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y Vender más";
	}

	
	public String getInforme() {
		// TODO Auto-generated method stub
	//	return "Informe generado por el comercial";
		
		return nuevoInforme.getInformeFinanciero();
	}

	@Autowired
	@Qualifier("informeFinancieroTrim2")
	private CreacionInformeFinanciero nuevoInforme;





}
