package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Event;
public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

			MarcoBotones mimarco= new MarcoBotones();
			
			mimarco.setVisible(true);
			
			
		   mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	}
	class MarcoBotones extends JFrame{
		
		
		public MarcoBotones() {
			
			setTitle("Botones y Eventos");
			setBounds(700,300,500,300);
			
			
			LaminaBotones milamina=new LaminaBotones();
		
			
			add(milamina);
			
			
		}

	
	}
	class LaminaBotones extends JPanel{
		
		
		JButton botonAzul=new JButton("Azul");
		JButton botonAmarillo=new JButton("Amarillo");
		JButton botonRojo=new JButton("Rojo");
		
		public LaminaBotones() {
			
			add(botonAzul);
			add(botonAmarillo);
			add(botonRojo);
		
		
	ColorFondo Amarillo=new ColorFondo(Color.YELLOW);
	ColorFondo Azul=new ColorFondo(Color.BLUE);
	ColorFondo Rojo=new ColorFondo(Color.RED);
	
		
		botonAzul.addActionListener(Azul);//al hacer clic
		
		botonRojo.addActionListener(Rojo);
		
		botonAmarillo.addActionListener(Amarillo);
		 
		}
		
		

		private class ColorFondo implements ActionListener{//clase interna
			
			public ColorFondo(Color c) {
				
				ColordeFondo=c;
			}
			
			public void actionPerformed(ActionEvent e) {
				
				setBackground(ColordeFondo);
			}
			
		

			private Color ColordeFondo;
		}

	
		
		
	
	
		
	/*	public void actionPerformed(ActionEvent e) {
			
			Object botonPulsado=e.getSource();
			
			if(botonPulsado==botonAzul) {
			
			setBackground(Color.BLUE);
			
			}
			else if (botonPulsado==botonAmarillo) {
				
				setBackground(Color.YELLOW);
			}
			else {
				setBackground(Color.RED);
			}
		}*/
	}
		
	
	
	
