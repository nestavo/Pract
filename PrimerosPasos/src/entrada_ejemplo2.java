import javax.swing.*;
public class entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nombre_usuario =JOptionPane.showInputDialog("introduce tu nombre");
		String edad_usuario = JOptionPane.showInputDialog("dime tu edad");
	int edad=Integer.parseInt(edad_usuario);
	
edad++;
		
		System.out.println("hola "+nombre_usuario+ ". el año q viene tienes "+(edad)+ " años");
	
	}

}
