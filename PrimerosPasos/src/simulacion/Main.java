package simulacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hilo Tortuga = new Hilo("Tortuga",5000);
		Hilo Conejo =new Hilo("Conejo",1000);
		
		Tortuga.start();//llama al metodo run
		
	
			
        
        Conejo.start();

		
}
	}