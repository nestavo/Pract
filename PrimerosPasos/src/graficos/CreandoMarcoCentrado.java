package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MarcoCentrado mimarco= new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MarcoCentrado extends JFrame{
	
	
	public MarcoCentrado() {
		
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		
		Dimension tamanopantalla=mipantalla.getScreenSize();
		
		int alturapantalla=tamanopantalla.height;
		int anchopantalla=tamanopantalla.width	;
		
		setSize(anchopantalla/2,alturapantalla/2);
		setLocation(anchopantalla/4,alturapantalla/4);
		
		setTitle("Marco Centrado");
        Image miIcono=mipantalla.getImage("icono.png");
		
		setIconImage(miIcono);
	}
}