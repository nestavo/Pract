package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.ItalicAction;

public class Procesador_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		MenuProcesador_III mimarco=new MenuProcesador_III();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MenuProcesador_III extends JFrame{
	
	public MenuProcesador_III() {
		
		
		setBounds(500,300,550,600);
		LaminaProcesador_III milamina =new LaminaProcesador_III();
		add(milamina);
		setVisible(true);

	}	
}

class LaminaProcesador_III extends JPanel{
	
	public LaminaProcesador_III(){
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu= new JPanel();
		
		JMenuBar mibarra= new JMenuBar();
		//-----------------------------------------------
		
		 fuente=new JMenu("Fuente");
		 estilo=new JMenu("Estilo");
		 tamagno=new JMenu("Tamaño");
		
		//-----------------------------------------------
      //elementos de menu
		
		configura_menu("Arial","fuente", "Arial", 9, 10,"");
		configura_menu("Courier","fuente", "Courier", 9, 10,"");
		configura_menu("Verdana","fuente", "Verdana", 9, 10,"");
		//------------------------------------------
	
		
		configura_menu("Negrita","estilo", "", Font.BOLD,15,"" );
		configura_menu("Cursiva","estilo", "", Font.ITALIC, 15,"");
		
	/*	JCheckBoxMenuItem negrita =new JCheckBoxMenuItem("Negrita",new ImageIcon("bin/graficos/negrita.gif"));
		JCheckBoxMenuItem cursiva =new JCheckBoxMenuItem("Cursiva",new ImageIcon(""));
		
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		
		
		estilo.add(negrita);
		estilo.add(cursiva);*/
		//---------------------------------------------
	   
		
		
		
		
		configura_menu("12","tamaño", "", 9, 12,"");
		configura_menu("16","tamaño", "", 9, 16,"");
		configura_menu("20","tamaño", "", 9, 20,"");
		configura_menu("24","tamaño", "", 9, 24,"");
		
		
		
		
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
		
		laminaMenu.add(mibarra);
		
		 miarea= new JTextPane();//ojo con esto
		
		add(miarea,BorderLayout.CENTER);
		
		
		add(laminaMenu, BorderLayout.NORTH);
		
		JPopupMenu emergente = new JPopupMenu();
		
	JMenuItem negritaE= new JMenuItem("Negrita");
	JMenuItem cursivaE= new JMenuItem("Cursiva");

	negritaE.addActionListener(new StyledEditorKit.BoldAction());
	cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
	
	
	emergente.add(negritaE);
	emergente.add(cursivaE);
	
	
	miarea.setComponentPopupMenu(emergente);
		
	//--------------barra de herrameitnas
	
	JToolBar barra =new JToolBar();
	
	JButton negritaBarra=new JButton(new ImageIcon("src/graficos/negrita.gif"));
	
	JButton cursivaBarra=new JButton(new ImageIcon("src/graficos/cursiva.gif"));
	
	JButton subBarra= new JButton(new ImageIcon("src/graficos/subrra.gif"));
	//-------
	
	JButton azulBarra= new JButton(new ImageIcon("src/graficos/bola_azul.gif"));
	
	JButton amarilloBarra= new JButton(new ImageIcon("src/graficos/bola_amarilla.gif"));
	
	JButton rojoBarra= new JButton(new ImageIcon("src/graficos/bola_roja.gif"));
	//-------
	
	JButton a_izquierda= new JButton(new ImageIcon("src/graficos/izquierda.gif"));
	
	JButton a_centrado= new JButton(new ImageIcon("src/graficos/centrado.gif"));
	
	JButton a_derecha= new JButton(new ImageIcon("src/graficos/derecha.gif"));
	
	JButton a_justificado= new JButton(new ImageIcon("src/graficos/justificado.gif"));
	
	
	
	
	
	negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
	
	cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
	
	subBarra.addActionListener(new StyledEditorKit.UnderlineAction());
	
	azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("Poner Azul", Color.BLUE));
	amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("Poner Amarillo", Color.YELLOW));
	rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("Poner Rojo", Color.RED));
	
	a_izquierda.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda",0));
	a_centrado.addActionListener(new StyledEditorKit.AlignmentAction("Centrado",1));
	a_derecha.addActionListener(new StyledEditorKit.AlignmentAction("Derecha",2));
	a_justificado.addActionListener(new StyledEditorKit.AlignmentAction("Justificado",3));
	
	
	
	barra.add(negritaBarra);
	barra.add(cursivaBarra);
	barra.add(subBarra);
	
	barra.add(azulBarra);
	barra.add(amarilloBarra);
	barra.add(rojoBarra);
	
	barra.add(a_izquierda);
	barra.add(a_centrado);
	barra.add(a_derecha);
	barra.add(a_justificado);
	
	
	
	barra.setOrientation(1);
	
	add(barra, BorderLayout.WEST);
	
	
	
	}

	public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam, String ruta_icono) {
		
		JMenuItem elem_menu=new JMenuItem(rotulo, new ImageIcon(ruta_icono));
		
		if (menu=="fuente") {
			fuente.add(elem_menu);
			
			if (tipo_letra=="Arial") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Arial"));
			
			}else if(tipo_letra=="Courier") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Courier new"));
			
			}else 
				if (tipo_letra=="Verdana"){
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Verdana"));
			}
			
			
		}else if(menu=="estilo") {
			
			estilo.add(elem_menu);
			if (estilos==Font.ITALIC) {
				
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));
				
			elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}else if(estilos==Font.BOLD){
			
			elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
			elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			}
		
		
		
		
		
		}else if (menu=="tamaño") {
			tamagno.add(elem_menu);
			
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", tam));
		}
		
		}
	
		
		
	JTextPane miarea;
	
	JMenu fuente,estilo,tamagno;
	
	Font letras;
	
	
}