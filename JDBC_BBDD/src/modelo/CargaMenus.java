package modelo;

import java.sql.*;

import controlador.*;
public class CargaMenus {

	public CargaMenus() {
		
		miConexion= new Conexion();
	}
	


public String ejecutaConsultas() {
	
	Productos miProducto=null;
	
	Connection accesoBBDD=miConexion.dameConexion();
	
	
	try {
		
		Statement secciones= accesoBBDD.createStatement();
		
		Statement paises= accesoBBDD.createStatement();
		
		rs=secciones.executeQuery("SELECT DISTINCTROW SECCIÓN FROM artículos");
		
		rs2=paises.executeQuery("SELECT DISTINCTROW PAISDEORIGEN FROM artículos");
		
		//while(rs.next()) {
			
			
			miProducto=new Productos();
			
			miProducto.setSeccion(rs.getString(1));
			
			miProducto.setpOrigen(rs2.getString(1));
			
			//return miProducto.getSeccion();
			
		//}
		
		rs.close();
		rs2.close();
		accesoBBDD.close();
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	return miProducto.getSeccion();
}

Conexion miConexion;

public ResultSet rs;

public ResultSet rs2;


}