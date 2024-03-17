package conectaBD;

import java.sql.*;




public class ConsultaPreparada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// 1. CREAR CONECION

			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");

			// 2. PREPARA CONSULTA
			
			PreparedStatement miSentencia=miConexion.prepareStatement("SELECT NOMBREARTÍCULO, SECCIÓN, PAISDEORIGEN FROM artículos"
					+ " WHERE SECCIÓN=? AND PAISDEORIGEN=?");
			
			//3. ESTABLECER PARAMETROS DE CONSULTA
			
			miSentencia.setString(1, "deporte");
			
			miSentencia.setString(2, "usa");
			
			//4. EJECUTAR Y RECORRER CONSULTA
			
			ResultSet rs=miSentencia.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1)+ " - "+ rs.getString(2)+ " - "+ rs.getString(3));
				
				
			}
			rs.close();
			
			
			//REUTILAZACION DE CONSULTA SQL
			System.out.println(" ");
			System.out.println("Ejecucion segunda consulta");
			
			
	//3. ESTABLECER PARAMETROS DE CONSULTA
			
			miSentencia.setString(1, "ferreteria");
			
			miSentencia.setString(2, "usa");
			
			//4. EJECUTAR Y RECORRER CONSULTA
			
			rs=miSentencia.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1)+ " - "+ rs.getString(2)+ " - "+ rs.getString(3));
				
				
			}

			
			rs.close();
			
			
			

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("NO CONECTA");
			e.printStackTrace();
		}

	}

}
