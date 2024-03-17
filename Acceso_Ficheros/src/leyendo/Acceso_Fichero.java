package leyendo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leer_Fichero accediendo=new Leer_Fichero();
		
		accediendo.lee();
		
	}

}
class Leer_Fichero{
	
	public void lee() {//video 154
		
		try {
			FileReader entrada=new FileReader("C:\\Users\\USUARIO\\Desktop/ejemplo.txt");
		   
			BufferedReader mibuffer=new BufferedReader(entrada);
			//int c= 0;
			
			String linea="";
			
			while(linea!=null) {
				
				
				linea=mibuffer.readLine();
				
				//c=entrada.read();
				
			//	char letra=(char)c;
				if(linea!=null)
				
				System.out.println(linea);
			}
		
			entrada.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo");
		}
		
		
	}
	
	
}
