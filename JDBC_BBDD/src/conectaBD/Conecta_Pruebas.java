package conectaBD;

import java.sql.*;




public class Conecta_Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			//1. CREAR CONECION
			
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root","");
			
			//2. CREAR OBJETO STATEMENT
			
			java.sql.Statement miStatement = miConexion.createStatement();

			//3. EJECUTAR SQL
			
			ResultSet miResultSet=miStatement.executeQuery("SELECT * FROM artículos");
					
			
		    //4. RECORRER EL RESULSET
			
			while(miResultSet.next()) {
				
				System.out.println(miResultSet.getString("NOMBREARTÍCULO")+ " - " + 
			miResultSet.getString("PAISDEORIGEN")+ " - "+
			miResultSet.getDouble("PRECIO")*1.21+ " - " + 
			miResultSet.getString("FECHA"));
			}
		
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("NO CONECTA");
			e.printStackTrace();
			
		}
	}

}