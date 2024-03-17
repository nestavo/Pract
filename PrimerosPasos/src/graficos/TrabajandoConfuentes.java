package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConfuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConFuentes mimarco=new MarcoConFuentes();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes() {
		
		setTitle("Prueba con Fuentes");
		setSize(400, 400);
		LaminaConFuentes milamina=new LaminaConFuentes();
		add(milamina);
		milamina.setBackground(SystemColor.window);
		
		milamina.setForeground(Color.BLUE);
		
	}
	
	
}

class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(getGraphics());
		Graphics2D g2=(Graphics2D) g;
		
		Font mifuente=new Font("Courier", Font.BOLD,26);
		g2.setFont(mifuente);
		//g2.setColor(Color.blue);
		g2.drawString("nes", 100, 100);
		
		g2.setFont(new Font("Arial",Font.ITALIC,24));
		//g2.setColor(new Color(128,90,50).brighter());
		g2.drawString("Curso de java", 100,200);
				
	}
}


