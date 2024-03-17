import java.io.EOFException;

import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//video21 y 22
		
		
		
		String el_mail= JOptionPane.showInputDialog("introduce tu mail");
	
		
		
	
		
		try {
			examina_mail(el_mail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("La direccion de e-mail no es correcta");
		  //  e.printStackTrace();
	}
	}
	
	static void examina_mail(String mail) throws longitud_mail_error  {
		
		int arroba = 0; //variable de tipo entero inciadaen 0
		boolean punto =false;
		
		if(mail.length()<=3) {
			
		//	ArrayIndexOutOfBoundsException mi_excepcion=new ArrayIndexOutOfBoundsException();
		
	//	System.out.println("algo falla");
		//	throw new EOFException();
			throw new longitud_mail_error("El mail no es correcto");
			
		}else {
		
		
		for (int i=0; i<mail.length();i++) {
			
			if (mail.charAt(i)=='@') {
				arroba++;
			}
			
			if (mail.charAt(i)=='.') {
				punto=true;
			}
		}
		
		if (arroba ==1 && punto==true ){
			System.out.println("mail valido");
		}
			else {
				System.out.println("mail incorrecto");
			
			
			}
		}
	}
	}
	
	class longitud_mail_error extends Exception{
		
		public longitud_mail_error() {
			
		}
		public longitud_mail_error(String msj_error) {
			super(msj_error);
		}
	}

