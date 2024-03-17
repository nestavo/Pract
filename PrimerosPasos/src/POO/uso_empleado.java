package POO;

import java.util.*;



public class uso_empleado {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  //empleado empleado1=new empleado("nes mar",40000,2023,2,23);
  
  //empleado empleado2=new empleado("alba gome",30000,2022,6,13);
  
  //empleado empleado3=new empleado("manue gomez",25000,2020,7,3);
  
 // empleado1.subeSueldo(5);
  //empleado2.subeSueldo(3);
  //empleado3.subeSueldo(2);
  
 /* System.out.println("nombre: "+ empleado1.dameNombre()+ ". sueldo: "+empleado1.dameSueldo()+
    " fecha de alta: "+ empleado1.DameFechaContrato());
  System.out.println("nombre: "+ empleado2.dameNombre()+ ". sueldo: "+empleado2.dameSueldo()+
    " fecha de alta: "+ empleado2.DameFechaContrato());
  System.out.println("nombre: "+ empleado3.dameNombre()+ ". sueldo: "+empleado3.dameSueldo()+
    " fecha de alta: "+ empleado3.DameFechaContrato());*/
  
	 jefatura  jefe_rrhh=new jefatura("Roman Riquelme",25000,2006,3,6);
	 jefe_rrhh.estableceIncentivo(2570);
  empleado[] misEmpleados= new empleado[7];//ARRAY
  misEmpleados [0]=new empleado ("nes mar",40000,2022,12,17);
  misEmpleados [1]=new empleado ("alba gome",33000,2021,6,5);
  misEmpleados [2]=new empleado ("manue gomez",30500,2018,9,15);
  misEmpleados [3]=new empleado ("Antonio Fernandez");
  misEmpleados [4]=jefe_rrhh; //POLIMORFISMO EN ACCION. PRINCIPIO DE SUSTITUCION video 43
  misEmpleados [5]=new jefatura ("Pedro Perez",35000,2000,2,12);
  misEmpleados [6]=new jefatura ("Manolin",45000,2010,4,26);
  

  jefatura jefe_teto=(jefatura) misEmpleados[5];
  jefe_teto.estableceIncentivo(3000);
  
  jefatura jefa_finanzas=(jefatura) misEmpleados[6];
  jefa_finanzas.estableceIncentivo(55000);
  
  System.out.println(jefa_finanzas.tomar_decisiones(" La fefa de finanzas decide sube el sueldo un 6% a todos"));
System.out.println("El jefe "+ jefa_finanzas.dameNombre()+ 
		" tiene un bonus de "+jefa_finanzas.establece_bonus(500));
  


System.out.println(misEmpleados[3].dameNombre()+" tiene un bonus de "+
misEmpleados[3].establece_bonus(200));
  /* for (int i=0; i<misEmpleados.length; i++){
  
  misEmpleados[i].subeSueldo(5);
  
  }*/
  
  for(empleado e: misEmpleados) {//BUCLE FOR MEJORADO
   
   e.subeSueldo(5);
  }
  
  /*for (int i=0;i<3;i++){
   System.out.println("Nombre "+ misEmpleados[i].dameNombre() +
     " Sueldo: "+ misEmpleados[i].dameSueldo()+
     " Fecha de alta: "+ misEmpleados[i].DameFechaContrato());
   
  }*/
  
  
  Arrays.sort(misEmpleados);
  
  for (empleado e: misEmpleados) {//BUCLE FOR MEJORADO
   
   System.out.println("Nombre: "+ e.dameNombre() +
     ",  Sueldo: "+ e.dameSueldo()+
     " Euros"+",  Fecha de alta: "+ e.DameFechaContrato());
  }
  
 }

}

class empleado implements Comparable, Trabajadores{// metodo constructor
 
 
 public empleado(String nom, double sue, int agno, int mes, int dia) {//constructor
  
  nombre=nom;
  sueldo=sue;
  
  GregorianCalendar calendario= new GregorianCalendar(agno, mes-1, dia);
  
  
  altaContrato =calendario.getTime();
  
  ++Idsiguiente;
  Id=Idsiguiente;
  
 }
 
 public empleado(String nom) {
	
	 this(nom,30000,2000,01,01);
 }
 
 
 
 
 
 
 public String dameNombre() {//GETTER
  
  return nombre+ " Id "+Id;
 }
 public double dameSueldo(){//getter
  
  return sueldo;
 }
 public Date DameFechaContrato() {//getter
  return altaContrato;
 }
 
 public void subeSueldo(double porcentaje) {//setter
  
  double aumento= sueldo*porcentaje/100;
  
  sueldo+=aumento;//operador += es aumento
 }
 
 
 
 
 private String nombre;
 private double sueldo;
 private Date altaContrato;
 private static int Idsiguiente;
 private int Id;
@Override
public int compareTo(Object miObjeto) {
	// TODO Auto-generated method stub
	 empleado otroEmpleado=(empleado) miObjeto;
	 
	 if(this.sueldo<otroEmpleado.sueldo) {
		 return -1;
	 }
	 if(this.sueldo>otroEmpleado.sueldo) {
		 
		 return 1;
}
     return 0;
	 
	
}

@Override
public double establece_bonus(double gratificacion) {
	
	
	return Trabajadores.bonus_base+gratificacion;
}
 
}




  class  jefatura extends empleado implements jefes{
	 
	 public  jefatura(String nom, double sue, int agno, int mes, int dia){
		 
		super(nom,sue,agno,mes,dia); 
	 }
	 
	 public void estableceIncentivo(double b) {//SETTER
		 
		 incentivo=b;
		 
	 }
	 
	 public  double dameSueldo() {
		 
		 double sueldojefe=super.dameSueldo();
		 
		 return sueldojefe + incentivo;
		 
	 }
	
	 
 
	 private double incentivo;



	
	public String tomar_decisiones(String decision) {
		
		return "Un miembro de la directiva toma la siguiente decisión" + decision;
	}

	@Override
	public double establece_bonus(double gratificacion) {
		double prima = 2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	 }
 

