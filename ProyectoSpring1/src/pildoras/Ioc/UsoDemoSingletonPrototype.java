package pildoras.Ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//carga xml configuracion
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//peticion de beans al contenedor Spring
		
		SecretarioEmpleado Alba=(SecretarioEmpleado) contexto.getBean("miSecretarioEmpleado", Empleados.class);
		
		SecretarioEmpleado Nes=(SecretarioEmpleado) contexto.getBean("miSecretarioEmpleado", Empleados.class);
		
		SecretarioEmpleado Vin=(SecretarioEmpleado) contexto.getBean("miSecretarioEmpleado", Empleados.class);
		
		SecretarioEmpleado Nesta=(SecretarioEmpleado) contexto.getBean("miSecretarioEmpleado", Empleados.class);
		
		SecretarioEmpleado Martin=(SecretarioEmpleado) contexto.getBean("miSecretarioEmpleado", Empleados.class);
		
		
		System.out.println(Nes);
		
		System.out.println(Alba);
		
		System.out.println(Vin);
		
		System.out.println(Nesta);
		
		System.out.println(Martin);
		
		
		
		/*if(Nes==Alba) System.out.println("Son el mismo objeto");
		else System.out.println("No son el mismo objeto");*/
	}

}
