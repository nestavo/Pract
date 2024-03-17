package procAlmacenado;

import java.sql.*;


import com.mysql.cj.protocol.Resultset;

public class ConsultaClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/USUARIOS", "root","");
			
			CallableStatement miSentencia=miConexion.prepareCall("{call MUESTRA_CLIENTES}");
			
			Resultset rs= (Resultset) miSentencia.executeQuery();
			
			while( ((ResultSet) rs).next()) {
				
				System.out.println(((ResultSet) rs).getString(1)+" "+ ( (ResultSet) rs).getString(2)+ " "+( (ResultSet) rs).getString(3));
				
				
				
			}
			
			 ((ResultSet) rs).close();
			
		} catch (Exception e) {
			
			// TODO: handle exception
		}
	}

}
