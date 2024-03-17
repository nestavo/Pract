package pildoras.Ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//creacion de objetos
		
	//	Empleados Empleado1= new DirectorEmpleado();
		
		
				
		
		
		//uso de los objetos creados
		
		
		//System.out.println(Empleado1.getTareas());
		
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		JefeEmpleado Nes=(JefeEmpleado) contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Nes.getTareas());
		
		System.out.println(Nes.getInformes());
		
		System.out.println("Email de Nes: " + Nes.getEmail());
		
		System.out.println(Nes.getNombreEmpresa());
		
		/*SecretarioEmpleado Alba=(SecretarioEmpleado) contexto.getBean("miSecretarioEmpleado", Empleados.class);
		
		SecretarioEmpleado Vin=(SecretarioEmpleado) contexto.getBean("miSecretarioEmpleado", Empleados.class);
		
		System.out.println(Alba.getTareas());
		
		System.out.println(Alba.getInformes());
		
		System.out.println("E-mail: " + Alba.getEmail());
		
		System.out.println(Alba.getNombreEmpresa());
		
		System.out.println("E-mail Vin: " + Vin.getEmail());*/
		
		
		
		
		contexto.close();
		
	}
	

}
