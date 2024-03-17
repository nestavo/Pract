package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.*;
import vista.*;

public class ControladorBotonEjecuta implements ActionListener {

	
	public ControladorBotonEjecuta(Marco_Aplicacion2 elmarco) {
		
		this.elmarco=elmarco;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String selecionSeccion=(String)elmarco.secciones.getSelectedItem();
		
		String seleccionPais=(String)elmarco.paises.getSelectedItem();
		
		resultadoConsulta=(ResultSet) obj.filtraBBDD(selecionSeccion, seleccionPais);
		
		try {
			
		 	elmarco.resultado.setText("");
			
			while(resultadoConsulta.next()) {
				
				elmarco.resultado.append(resultadoConsulta.getString(1));
				
				elmarco.resultado.append(", ");
				
	            elmarco.resultado.append(resultadoConsulta.getString(2));
				
				elmarco.resultado.append(", ");
				
	            elmarco.resultado.append(resultadoConsulta.getString(3));
				
				elmarco.resultado.append(", ");
				
	            elmarco.resultado.append(resultadoConsulta.getString(4));
				
				elmarco.resultado.append("\n");
				
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	private Marco_Aplicacion2 elmarco;
	
	EjecutaConsultas obj=new EjecutaConsultas();
	
	private ResultSet resultadoConsulta;
	
}
