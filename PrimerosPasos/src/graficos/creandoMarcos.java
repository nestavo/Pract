package graficos;

import javax.swing.*;

public class creandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miMarco marco1= new miMarco();
		//miMarco marco2= new miMarco();
		
		//marco2.setVisible(true);
		marco1.setVisible(true);
		//marco2.setSize(1000, 600);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class miMarco extends JFrame{
	
	
	public miMarco() {
		
		//setSize(500,300);
		
		//setLocation(500,300);
		setBounds(500,300,550,250);
		
		//setResizable(false); //no permite modificar el tamaño
		
		
	//	setExtendedState(MAXIMIZED_BOTH);//se abre a pantalla completa
		
		setTitle("mi ventana");
		
		
	}
}