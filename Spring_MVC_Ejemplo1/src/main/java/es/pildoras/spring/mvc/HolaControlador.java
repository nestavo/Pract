package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;

@Controller
@RequestMapping("/principal")
public class HolaControlador {

	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { //proporciona el formulario
		
		
		
		return "HolaFormulario";
		
		
	}
	

	@RequestMapping("/procesaFormulario")
	public String porcesarFormulario() {
		
		return "HolaSpring";
		
		
	}
	
	@RequestMapping("/procesaFormulario2")
	//public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		
	public String otroProcesoFormulario(@RequestParam("nombreCliente")String nombre, Model modelo) {
		
		
		
		//String nombre=request.getParameter("nombreCliente");
		
		nombre+= " es el mejor Cliente";
		
		String mensajeFinal= "¿quien es el mejor cliente?" + nombre;
		
		
		//agregando info al modelo
		
		
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		return "HolaSpring";
		
	}
}
