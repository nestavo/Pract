package POO;

public class furgoneta extends coche {
	
	private int capacidad_carga;
	
	private int plazas_extra;
	
	public furgoneta(int plazas_extra, int capacidad_carga) {
		
		super(); //LLAMA AL CONSTRUCTOR DE LA CLASE PADRE
		
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
		
	}

	
	public String dimeDatosFugoneta() {
		
		return "La capacidad de carga es: "+ capacidad_carga
				+" y las plazas son: "+ plazas_extra;
	}
}
