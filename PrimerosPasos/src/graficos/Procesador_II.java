package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class Procesador_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		MenuProcesador_II mimarco=new MenuProcesador_II();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MenuProcesador_II extends JFrame{
	
	public MenuProcesador_II() {
		
		
		setBounds(500,300,550,400);
		LaminaProcesador_II milamina =new LaminaProcesador_II();
		add(milamina);
		setVisible(true);

	}	
}

class LaminaProcesador_II extends JPanel{
	
	public LaminaProcesador_II(){
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu= new JPanel();
		
		JMenuBar mibarra= new JMenuBar();
		//-----------------------------------------------
		
		 fuente=new JMenu("Fuente");
		 estilo=new JMenu("Estilo");
		 tamagno=new JMenu("Tamaño");
		
		//-----------------------------------------------
      //elementos de menu
		
		configura_menu("Arial","fuente", "Arial", 9, 10);
		configura_menu("Courier","fuente", "Courier new", 9, 10);
		configura_menu("Verdana","fuente", "Verdana", 9, 10);
		
		configura_menu("Negrita","estilo", "", Font.BOLD,15 );
		configura_menu("Cursiva","estilo", "", Font.ITALIC, 15);
		
		configura_menu("12","tamaño", "", 9, 12);
		configura_menu("16","tamaño", "", 9, 16);
		configura_menu("20","tamaño", "", 9, 20);
		configura_menu("24","tamaño", "", 9, 24);
		
		
		
		
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
		
		laminaMenu.add(mibarra);
		
		 miarea= new JTextPane();//ojo con esto
		
		add(miarea,BorderLayout.CENTER);
		
		
		add(laminaMenu, BorderLayout.NORTH);
		//.........-------------------------
		JPopupMenu emergente = new JPopupMenu();
		
	JMenuItem negritaE= new JMenuItem("Negrita");
	JMenuItem cursivaE= new JMenuItem("Cursiva");

	
	emergente.add(negritaE);
	emergente.add(cursivaE);
	
	
	miarea.setComponentPopupMenu(emergente);
	//--------------------------------	
	}

	public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam) {
		
		JMenuItem elem_menu=new JMenuItem(rotulo);
		
		if (menu=="fuente") {
			fuente.add(elem_menu);
		}else if(menu=="estilo") {
			estilo.add(elem_menu);
		}else if (menu=="tamaño") {
			tamagno.add(elem_menu);
		}
		
		elem_menu.addActionListener(new Gestiona_Eventos(rotulo, tipo_letra, estilos, tam));
		
		
	}
	private class Gestiona_Eventos implements ActionListener{

		String tipo_texto,menu;
		
		int estilo_letra,tamagno_letra;
		
		public Gestiona_Eventos(String elemento,String texto2,int estilo2,int tam_letra) {
			tipo_texto=texto2;
			estilo_letra=estilo2;
			tamagno_letra=tam_letra;
			menu=elemento;
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			letras=miarea.getFont();
			
			if (menu=="Arial" || menu=="Courier" || menu=="Verdana") {
				
				estilo_letra=letras.getStyle();
				
				tamagno_letra=letras.getSize();
				
			}else if (menu=="Cursiva" || menu=="Negrita") {
				if (letras.getStyle()==1 || letras.getStyle()==2) {
					
					estilo_letra=3;
				}
				tipo_texto=letras.getFontName();
				
				tamagno_letra=letras.getSize();
				
			}else if (menu=="12" || menu=="16" || menu=="20" || menu=="24" ) {
				
				estilo_letra=letras.getStyle();
			
			tipo_texto=letras.getFontName();
			}
			miarea.setFont(new Font (tipo_texto,estilo_letra,tamagno_letra));
		
		   System.out.println("Tipo: "+ tipo_texto+ " Estilo " + estilo_letra+ " Tamaño "+ tamagno_letra);
		}
		
	}


	JTextPane miarea;
	
	JMenu fuente,estilo,tamagno;
	
	Font letras;
	
	
}