package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class serializando {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Administrador jefe = new Administrador("Juan", 80000, 2005, 12, 15);
		jefe.setIncentivo(5000);

		Empleado[] personal = new Empleado[3];

		personal[0] = jefe;
		personal[1] = new Empleado("Ana", 25000, 2008, 10, 1);
		personal[2] = new Empleado("luis", 18000, 2010, 9, 15);

		try 

	//	(ObjectOutputStream escribiendo_fic = new ObjectOutputStream(new FileOutputStream("D:/nes/FOTOS EDITADAS/empleado2.txt"))) 
		
		{

		//	escribiendo_fic.writeObject(personal);

		//	escribiendo_fic.close();

			ObjectInputStream recupera_fic = new ObjectInputStream(
					new FileInputStream("D:/nes/FOTOS EDITADAS/empleado2.txt"));

			Empleado[] personal_rec = (Empleado[]) recupera_fic.readObject();

			recupera_fic.close();

			for (Empleado e : personal_rec) {

				System.out.println(e);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

//--------------------------------------------------------------------------
	class Empleado implements Serializable{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public Empleado (String n,double s, int agno,int mes, int dia) {
		
		nombre=n;
		sueldos=s;
		GregorianCalendar calendario = new GregorianCalendar(agno,mes,dia);
		fechaContrato=calendario.getTime();
		
	
		}
		public String getNombre() {
			
			return nombre;
		}
		
		public double getSueldo() {
			
			return sueldos;
		}
				
		public Date getFechaContrato() {
			
			return fechaContrato;
		}
		
		public void subirSueldo(double porcentaje) {
			
			double aumento = sueldos*porcentaje/100;
			
			sueldos+=aumento;
		}
		
		public String toString() {
			return " El Nombre es " + nombre + ", Sueldo=" + sueldos + ", Fecha de contrato=" + fechaContrato;
			
		}
		
		private String nombre;
		private double sueldos;
		private Date fechaContrato;
		
	}
	
	class Administrador extends Empleado{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Administrador(String n, double s, int agno, int mes, int dia) {
			super(n, s, agno, mes, dia);
			// TODO Auto-generated constructor stub
			incentivo=0;
		}
		
		public double getSueldo() {
			double sueldoBase=super.getSueldo();
			return sueldoBase + incentivo;
		}
		
		public void setIncentivo(double b) {
			
			incentivo=b;
			
		}
		
		public String toString() {
			
			return super.toString()+ " Incentivo="+ incentivo;
		}
		
		private double incentivo;
	}
	
	
	
	