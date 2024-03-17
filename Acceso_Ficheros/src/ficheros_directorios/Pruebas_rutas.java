package ficheros_directorios;

import java.io.File;

public class Pruebas_rutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ruta = new File("D:" + File.separator+"nes"+File.separator);

		System.out.println(ruta.getAbsolutePath());

		String[] nombre_archivos = ruta.list();

		for (int i = 0; i < nombre_archivos.length; i++) {

			System.out.println(nombre_archivos[i]);

			File f= new File(ruta.getAbsolutePath(),nombre_archivos[i]);
			
			if (f.isDirectory()) {
				
				String[] archivos_sub=f.list();
				
				for (int j = 0; j < archivos_sub.length; j++) {
					
					System.out.println(archivos_sub[j]);
					
				}
			}
		}

	}

}
