package ficheros_directorios;

import java.io.File;

public class Acceso_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File archivo= new File("bin");
		
		System.out.println(archivo.getAbsolutePath());
		
		System.out.println(archivo.exists());
		
	}

}
