package Excepciones1;

import javax.swing.JOptionPane;

public class Fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] mi_matriz=new int [5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=15;
		mi_matriz[2]=25;
		mi_matriz[3]=35;
		mi_matriz[4]=45;
		
		
		for (int i = 0; i < mi_matriz.length; i++) {
			
			
			System.out.println("Psicion " + i + " = "+ mi_matriz[i]);
			
		}
		
		//peticion datos
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		
				
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		
		System.out.println("Hola " + nombre + " Tienes " + edad + " Años " + " El programa termino su ejecución");
		
		
	}

}
