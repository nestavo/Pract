package es.pildoras.pruebaannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.pildoras.pruebaannotation")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

	
	
	//definir el bean para InformeFinancieroDtoCompra
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {
		
		return new InformeFinancieroDptCompras();
	}
	
	
	
	//definir el bean para DirectorFinanciero e inyectar dependencias
	
	
	@Bean
	public Empleado DirectorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
		
		
	}
}