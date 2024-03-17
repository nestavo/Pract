package POO;


import javax.swing.JOptionPane;
public class uso_vehiculo {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

/*  coche renault= new coche();//instanciar una clase. ejemplar de clase
  
  renault.establece_color(JOptionPane.showInputDialog("¿De que color quieres el coche?"));
  
 renault.configura_asientos(JOptionPane.showInputDialog("¿tiene asientos de cuero?"));
 
  System.out.println(renault.dime_datos_generales());
  System.out.println(renault.dime_color());
  System.out.println(renault.dime_asientos());
  renault.configura_clima(JOptionPane.showInputDialog("¿Lo quieres con climatizador?"));
  System.out.println(renault.dime_clima());
  System.out.println(renault.dime_peso_coche());
  System.out.println(renault.precio_coche());
  
 // System.out.println("Este coche tiene "+ renault.getMotor()+ "cc de motor");
 // System.out.println("El coche tiene "+ renault.getRuedas() + " ruedas");*/
 
 
 
 
 coche micoche1=new coche();
 
 micoche1.establece_color("rojo");
 
 furgoneta mifurgoneta1=new furgoneta(7,580);
 
 mifurgoneta1.establece_color("azul");
 
 mifurgoneta1.configura_asientos("si");
 
 mifurgoneta1.configura_clima("si");
 
 System.out.println(micoche1.dime_datos_generales()+" "+ micoche1.dime_color());
 
 System.out.println(mifurgoneta1.dime_datos_generales());
 System.out.println(mifurgoneta1.dimeDatosFugoneta());
 
 
 
 
 
 }

}
