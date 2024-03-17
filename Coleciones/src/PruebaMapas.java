import java.util.*;
public class PruebaMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String, Empleado> personal= new HashMap<String, Empleado>();
		
		personal.put("145", new Empleado("Alba"));
		
		personal.put("146", new Empleado("Nes"));
		
		personal.put("147", new Empleado("Estavin"));
		
		personal.put("148", new Empleado("Maria"));
		
		personal.put("149", new Empleado("Ana"));
		
		
		
		System.out.println(personal);
		
		personal.remove("148");
		
		System.out.println(personal);
		
		personal.put("148", new Empleado("Natalia"));
		
		System.out.println(personal);
		
		//System.out.println(personal.entrySet());
		
		for (Map.Entry<String, Empleado> entrada: personal.entrySet()){
			
			String clave=entrada.getKey();
			Empleado valor=entrada.getValue();
			
			
			System.out.println("Clave=" + clave+ ", Valor=" + valor);
			
		}
		
		
	}

}


class Empleado{
	
	public Empleado(String n) {
		
		nombre=n;
		
		sueldo= 2000;
		
	}
	public String toString() {
		
		return "[Nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	private String nombre;
	private double sueldo;
}