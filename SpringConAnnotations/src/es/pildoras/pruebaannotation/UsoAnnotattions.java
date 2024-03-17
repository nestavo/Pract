package es.pildoras.pruebaannotation;

import org.springframework.context.support.*;


public class UsoAnnotattions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Leer el xml de configuración
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Pedir un bean al contenedor
		
		Empleado Antonio= contexto.getBean("comercialExperimentado", Empleado.class);
		//usar el bean
		
		
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());
		
		// Cerrar el contexto
		
		contexto.close();
	}

}
