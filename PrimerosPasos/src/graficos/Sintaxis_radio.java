package graficos;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Sintaxis_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Marco_radio_sintaxis mimarco= new Marco_radio_sintaxis();
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class Marco_radio_sintaxis extends JFrame{
	
	public Marco_radio_sintaxis() {
		
		setVisible(true);
		setBounds(550,300,500,300);
		lamina_radio_sintaxis milamina= new lamina_radio_sintaxis();
		add(milamina);
	}
}

class lamina_radio_sintaxis extends JPanel{
	public lamina_radio_sintaxis() {
		
	   
		ButtonGroup migrupo1=new ButtonGroup();
	   
		ButtonGroup migrupo2=new ButtonGroup();
		
		JRadioButton boton1=new JRadioButton("Azul", false);
		JRadioButton boton2=new JRadioButton("Rojo", true);
		JRadioButton boton3=new JRadioButton("Verde", false);
		
		migrupo1.add(boton1);
		migrupo1.add(boton2);
		migrupo1.add(boton3);
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		JRadioButton boton4=new JRadioButton("Masculino", false);
		JRadioButton boton5=new JRadioButton("Femenino", false);
		migrupo2.add(boton4);
		migrupo2.add(boton5);
		
		add(boton4);
		add(boton5);
		
	}
	
}
