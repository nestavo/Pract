package escribiendo;

import java.io.FileWriter;
import java.io.IOException;

public class Escribir_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Escribiendo accede_es=new  Escribiendo();
		
		accede_es.escribir();
	
	
	}

}
class Escribiendo{
	
	public void escribir() {
		
		
		String frase="Esto es una prueba de escritura3";
		
		try {
			FileWriter escritura= new FileWriter("C:/Users/USUARIO/Desktop/texto_nuevo.txt",true); //si agregamos true escribe sobre un fichero existente y no borra lo anterior. 
	
			for (int i = 0; i < frase.length(); i++) {
				
				escritura.write(frase.charAt(i));
			}
		
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}