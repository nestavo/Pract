package cuadricula;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Marco_Dialogo extends JFrame{
	
	public Marco_Dialogo() {
		
		setTitle("Prueba de dialogos");
		
		setBounds(500,300,600,450);
		
		JPanel lamina_cuadricula = new JPanel();
		
		lamina_cuadricula.setLayout(new GridLayout(2,3));
		
		
		
		String primero []= {"Mensaje","Confirmar","Opción", "Entrada"};
		
		lamina_tipo=new Lamina_Botones("Tipo", primero);
		
		lamina_tipo_mensaje=new Lamina_Botones("Tipo de Mensaje", new
				String[] {
					"ERROR_MESSAGE",
					"INFORMATION_MESSAGE",
					"WARNING_MESSAGE",
					"QUESTION_MESAGGE",
					"PLAIN_MESSAGE"
				});
		lamina_mensaje=new Lamina_Botones("Mensaje", new String[] {
				
		"Cadena",
		"Icono",
		"Componente",
	    "Otros",
	    "Object[]"		
		});
		
		lamina_confirmar=new Lamina_Botones("Confirmar", new String[] {
				"DEFAULT_OPTION",
				"YES_NO_OPTION",
				"YES_NO_CANCEL_OPTION",
				"OK_CANCEL_OPTION"
		});
		
		lamina_opcion=new Lamina_Botones("Opción", new String[] {
		
				"String[]",
				"Icon[]",
				"Object[]"
				
		});
		
		lamina_entrada=new Lamina_Botones("Entrada", new String[] {
			"Campo de texto",
			"Combo"
		});
		
		
		setLayout(new BorderLayout());
		
		lamina_cuadricula.add(lamina_tipo);
		lamina_cuadricula.add(lamina_tipo_mensaje);
		lamina_cuadricula.add(lamina_mensaje);
		lamina_cuadricula.add(lamina_confirmar);
		lamina_cuadricula.add(lamina_opcion);
		lamina_cuadricula.add(lamina_entrada);
		
		//Se construye la lamina inferior
		
		JPanel lamina_mostrar=new JPanel();
		
		JButton boton_mostrar = new JButton("Mostrar");
		
		boton_mostrar.addActionListener(new AccionMostrar());
		
		lamina_mostrar.add(boton_mostrar);
		
		add(lamina_mostrar,BorderLayout.SOUTH);
		
		add(lamina_cuadricula, BorderLayout.CENTER);
		
		
	}
	
	
	//-------------------------PROPORCIONA EL MENSAJE-----------------------
	
     public Object dameMensaje() {
		
		String s  = lamina_mensaje.dameSeleccion();
		
		if(s.equals("Cadena")) {
			
			return cadenaMensaje;
			
		}else if(s.equals("Icono")) {
			
			return iconoMensaje;
			
			
		}else if(s.equals("Componente")) {
		return componenteMensaje;
		
	}else if (s.equals("Otros")) {
		
		return objetoMensaje;
		
}else if(s.equals("Object[]")){
		
		return new Object[] {cadenaMensaje,
				iconoMensaje,
				componenteMensaje,
				objetoMensaje
		};
		
	}else {
		return null;
	}
		
     }
//--------------------DEVUELVE TIPO ICONO y NUMERO DE BOTONES EN CONFIRMAR------------------------------
     
     public int dameTipo(Lamina_Botones lamina) {
    	 
    	 String s=lamina.dameSeleccion();
    	 
    	 if(s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")){
    		 return 0;
    		 
    	 }else if(s.equals("INFORMATION_MESSAGE")|| s.equals("YES_NO_CANCEL_OPTION")) {
    		 return 1;
    		 
    	 }else if(s.equals("WARNING_MESSAGE")|| s.equals("OK_CANCEL_OPTION")) {
    		 return 2;
    	 
    	 }else if (s.equals("QUESTION_MESAGGE")) {
    		 
    		 return 3;
    	 }else if(s.equals("PLAIN_MESSAGE")|| s.equals("DEFAULT_OPTION")) {
    		 
    	 
		return -1;
    	 
     }else {
    	 return (Integer) null;
     }
     }
	
	//------------------------------DA OPCIONES A LA LAMINA OPCION-----------------
	
     public Object [] dameOpciones(Lamina_Botones lamina) {
    	 
    	 String s=lamina.dameSeleccion();
    	 
    	 if(s.equals("String[]")){
    		 
    		 return new String [] {"Amarillo","Azul","Rojo"};
    		 
    	 }else if (s.equals("Icon[]")) {
    		 
    		 return new Object[] {new ImageIcon("src/graficos/bola_azul.gif"),new ImageIcon("src/graficos/bola_amarilla.gif"),new ImageIcon("src/graficos/bola_roja.gif")};
    	 
    	 }else if (s.equals("Object[]")) {	return new Object[] {cadenaMensaje,
 				iconoMensaje,
 				componenteMensaje,
 				objetoMensaje};
    	 
    	 
    	 }
    	 
    	 else {
		return null;
     }
     
     }
	//----------------------------------------------------------------------
	private class AccionMostrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println(lamina_tipo.dameSeleccion());
			//System.out.println(lamina_tipo_mensaje.dameSeleccion());
			//System.out.println(lamina_mensaje.dameSeleccion());
			//System.out.println(lamina_confirmar.dameSeleccion());
			//System.out.println(lamina_opcion.dameSeleccion());
			//System.out.println(lamina_entrada.dameSeleccion());
			
			if (lamina_tipo.dameSeleccion().equals("Mensaje")) {
				
				JOptionPane.showMessageDialog(Marco_Dialogo.this, dameMensaje(),
						"Titulo",dameTipo(lamina_tipo_mensaje));
			}else if(lamina_tipo.dameSeleccion().equals("Confirmar")){
		
				JOptionPane.showConfirmDialog(Marco_Dialogo.this, dameMensaje(), "Titulo",dameTipo(lamina_confirmar),dameTipo(lamina_tipo_mensaje));
				
			}else if (lamina_tipo.dameSeleccion().equals("Entrada")) {
				
				if(lamina_entrada.dameSeleccion().equals("Campo de texto")) {
				
				JOptionPane.showInputDialog(Marco_Dialogo.this, dameMensaje(), "Titulo", dameTipo(lamina_tipo_mensaje));
				}else {
					
					JOptionPane.showInputDialog(Marco_Dialogo.this, dameMensaje(), "Titulo", dameTipo(lamina_tipo_mensaje), null, new String[] {"amarillo","Azul","Rojo"}, "Azul");
				}
				
				
			}else if (lamina_tipo.dameSeleccion().equals("Opción")){
					JOptionPane.showOptionDialog(Marco_Dialogo.this, dameMensaje(),"Titulo", 1, dameTipo(lamina_tipo_mensaje), null, dameOpciones(lamina_opcion) , null);
		
	}
		}
		
	}


	private Lamina_Botones lamina_tipo, lamina_tipo_mensaje,lamina_mensaje,
	lamina_confirmar,lamina_opcion,lamina_entrada;
	
	private String cadenaMensaje="Mensaje";
	private Icon iconoMensaje=new ImageIcon("src/graficos/bola_azul.gif");
	private Object objetoMensaje = new Date();
	private Component componenteMensaje=new Lamina_Ejemplo();
	
	
	
}


class Lamina_Ejemplo extends JPanel{
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(0,0,getWidth(),getHeight());
		
		g2.setPaint(Color.yellow);
		
		g2.fill(rectangulo);
	}
	
	
}
