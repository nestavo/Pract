package modelo;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;

public class EjecutaConsultas {

	public EjecutaConsultas() {

		miConexion = new Conexion();
	}

	public Resultset filtraBBDD(String seccion, String pais) {

		// pruebas ="";

		Connection conecta = miConexion.dameConexion();

		rs = null;
		
		

		if (!seccion.equals("Todos") && pais.equals("Todos")) {

			try {
				
				enviaConsultaSeccion = conecta.prepareStatement(consultaSeccion);
			

				enviaConsultaSeccion.setString(1, seccion);

				rs = (Resultset) enviaConsultaSeccion.executeQuery();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

			// pruebas="Has escogido seccion";

		} else if (seccion.equals("Todos") && !pais.equals("Todos")) {

			
				try {
					enviaConsultaPais = conecta.prepareStatement(consultaPais);
			

				enviaConsultaPais.setString(1, pais);

				rs = (Resultset) enviaConsultaPais.executeQuery();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			// pruebas="Has escogido pais";

		} else if (seccion.equals("Todos") && pais.equals("Todos")) {

			
			try {
				enviaConsultaTodosTodos = conecta.prepareStatement(consultaTodosTodos);
		

				// enviaConsultaTodos.setString(0, pais);

				rs = (Resultset) enviaConsultaTodosTodos.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// pruebas="No Has escogido ninguno es todos a todos";

		} else {

			
				try {
					enviaConsultaTodos = conecta.prepareStatement(consultaTodos);
			

				enviaConsultaTodos.setString(1, seccion);
				enviaConsultaTodos.setString(2, pais);

				rs = (Resultset) enviaConsultaTodos.executeQuery();
		
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			// pruebas="Has escogido ambos";
		}	

		
		// return pruebas;
		return rs;
	}

//	private String pruebas;
	private Conexion miConexion;

	private Resultset rs;

	private PreparedStatement enviaConsultaSeccion;

	private final String consultaSeccion = "SELECT NOMBREARTÍCULO, SECCIÓN, PAISDEORIGEN,PRECIO FROM artículos WHERE SECCIÓN=?";

	private PreparedStatement enviaConsultaPais;

	private final String consultaPais = "SELECT NOMBREARTÍCULO, SECCIÓN, PAISDEORIGEN,PRECIO FROM artículos WHERE PAISDEORIGEN=?";

	private PreparedStatement enviaConsultaTodos;

	private final String consultaTodos = "SELECT NOMBREARTÍCULO, SECCIÓN, PAISDEORIGEN,PRECIO FROM artículos WHERE SECCIÓN=? AND PAISDEORIGEN=?";

	private PreparedStatement enviaConsultaTodosTodos;

	private final String consultaTodosTodos = "SELECT NOMBREARTÍCULO, SECCIÓN, PAISDEORIGEN,PRECIO FROM artículos";

}
