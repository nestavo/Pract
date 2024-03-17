package aplicacionFinal;

import java.awt.*;
import java.sql.*;

import javax.swing.*;

import modelo.Conexion;


public class AplicacionUniversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBBDD mimarco=new MarcoBBDD();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
		
	}

}
class MarcoBBDD extends JFrame{
	
	
	public MarcoBBDD() {
		
		setBounds(300,300,700,700);
		
		LaminaBBDD milamina=new LaminaBBDD();
		
		add(milamina);
		
	
	}
}

class LaminaBBDD extends JPanel{
	
  public LaminaBBDD() {
	  
	  setLayout(new BorderLayout());
	  
	  comboTablas= new JComboBox();
	  
	  areaInformacion=new JTextArea();
	  
	  add(areaInformacion,BorderLayout.CENTER);
	  
	  add(comboTablas,BorderLayout.NORTH);
	  
	  conectarBBDD();
	  
	  obtenerTablas();
	  
  }
  
  public void conectarBBDD() {
	  
	  miConexion=null;
	  
	  try {
		  
		  miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario", "root","");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	  
  }
  
    public void obtenerTablas() {
    	
    	ResultSet miResulset=null;
    	
    	try {
    		
    		DatabaseMetaData datosBBDD= miConexion.getMetaData();
    		
    		miResulset=datosBBDD.getTables(null, null, null, null);
    		
    		while(miResulset.next()) {
    			
    			comboTablas.addItem(miResulset.getString("TABLE_NAME"));
    		}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

	private JComboBox comboTablas;
	
	private JTextArea areaInformacion;
	
	private Connection miConexion;
	
}