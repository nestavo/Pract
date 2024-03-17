package Leyendo_escribiendo_bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lectura_Escritura {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int contador=0;
		
		int datos_entrada[]=new int [4396157];
		
		try {
			FileInputStream archivo_lectura = new FileInputStream("D:/nes/FOTOS EDITADAS/PLAYA.jpg");
		
		boolean final_ar=false;
		
		while (!final_ar) {
			
			int byte_entrada= archivo_lectura.read();
			
				
				if (byte_entrada!=-1)
				
				datos_entrada[contador]=byte_entrada;

				else 
				   final_ar=true;
				
				System.out.println(datos_entrada[contador]);
				
				
				contador++;
	
			
		}
			archivo_lectura.close();
	
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(contador);
		
		crea_fichero(datos_entrada);
	}

	static void crea_fichero(int datos_nuevo_fic[]) throws IOException {
		
		try {
			FileOutputStream fic_nuevo= new FileOutputStream("D:/nes/FOTOS EDITADAS/PLAYA_copia.gif");

			for (int i = 0; i < datos_nuevo_fic.length; i++) {
			
				fic_nuevo.write(datos_nuevo_fic[i]);
			}

			fic_nuevo.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
