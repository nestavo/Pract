import java.util.*;

public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int aleatorio = (int)(Math.random()*10);
		
	
		
		Scanner entrada =new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		do {
			intentos++;
			System.out.println("introduce un numero");
			
		   numero=entrada.nextInt();
		   
		   if (aleatorio<numero) {
			   System.out.println("mas bajo");	   
		   }
		   
		   else if (aleatorio>numero) {
			   System.out.println("mas alto");
		   }
		}while(numero!=aleatorio);
		
		System.out.println("correcto has hecho "+intentos +" intentos");
	}
}
