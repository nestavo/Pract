import javax.swing.*;

public class Acceso_Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String clave = "nestavo";
	
	String pass = "";
	
	while (clave.equals(pass)==false) {
	
		pass=JOptionPane.showInputDialog("introduce la contraseña");
		
		if (clave.equals(pass)==false) {
			System.out.println("contraseña incorecta");
		}
	}
	System.out.println("contraseña correcta. Acceso permitido");
	}
}
	
