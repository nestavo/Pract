import java.util.*;
public class Evalua_Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce tu edad");
		int edad =entrada.nextInt();
		if (edad<18) {
			System.out.println("eres adolescente");
		}
		else if(edad<40) {
			System.out.println("eres joven");
		}
		else if (edad<65){
			System.out.println("eres maduro");
		}
		else {
			System.out.println("cuidate");
		}
	}
	}
	
