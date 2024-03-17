package pildoras.Ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoClicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//cargar el xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		//obtencion del bean
		
		Empleados Nes= (Empleados) contexto.getBean("miEmpleado", Empleados.class);
		
		//cerrar el contexto
		
		System.out.println(Nes.getInformes());
		
		contexto.close();
		
	}

}
