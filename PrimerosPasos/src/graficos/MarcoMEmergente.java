package graficos;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class MarcoMEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MarcoEmergenteM mimarco= new MarcoEmergenteM();
     mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoEmergenteM extends JFrame{
	
	
	public MarcoEmergenteM(){
		
	setBounds(100,100,300,250);
	LaminaEmegenteM milamina= new LaminaEmegenteM();
	add (milamina);
	setVisible(true);
		
	}
}
class LaminaEmegenteM extends JPanel{
	
	public LaminaEmegenteM(){
	//---------------------
	setLayout(new BorderLayout());
		
		JPanel laminaMenu= new JPanel();
		
		JMenuBar mibarra= new JMenuBar();
		
		
		JMenu fuente=new JMenu("Fuente");
		JMenu estilo=new JMenu("Estilo");
		JMenu tamagno=new JMenu("Tamaño");
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
		
		laminaMenu.add(mibarra);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		JTextPane miarea=new JTextPane();
		
		add(miarea, BorderLayout.CENTER);
		
		
		//-----------------------
		JPopupMenu emergente = new JPopupMenu();
	
	JMenuItem opcion1= new JMenuItem("Opcion 1");
	JMenuItem opcion2= new JMenuItem("Opcion 2");
	JMenuItem opcion3= new JMenuItem("Opcion 3");
	JMenuItem opcion4= new JMenuItem("Opcion 4");
	
	emergente.add(opcion1);
	emergente.add(opcion2);
	emergente.add(opcion3);
	emergente.add(opcion4);
	
	miarea.setComponentPopupMenu(emergente);
		
	}
}