package es.pildoras.pruebaannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       //Leer el xml de configuración
		
	//	ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//leer el class de configuracion
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
	//Pedir un bean al contenedor
		
	/*	Empleado Antonio= contexto.getBean("comercialExperimentado", Empleado.class);
		
		Empleado Lucia= contexto.getBean("comercialExperimentado", Empleado.class);
		
		
		//apuntan al mismo objeto en memoria?
		
		if(Antonio==Lucia) {
			
			System.out.println("Apuntan al mismo lugar en memoria");
		    System.out.println(Antonio+ "\n" + Lucia);
		   
		}else {
			System.out.println("No Apuntan al mismo lugar en memoria");
		    System.out.println(Antonio+ "\n" + Lucia);
		   
		}
		*/
		
		//PEDIR UN BEAN AL CONTENEDOR
	/*	Empleado empleado = contexto.getBean("DirectorFinanciero", Empleado.class);
		
		
		System.out.println(empleado.getTareas());
		
		System.out.println(empleado.getInforme());*/
		
		DirectorFinanciero empleado=contexto.getBean("DirectorFinanciero", DirectorFinanciero.class);
		
		
		System.out.println("Email del director: " + empleado.getEmail());
		System.out.println(empleado.getNombreEmpresa());
		
		
		contexto.close();
	}
	

}
