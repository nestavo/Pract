package POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class uso_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		persona[] lasPersonas= new persona[2];
		
		lasPersonas[0]=new empleado2("Nestamar", 50000,2009,02,3);
		lasPersonas[1]=new alumno("Alba Gomez", "ADE");
		
		for (persona p: lasPersonas) {
			System.out.println(p.dameNombre()+" "+p.dameDescripcion());
			
		}
		
		
	}
}

abstract  class persona{

	public persona(String nom) {
		
		nombre=nom;
	}
	
	
	
	public String dameNombre(){
		
		return nombre;
	}
	
	
	public abstract String dameDescripcion();
	
	private String nombre;
	
	
	
}




class empleado2 extends persona{// metodo constructor
	 
	 
	 public empleado2(String nom, double sue, int agno, int mes, int dia) {//constructor
	  super(nom);
	 
	  sueldo=sue;
	  
	  GregorianCalendar calendario= new GregorianCalendar(agno, mes-1, dia);
	  
	  
	  altaContrato =calendario.getTime();
	  
	  ++Idsiguiente;
	  Id=Idsiguiente;
	  
	 }
	 
     public String dameDescripcion() {
    	 
    	 return "Este empleado tiene el ID "+Id+" con un sueldo de "
    	 +sueldo;
     }
	 
	 
	 
	 public double dameSueldo(){//getter
	   
	  return sueldo;
	 }
	 public Date DameFechaContrato() {//getter
	  return altaContrato;
	 }
	 
	 public void subeSueldo(double porcentaje) {//setter
	  
	  double aumento= sueldo*porcentaje/100;
	  
	  sueldo+=aumento;//operador += es aumento
	 }
	 
	 
	 
	 
	 private double sueldo;
	 private Date altaContrato;
	 private static int Idsiguiente;
	 private int Id;
	 
	}

    class alumno extends persona{
    	
    	
    	public alumno(String nom, String car) {
    		
    		super(nom);
    		carrera=car;
    	}
    	
    
    	
    	public String dameDescripcion() {
    		
    		return "Este alumno está estudiando la carrera de "+carrera;
    	}
    	private String carrera;
    }