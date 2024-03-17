package transacciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Transacio_Producto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Connection miConexion=null;
		
		try{					
				
		    miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");		
			
			miConexion.setAutoCommit(false);
			
			Statement miStatement =miConexion.createStatement();
			
		    String instruccionSql_1="DELETE FROM artículos WHERE PAISDEORIGEN= 'ITALIA'";		   
			    
		    String instruccionSql_2="DELETE FROM artículos WHERE PRECIO>80";
			    
		    String instruccionSql_3="UPDATE artículos SET PRECIO=PRECIO*1.15";
		    
		    boolean ejecutar=ejecutar_transacion();
		    
		    if (ejecutar) {
		    	  
		    miStatement.executeUpdate(instruccionSql_1);
		    
		    miStatement.executeUpdate(instruccionSql_2);
		    
		    miStatement.executeUpdate(instruccionSql_3);
		    
		    miConexion.commit();
		    
		    System.out.println("Se ejecuto la tranasaccion");
		   
		    }else {
		    	
		    	System.out.println("No se realizo ningun cambio en la base de datos");
		    }
		    
		}catch (Exception e) {
			// TODO: handle exception
			try {
				miConexion.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}//excpecio de tipo sql excepcion
			
			System.out.println("algo salio mal y no se realizaron cambios");
		}
	}
	
	static boolean ejecutar_transacion() {
		
		String ejecucion=JOptionPane.showInputDialog("¿Ejecutamos la transaccion?");
		
		if (ejecucion.equals("si")) return true;
				
		else return false;
		
		
		
		
	}
	
	
}
