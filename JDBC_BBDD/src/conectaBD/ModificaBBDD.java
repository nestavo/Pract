package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;

public class ModificaBBDD {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			//1. CREAR CONECION
			
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root","");
			
			//2. CREAR OBJETO STATEMENT
			
			java.sql.Statement miStatement = miConexion.createStatement();
			
			String instruccionSql="UPDATE artículos SET FECHA='25/01/2000' WHERE NOMBREARTÍCULO='MANGUERA'";

			miStatement.executeUpdate(instruccionSql);
			
			System.out.println("Datos insertados correctamente");
			
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("NO CONECTA");
		e.printStackTrace();
		
	}
		
}
	
}