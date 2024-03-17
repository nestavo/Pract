package pildoras.Ioc;

public class JefeEmpleado implements Empleados{
	
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;

	public String getTareas() {
		
		return "Gestiono las cuestiones relativas a mis empleados de seccion";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe presentado por el Jefe con arreglos; " + informeNuevo.getInforme();
		
		
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

	private String email;

	private String nombreEmpresa;
}

