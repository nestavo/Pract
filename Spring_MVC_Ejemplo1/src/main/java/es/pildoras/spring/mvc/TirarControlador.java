package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secundario")
public class TirarControlador {

	@RequestMapping("/procesaFormulario2")
	//public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		
	public String otroProcesoFormulario(@RequestParam("nombreCliente")String nombre, Model modelo) {
		
		
		
		//String nombre=request.getParameter("nombreCliente");
		
		nombre+= " es el super mejor Cliente";
		
		String mensajeFinal= "¿quien es el super mejor cliente?" + nombre;
		
		
		//agregando info al modelo
		
		
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		return "HolaSpring";
		
	}
}

