package es.pildoras.pruebasHibernate;

import java.sql.Connection;
import java.sql.Connection.*;
import java.sql.DriverManager;

public class PruebasJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbcUrl= "jdbc:mysql://localhost:3306/pruebasHibernate";
		
		String usuario="root";
		
		String contra="";
		
		try {
			
			
			System.out.println("intentando conectar con la BBDD: " + jdbcUrl );
			
			Connection miConexion=DriverManager.getConnection(jdbcUrl, usuario, contra);
			
			System.out.println("conexion exitosa");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	

	}
}