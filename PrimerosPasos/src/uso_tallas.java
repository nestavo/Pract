import java.util.Scanner;

public class uso_tallas {

	//enum Talla{MINI,MEDIANO,GRANDE,MUY_GRANDE};
	
	enum Talla{
		
		MINI("S"),MEDIANAO("M"),GRANDE("L"),MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {
			
			this.abreviatura=abreviatura;
			
			
		}
		
		public String dameAbreviaura() {
			
			return abreviatura;
		}
		
		private String abreviatura;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("escribe una talla");
		
		String entrada_datos=entrada.next().toUpperCase();
		
		Talla la_talla= Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla= "+ la_talla);
		
		System.out.println("abreviatura= "+ la_talla.abreviatura);
		
		
		/*	Talla s = Talla.MINI;
		Talla m = Talla.MEDIANO;
		Talla l = Talla.GRANDE;
		Talla xl = Talla.MUY_GRANDE;*/
				
		
	}

}
