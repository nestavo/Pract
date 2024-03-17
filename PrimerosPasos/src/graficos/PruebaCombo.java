package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PruebaCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCombo mimarco=new MarcoCombo();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoCombo extends JFrame{
	
	public MarcoCombo(){
		
		
		setVisible(true);
		setBounds(550,300,550,400);
		
		LaminaCombo milamina =new LaminaCombo();
		add(milamina);
		
		
	}
}

class LaminaCombo extends JPanel{
	
	public LaminaCombo(){
		
		setLayout(new BorderLayout());
		texto=new JLabel("En un ligar de la mancha...");
		texto.setFont(new Font("Serif",Font.PLAIN,18));
		add(texto, BorderLayout.CENTER);
		
		JPanel lamina_norte = new JPanel();
		
		micombo= new JComboBox();
		
		micombo.setEditable(true);
		
		micombo.addItem("Serif");
		micombo.addItem("SansSerif");
		micombo.addItem("Monospaced");
		micombo.addItem("Dialog");
		
		evento_combo mievento=new evento_combo();
		micombo.addActionListener(mievento);
		
	lamina_norte.add(micombo);
		
		add(lamina_norte, BorderLayout.NORTH);
		
	}
	

	private class evento_combo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN,18));
		}
		
		
	}






	private JLabel texto;
	
	private JComboBox micombo;
}