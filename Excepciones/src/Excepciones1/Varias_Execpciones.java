package Excepciones1;

import javax.swing.JOptionPane;

public class Varias_Execpciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			division();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Estas dividiendo por cero");
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Nos han introducido un numero entero");
	
		System.out.println(e.getMessage());
		
		System.out.println("Se ha generado un error de este tipo " + e.getClass());
		}
		
		
	}


static void division(){
	
	
	Double num1= Double.parseDouble(JOptionPane.showInputDialog("Introduce el dividendo"));
	
	Double num2= Double.parseDouble(JOptionPane.showInputDialog("Introduce el divisor"));	

	
	System.out.println("El resultado es "+ num1/num2);
	
}

}