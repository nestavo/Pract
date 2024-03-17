package procAlmacenado;

import java.sql.*;

import javax.swing.JOptionPane;

public class Actualiza_art {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nPrecio=Float.parseFloat(JOptionPane.showInputDialog("Introduce precio"));
		
		String nArticulo=JOptionPane.showInputDialog("Introduce nombre articulo");
		
		try {
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root","");
			
			CallableStatement miSentencia=miConexion.prepareCall("{call ACTUALIZA_ART(?, ?)}");
			
			miSentencia.setFloat(1, nPrecio);
			
			miSentencia.setString(2, nArticulo);
			
			miSentencia.execute();
			
			System.out.println("Actualizacion validada");
			
		}catch(Exception e) {
			
		}
	}

}
