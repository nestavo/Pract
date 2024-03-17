package graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PruebaArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPruebaArea mimarco = new MarcoPruebaArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}
class MarcoPruebaArea extends JFrame{
	
	public MarcoPruebaArea() {
		
		setTitle("Probando Área de Texto");
		setBounds(500,300,500,350);
			
		setLayout(new BorderLayout());
		
		laminaBotones=new JPanel();
		
		botonInsertar =new JButton("Insertar");
		
		botonInsertar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				areaTexto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme.....");
			}
		});
		
		laminaBotones.add(botonInsertar);
		 
		botonSaltoLinea=new JButton("Salto Linea"); 
		 
		botonSaltoLinea.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				boolean saltar =!areaTexto.getLineWrap();
				
				areaTexto.setLineWrap(saltar);
				
				if (saltar) {
					botonSaltoLinea.setText("Quitar Salto");
					
				}else {
					botonSaltoLinea.setText("Salto Linea");
				}
				
			}
		});
		laminaBotones.add(botonSaltoLinea);
		add(laminaBotones, BorderLayout.SOUTH);
		
		areaTexto=new JTextArea(8,20);
		LaminaConBarras=new JScrollPane(areaTexto);
		
		add(LaminaConBarras, BorderLayout.CENTER);
	}
	
	private JPanel laminaBotones;
	
	private JButton botonInsertar, botonSaltoLinea;
	
	private JTextArea areaTexto;
	
	private JScrollPane LaminaConBarras;
}