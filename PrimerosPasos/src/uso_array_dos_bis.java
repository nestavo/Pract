
public class uso_array_dos_bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//video 24 final
		//genera numeros aleatorios
		int[] matriz_aleatorios=new int[200];
		for (int i=0; i<matriz_aleatorios.length; i++ ) {
			
			matriz_aleatorios[i] =(int)Math.round(Math.random()*100);//refundicion porque el metodo random devuelve decimal y math round para q redonde y por 100 para q nos genere numeros aleatorios entre cero y cien
		}
		for (int numeros:matriz_aleatorios) {
			System.out.print(numeros + " - ");
		}
	}

}
