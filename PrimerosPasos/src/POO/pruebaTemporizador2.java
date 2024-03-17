package POO;//video 53 54
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;




public class pruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj mireloj=new Reloj(3000, true);
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "pulsa ok para terminar");
		
		System.exit(0);
	}

}
class Reloj{
	
	public Reloj (int intervalo, boolean sonido) {//constructor y argumentos
	this.intervalo=intervalo; //campode clase = argumentos
	this.sonido=sonido;
	
	
	}
	
	
	public void enMarcha() {
		
		 class DameLaHora2 implements ActionListener{
			
			public void actionPerformed (ActionEvent evento) {
				
				Date ahora=new Date();
				
				System.out.println("te pongo la hora cada 3 seg  " + ahora);
				 if (sonido) {
					 Toolkit.getDefaultToolkit().beep();
				 }
					
			}
		}
		
		ActionListener oyente=new DameLaHora2();
		
		Timer mitemporizador=new Timer(intervalo, oyente);
		
		mitemporizador.start();
		
	}
	private int intervalo;//campo de clase, tambien se puede declarar en el motodo enmarcha como variable local los parametros boolean con parametros final
	private boolean sonido;
	
	
	
	
	
	
}