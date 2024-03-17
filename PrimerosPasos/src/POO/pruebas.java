package POO;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		empleados trabajador1= new empleados ("nes mar");
		empleados trabajador2= new empleados ("alba gome");
		empleados trabajador3= new empleados ("encarna izq");
		empleados trabajador4= new empleados ("nestavin");
		trabajador1.cambiaSeccion("RRHH");
	
		
		System.out.println(trabajador1.devuelveDatos()+"\n"+ trabajador2.devuelveDatos()
		+"\n"+trabajador3.devuelveDatos()+"\n"+trabajador4.devuelveDatos());
		
		System.out.println(empleados.dameIdSig());
	}

}
class empleados{//CONSTRUCTOR
	public empleados (String nom) {
		nombre=nom;
		
		seccion = "administracion";
		
		id=idSig;
		idSig++;
	}
	
	public void cambiaSeccion(String seccion) {//GETTER
		
		this.seccion=seccion;
	}
	

	
	
	public  String devuelveDatos() {
		
		return "El nombre es: "+nombre + ", la seccion es "+ seccion+ " y el id es: "+id; 
	}
	
	
	
	public static String dameIdSig() {
		
		return "El id Siguiete es "+ idSig;
	}
	
	
	
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSig=1;
	 
 }


