package simulacion;

class Cuenta_Numeros implements Runnable {
	private int cuenta;
	private String nom;
	private int limit;

	public Cuenta_Numeros(String nom, int limit) {
		this.cuenta = 0;
		this.nom = nom;
		this.limit = limit;
	}
	public void run() {
 
		for (int i = 0; i < limit; i++) {
			System.out.println("Hilo " + nom + " " + "proceso: " + cuenta);
			cuenta++;
		}
		System.out.println("Fin de la ejecucion del Hilo " + nom);
	}
}
public class Hilo_Cuenta {
	public static void main(String[] args) {
		
		Cuenta_Numeros n1 = new Cuenta_Numeros("Primero", 10);
		Cuenta_Numeros n2 = new Cuenta_Numeros("Segundo", 20);
		Cuenta_Numeros n3 = new Cuenta_Numeros("Tercero", 30);
		Cuenta_Numeros n4 = new Cuenta_Numeros("Cuarto", 40);

		Thread h1 = new Thread(n1);
		Thread h2 = new Thread(n2);
		Thread h3 = new Thread(n3);
		Thread h4 = new Thread(n4);

		h1.start();
		h2.start();
		h3.start();
		h4.start();
		try {
			h1.join();
			h2.join();
			h3.join();
			h4.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("FIN DEL PROGRAMA");
	}
}

/*	try {
tortuga.join();//no empieza ningun hilo hasta que este termina
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}*/