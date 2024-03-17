package es.pildoras.pruebaannotation;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe finaciero del trimetre 1";
	}

}
