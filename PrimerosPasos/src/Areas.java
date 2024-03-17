import java.util.*;



import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Elige una opción: \n1: Cuadrado  \n2: Rectngulo  \n3: Triangulo  \n4: Circulo");
	
	int figura=entrada.nextInt();
	
	 switch (figura) {
	 
	 case 1:
		 int lado=Integer.parseInt(JOptionPane.showInputDialog("introduce le lado"));
	 System.out.println("El area del cuadrado es "+ Math.pow(lado,2));
	 break;
	 
	 case 2:
		 int base=Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
		 int altura=Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
	System.out.println("El area del triangulo es "+base*altura);
	 break;
	
	 case 3:
		 base=Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
		 altura=Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
	System.out.println("el area del triangulo es "+ (base*altura)/2);
	break;
	
	 case 4:
		int radio=altura=Integer.parseInt(JOptionPane.showInputDialog("introduce el radio"));
	 System.out.print("el area del ciculo es ");
	 System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
		
		break;
		
		default:
			System.out.println("la opción no es correcta");
	 }
	}
}
