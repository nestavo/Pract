package conectaBD;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;



public class Aplicacion_Consulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame mimarco=new Marco_Aplicacion();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Aplicacion extends JFrame{
	
	public Marco_Aplicacion(){
		
		setTitle ("Consulta BBDD");
		
		setBounds(500,250,550,400);
		
		setLayout(new BorderLayout());
		
		JPanel menus=new JPanel();
		
		menus.setLayout(new FlowLayout());
		
		secciones=new JComboBox();
		
		secciones.setEditable(false);
		
		secciones.addItem("Todos");
		
		paises=new JComboBox();
		
		paises.setEditable(false);
		
		paises.addItem("Todos");
		
		resultado= new JTextArea(45,50);
		
		resultado.setEditable(false);
		
		add(resultado);
		
		menus.add(secciones);
		
		menus.add(paises);	
		
		add(menus, BorderLayout.NORTH);
		
		add(resultado, BorderLayout.CENTER);
		
		JScrollPane scroll = new JScrollPane(resultado);
		
		add(scroll);
		
		JButton botonConsulta=new JButton("Consulta");	
		
		botonConsulta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				ejecutaConsulta();
				
			}
		});
		
		add(botonConsulta, BorderLayout.SOUTH);
		
		
		
		//------CONEXION BBDD----------------
		
		try {

			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");

			

			java.sql.Statement sentencia = miConexion.createStatement();
			
			//----CARGA COMOBOX SECCIONES
			
			String consulta="SELECT DISTINCTROW SECCIÓN FROM artículos";
			
			ResultSet rs= sentencia.executeQuery(consulta);
			
			while(rs.next()) {
				
				secciones.addItem(rs.getString(1));
			}
			
		
			rs.close();
			
			//------CARGA COMBOBOX PAISES----
			
			 consulta="SELECT DISTINCTROW PAISDEORIGEN FROM artículos";
			
			 rs= sentencia.executeQuery(consulta);
			
			while(rs.next()) {
				
				paises.addItem(rs.getString(1));
			}
			
		
			rs.close();
			
		}catch(Exception e) {
		
			System.out.println("Fallo en la conexion");
		}
		
		
	}	
	
	private void ejecutaConsulta() {
		
		resultado.setText("");
		
		ResultSet rs=null;
		
		try {
			
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
			resultado.append(" ");
			
			String seccion=(String) secciones.getSelectedItem();
			
			String pais=(String) paises.getSelectedItem();
			
			
			if(!seccion.equals("Todos")&& pais.equals("Todos")) {
				
			enviaConsultaSeccion=miConexion.prepareStatement(consultaSeccion);
			
			enviaConsultaSeccion.setString(1, seccion);
			
			rs=enviaConsultaSeccion.executeQuery();
			
			}else if(seccion.equals("Todos")&& !pais.equals("Todos")){
				
				enviaConsultaPais=miConexion.prepareStatement(consultaPais);
				
				enviaConsultaPais.setString(1, pais);
				
				rs=enviaConsultaPais.executeQuery();
				
				
			}else if(!seccion.equals("Todos")&& !pais.equals("Todos")) {
				
                enviaConsultaTodos=miConexion.prepareStatement(consultaTodos);
				
				enviaConsultaTodos.setString(1, seccion);
				
				enviaConsultaTodos.setString(2, pais);
				
				rs=enviaConsultaTodos.executeQuery();
			}
		else if(seccion.equals("Todos")&& pais.equals("Todos")) {
			
            enviaConsultaTodosTodos=miConexion.prepareStatement(consultaTodosTodos);
			
		//	enviaConsultaTodos.setString(1, seccion);
			
		//	enviaConsultaTodos.setString(2, pais);
			
			rs=enviaConsultaTodosTodos.executeQuery();
		}
			
			
			
			while(rs.next()) {
				
				resultado.append(rs.getNString(1));
				
				resultado.append(", ");
				
				resultado.append(rs.getString(2));
				
                resultado.append(", ");
				
				resultado.append(rs.getString(3));
				
                resultado.append(", ");
				
				resultado.append(rs.getString(4));
				
				resultado.append("\n");
			
	
				
			}
			
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	private Connection miConexion;

	private PreparedStatement enviaConsultaSeccion;
	
	private PreparedStatement enviaConsultaPais;
	
	private PreparedStatement enviaConsultaTodos;
	
	private PreparedStatement enviaConsultaTodosTodos;
	
	private final String consultaSeccion="SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAISDEORIGEN FROM artículos WHERE SECCIÓN LIKE?";
	
	private final String consultaPais="SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAISDEORIGEN FROM artículos WHERE PAISDEORIGEN LIKE?";
	
	private final String consultaTodos="SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAISDEORIGEN FROM artículos WHERE SECCIÓN LIKE? AND PAISDEORIGEN LIKE?";
	
	private final String consultaTodosTodos="SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAISDEORIGEN FROM artículos";
	
	
	private JComboBox secciones;
	
	private JComboBox paises;
	
	private JTextArea resultado;	
	

	
}


