
public class uso_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//varias formas de hacerlo
		
		//video 23
		
		
	/*	int [] mi_matriz = new int[5];
		int [] mi_matriz2 = new int[5];//podemos escoger la nomenclatura q queramos
		
		mi_matriz [0]=5;
		mi_matriz [1]=38;
		mi_matriz [2]=-15;
		mi_matriz [3]=92;
		mi_matriz [4]=71;*/
		
		int [] mi_matriz = {5,38,-15,92,71,78,69,98,23,53,43,65};//declaracion simplificada o implicita de matriz
		
		for (int i=0; i<mi_matriz.length; i++) {
		
			
			System.out.println("el valor del indice "+ i +" = "+ mi_matriz[i]);
		}
		
	}

}
