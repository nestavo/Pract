package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Eventos_Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MarcoVentana mimarco=new MarcoVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana mimarco2=new MarcoVentana();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	
		mimarco.setTitle("ventana 1");
		mimarco2.setTitle("ventana 2");
		
		mimarco.setBounds(300, 300, 500, 350);
		mimarco2.setBounds(800, 300, 500, 350);
	}

}
class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		//setTitle("Respondiendo");
		//setBounds(300, 300,500,350);
		setVisible(true);
		
	/*	M_Ventana oyente_ventana=new M_Ventana();
		
		addWindowListener(oyente_ventana);*/
		
		addWindowListener(new M_Ventana());
	}
}

class M_Ventana extends WindowAdapter{

	/*@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("ventana abierta");
	}*/

	@Override
/*	public void windowClosing(WindowEvent e) {
		System.out.println("cerrando ventana");
		
	}*/

	
	public void windowClosed(WindowEvent e) {
		
		System.out.println("la ventana ha sido cerrada");
	}

	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("ha minimizado la ventana");
	}

	
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("ventana restaurada");
		
	}

	
	public void windowActivated(WindowEvent e) {
		
		System.out.println("ventana activada");
	}

	
	public void windowDeactivated(WindowEvent e) {
		System.out.println("ventana desactivada");
		
	}
	
	
	
}