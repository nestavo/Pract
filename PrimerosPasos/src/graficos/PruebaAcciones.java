package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoAccion marco=new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}
class MarcoAccion extends JFrame{
	
	public MarcoAccion() {
		setTitle("Prueba Acciones");
		setBounds(500,350,900,300);
		PanelAccion lamina=new PanelAccion();
		
		add(lamina);
		
	}
}
class PanelAccion extends JPanel{
	
	public PanelAccion() {
		
		AccionColor accionAmarillo=new AccionColor("Amarillo",new ImageIcon("src/graficos/amarillo.gif"),Color.YELLOW );
		AccionColor accionAzul=new AccionColor("Azul",new ImageIcon("src/graficos/azul.gif"),Color.BLUE );
		AccionColor accionRojo=new AccionColor("Rojo",new ImageIcon("src/graficos/rojo.gif"),Color.RED);
	
/*	JButton botonAmarillo=new JButton(accionAmarillo);
	add(botonAmarillo);*/
		
		add (new JButton(accionAmarillo));
		add (new JButton(accionAzul));
		add (new JButton(accionRojo));
	
		
	/*	JButton botonAmarillo =new JButton("Amarillo");
		JButton botonAzul =new JButton("Azul");
		JButton botonRojo =new JButton("Rojo");
		
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);
		
		
		
	}*/
    InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

    //KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");
 
    mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
    mapaEntrada.put(KeyStroke.getKeyStroke("ctrl W"), "fondo_amarillo");
    
    mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
    mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
    ActionMap mapaAccion=getActionMap();
    
    mapaAccion.put("fondo_amarillo",accionAmarillo);
    mapaAccion.put("fondo_azul",accionAzul);
    mapaAccion.put("fondo_rojo",accionRojo);
    
	}
private class AccionColor extends AbstractAction{

	public AccionColor(String nombre, Icon icono, Color color_boton) {
	
		putValue(Action.NAME, nombre);
		putValue(Action.LARGE_ICON_KEY, icono);
		putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
		putValue("color de fondo", color_boton);
	
	}
	
	public void actionPerformed(ActionEvent e) {
		Color c=(Color)getValue("color de fondo");
		setBackground(c);
		
		System.out.println("nombre: "+getValue(Action.NAME)+" "+ getValue(Action.SHORT_DESCRIPTION));
	}
}
}