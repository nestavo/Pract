package es.pildoras.pruebaannotation;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleado {

	
	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		InformeFinanciero = informeFinanciero;
	}
	

	public String getEmail() {
		return email;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y direccion de las operaciones finanacieras de la empresa";
	}


	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return InformeFinanciero.getInformeFinanciero();
	}

	private CreacionInformeFinanciero InformeFinanciero; 
	
	
	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
}
