package POO;

public class coche {

	 private int ruedas;
	 
	 private double largo;
	  private double ancho;
	 
	  private int motor;
	 
	  private int peso_plataforma;
	 
	 private String color;
	  
	 private int peso_final;
	  
	 private boolean asientos_cuero, climatizador;
	  
	 
	 public coche(){
	  
	  ruedas=4;
	  largo=3005;
	  ancho=1860;
	  motor=2000;
	  peso_plataforma=500;
	 }


	 public String dime_datos_generales() {//metodo getter
	  
	  return "La plataforma del coche tiene "+ruedas +" ruedas" + " mide " +largo/1000+ " metros y tiene un ancho de "
	    + ancho/1000 + " metros  y  peso de la plataforma de "
	      + peso_plataforma + " kilos" + " y lleva una cilindrada en cc de "+motor;
	 }


	 
	 public void establece_color(String color_coche) {//metodo setter
	  
	  color=color_coche;
	 }
	 
	 public String dime_color() {
	  
	  return "El color del coche es " + color;
	 }
	 
	 public void configura_asientos(String asientos_cuero) {//SETTER
	  
	  if (asientos_cuero.equalsIgnoreCase("si")) {
	   
	   this.asientos_cuero=true;
	   
	  }else {
	   this.asientos_cuero=false;
	  }
	 }
	 public  String dime_asientos(){//GETTER
	  if (asientos_cuero=true) {
	   
	   return "El coche tiene asientos de cuero";
	  }
	  else {
	   return "El coche tienme asientos de alcantara";
	  }
	 }
	 
	 public void configura_clima(String clima) {//SETTER
	  if (clima.equalsIgnoreCase("si")) {
	   this.climatizador=true;
	   }else {
	    this.climatizador=false;
	   }
	  
	 }
	  public String dime_clima() {//SETTER
	   if (climatizador==true) {
	    return "El coche tiene climatizador";
	   }
	   else {
	    return "El coche lleva aire acindicionado";
	   }
	   
	  }
	  
	  public String dime_peso_coche() {//SETTER Y GETTER A LA VEZ
	   
	   int peso_carroceria=500;
	     peso_final=peso_plataforma+peso_carroceria;
	     if(asientos_cuero==true) {
	      peso_final=peso_final+50;
	     }
	     
	     if (climatizador==true) {
	      peso_final=peso_final+20;
	     }
	  return "El peso del coche es " + peso_final+" kg";
	  
	  }
	  
	  
	  public String precio_coche() {
	   int precio_final=10000;
	   if (asientos_cuero==true) {
	    precio_final =precio_final+2000;
	    }
	   if (climatizador==true) {
	    precio_final=precio_final+1500;
	   }
	   return "El precio del coche es " +precio_final+" euros";
	  }
	 }