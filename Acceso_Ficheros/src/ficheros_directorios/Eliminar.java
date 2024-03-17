package ficheros_directorios;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta = new File("D:" + File.separator+"nes"+File.separator+ "FOTOS EDITADAS"+File.separator+"purebanes.txt");
	
		ruta.delete();
	
	}

}
