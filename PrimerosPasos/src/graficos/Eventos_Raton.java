package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRaton mimarco=new MarcoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		
		setVisible(true);
		setBounds(500,300,600,450);
		
		EventosDeRaton EventoRaton=new EventosDeRaton();
		addMouseListener(EventoRaton);
	}
}
class EventosDeRaton extends MouseAdapter{

	
/*	public void mouseClicked(MouseEvent e) {
		//System.out.println("coordenada x: "+ e.getX()+ " Coordenada y: "+e.getY());
		System.out.println(e.getClickCount());
	}*/

	
	public void mousePressed(MouseEvent e) {
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			
			System.out.println("has pulsado el boton derecho");
		}else if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
		System.out.println("has pulsado la rueda del raton");
		}else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("has pulsdo el boton izquierdo");
		}
	}

	
/*	public void mouseReleased(MouseEvent e) {
		System.out.println("acabas de levantar");
		
	}*/

	
	/*public void mouseEntered(MouseEvent e) {
	System.out.println("acabas de entrar");
		
	}*/

	/*public void mouseExited(MouseEvent e) {
		System.out.println("acabas de salir");
		
	}*/
	
	
	
	
}