package graficos;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.LayoutManager2;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LibreDisposicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Marcolibre mimarco= new Marcolibre();
mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
class Marcolibre extends JFrame{
	
	public Marcolibre() {
		
		setBounds(450,350,900,400);
		LaminaLibre milamina = new LaminaLibre();
		add(milamina);
		setVisible(true);
	}
}
class LaminaLibre extends JPanel{
	
	public LaminaLibre() {
		
		setLayout(new EnColumnas());//utiliza nuestra propia disposicion
		
		JLabel nombre =new JLabel("Nombre: ");
		JLabel apellido =new JLabel("Apellido: ");
		
		JTextField c_nombre=new JTextField();
		JTextField c_apellido= new JTextField();
		
	/*	nombre.setBounds(20,23,80,10);
		c_nombre.setBounds(100,20,100,20);
		
		apellido.setBounds(20,60,80,15);
		c_apellido.setBounds(100,55,100,20);*/
	JLabel contra =new JLabel("Contraseña: ");
		
		JTextField c_contra = new JTextField();
		
		
		
		
		add(nombre);
		add(c_nombre);
		add(apellido);
		add(c_apellido);
		
		add(contra);
		add(c_contra);
		
		
	/*	JButton boton1= new JButton("Boton 1");
		boton1.setBounds(50, 50, 150, 50);
		add(boton1);
		
		JButton boton2= new JButton("Boton 2");
		boton2.setBounds(150,150, 150, 50);
		add(boton2);*/
	}
	
}

class EnColumnas implements LayoutManager{

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void layoutContainer(Container micontenedor) {
		// TODO Auto-generated method stub
	
		//int x;
		//int y = 20;
		int scrwd = micontenedor.getWidth();
		x = scrwd / 2;//punto central del contenedor
		for(int c = 0; c < micontenedor.getComponentCount(); c++) {
			Component obj = micontenedor.getComponent(c);
			obj.setBounds(x - 280, y, 100, 25);
			x += 80;
			if((c + 1) % 2 == 0) {
				x = scrwd / 2;
				y += 30;
			}
		}
	}
		
		
	/*	for(int c = 0; c < micontenedor.getComponentCount(); c++) {
			Component obj = micontenedor.getComponent(c);
			if(obj.getX() == 0 && obj.getY() == 0) {
				obj.setBounds(x, y, 100, 25);
			}
			x += 100;
			if((c + 1) % 2 == 0) {
				x = 20;
				y += 40;
			}
		}
	}*/
		
private int x=00;
	
	private int y=20;

	}
	







