package simulacion;

public class Hilo extends Thread{
	
	private String nombre;
	private int tiempo;
	
	public Hilo(String nombre, int tiempo) {
		super();
		this.nombre=nombre;
		this.tiempo=tiempo;
	
	}


	
	
	public void run()
{

System.out.println(nombre + " empieza la carrera" );

for (int i = 0; i < 10; i++) {
	
	
	try {
		this.sleep(tiempo);//pasa a estar dormido hasta que haya transcurrido el tiempo indicado en el parametro
		
		System.out.println(nombre+ " va por la posicion " + (i+1)+" de la carrera");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

System.out.println(nombre + " ha termiando la carrera");

	}
}