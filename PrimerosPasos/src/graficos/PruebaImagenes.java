package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.imageio.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MarcoImagen mimarco=new MarcoImagen();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		
		setTitle("Prueba con Fuentes");
		setBounds(750,300,300,200);
		LaminaConImagen milamina=new LaminaConImagen();
		add(milamina);
		
		
	}
	
	
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen(){
		try {
			imagen = ImageIO.read(new File("src/graficos/albayypo.png"));//mas simplificado
		} catch (IOException e) {
		System.out.println("la imagen no se encuentra");//excepcion comprobada en extructura try cath
		}
		
	}
	
	
	public void paintComponent(Graphics g)  throws NullPointerException{
		
		super.paintComponent(getGraphics());
		
	
		
		//File miimgen=new File("src/graficos/alabayyo.jpg");
	try {
		

 int anchoimagen=imagen.getWidth(this);
 int largoimagen=imagen.getHeight(this);
		g.drawImage(imagen, 0, 0, null);
		
		for(int i=0;i<300;i++) {
			for(int j=0;j<200;j++) {
				if(i+j>0) {
				g.copyArea(0, 0, anchoimagen, largoimagen, anchoimagen*i, largoimagen*j);
			}
				}
		}
	} catch (Exception e) {
		g.drawString("NO SE HA PODIDO CARGAR LA IMAGEN", 10, 10);
	}
	}
	
	private Image imagen;
}


