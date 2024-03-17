package metadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.protocol.Resultset;

public class Info_Metadatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//mostrarInfo_BBDD();
		mostrarInfo_Tablas();

	}
	
	static void mostrarInfo_BBDD() {
		
		Connection miConexion=null;
		
		try {
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
		
		//Obtención de metadatos
			
			java.sql.DatabaseMetaData datosBBDD= miConexion.getMetaData();
		
		//Mostrar info BBDD
			
			System.out.println("Gestor de BBDD " + datosBBDD.getDatabaseProductName());
			
			System.out.println("Version de BBDD " + datosBBDD.getDatabaseProductVersion());
			
			System.out.println("Driver de BBDD " + datosBBDD.getDriverName());
			
			System.out.println("Version del DRIVER BBDD " + datosBBDD.getDriverVersion());
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}finally {
			try {
				miConexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	static void mostrarInfo_Tablas() {
	
	Connection miConexion=null;
	
	ResultSet miResulset= null;
	
	try {
		miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
	
	//Obtención de metadatos
		
		java.sql.DatabaseMetaData datosBBDD= miConexion.getMetaData();
		
		//Lista de tablas
		
		System.out.println("Lista de tablas");
		
		miResulset=datosBBDD.getTables(null, null,"p%", null);
		
		while(miResulset.next()) {
			
			System.out.println(miResulset.getString("TABLE_NAME"));
		}
		
		
		System.out.println("");
		
		System.out.println("Campo de productos");
		
	    miResulset=datosBBDD.getColumns(null, null,"artículos", null);
		
		while(miResulset.next()) {
			
			System.out.println(miResulset.getString("COLUMN_NAME"));

		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}finally {
		try {
			miConexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
}


