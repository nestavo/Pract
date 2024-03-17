import java.util.*;

public class entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner entrada = new Scanner(System.in);

	System.out.println("Introduce tu nombre");
	
	String nombre_usuario=entrada.nextLine();
	
	System.out.println("introduce tu edad");
	  
	int edad= entrada.nextInt();
	
	System.out.println("dime tu dni");
	
	double dni=entrada.nextDouble();
		
	
	System.out.println("hola  "+ nombre_usuario + "el año que viene tendras "+  (edad+1) + " su dni es "+dni );
			
	}

}
