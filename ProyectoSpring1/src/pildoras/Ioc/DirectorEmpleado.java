package pildoras.Ioc;

public class DirectorEmpleado implements Empleados {

	//creacion de campo tipo creacionInforme (interfaz)
	
	private CreacionInformes informeNuevo;
	
	//creacion de constructor que inyecta la dependencia
	
	public DirectorEmpleado(CreacionInformes informenuevo) {
		
		this.informeNuevo=informenuevo;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	//metodo init. Ejecutar tareas antes de qie el bean esté disponible.
	
	public void metodoInicial(){
		
		System.out.println("Dentro del metodo init. Aqui irian las tareas a jecutar antes de que el bean este listo");
		
		
	}
	
	
	//metodo destroy. Ejecutar tareas despues de que haya sido utilizado
	
	public void metodoFinal(){
		
		System.out.println("Dentro del metodo Destroy. Aqui irian las tareas a jecutar antes de que el bean sea utilizado");
		
		
	}
	
	
	private String nombreEmpresa;
	private String email;
}
