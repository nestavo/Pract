import javax.swing.*;
public class uso_array_dos {

	private static final int i = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String [] paises= new String[8];
		
		/*paises[0]= "España";
		paises[1]= "Mexico";
		paises[2]= "Peru";
		paises[3]= "Chile";
		paises[4]= "Argentina";
		paises[5]= "Venezuela";
		paises[6]= "Ecuador";
		paises[7]= "Cuba";*/
		
/*for (int i=0; i<paises.length; i++) {
	System.out.println("pais " + (i+1) + " es "+paises[i]);
}*/
		
		
	//	String [] paises = {"España", "Mexico", "Peru", "Chile", "Argentina", "Venezuela", "Ecuador", "Cuba"};
		
		for (int i=0; i<8; i++) {
			
			paises[i]=JOptionPane.showInputDialog("introduce pais gg"+ (i+1));
		}
		
		
		for (String elemento:paises) {
			
			System.out.println(elemento);
			
		}
		
}
		}
			
	


