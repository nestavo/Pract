package ficheros_directorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta = new File("D:" + File.separator+"nes"+File.separator+ "FOTOS EDITADAS"+File.separator+"purebanes.txt");
		
		//ruta.mkdir();//crea directorio
		
		String archivo_destino=ruta.getAbsolutePath();
		
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Escribiendo accede_es=new Escribiendo();
		
		accede_es.escribir(archivo_destino);
	}

}


class Escribiendo{
	
	public void escribir(String ruta_archivo) {
		
		String frase="Esto es un ejemplo";
		
		try {
			FileWriter escritura= new FileWriter(ruta_archivo);
			
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