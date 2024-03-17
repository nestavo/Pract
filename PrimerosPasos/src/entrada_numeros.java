import javax.swing.*;
public class entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String num1 =JOptionPane.showInputDialog("introduce un numero");
double num2 = Double.parseDouble(num1);
System.out.print("la raiz de "+ num2 + " es ");
System.out.printf("%1.4f", Math.sqrt(num2));
	}

}
