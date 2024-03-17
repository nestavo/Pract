
public class arrays_bidemensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] matrix = new int [4] [5];
		
		
		matrix [0] [0]=10;
		matrix [0] [1]=20;
		matrix [0] [2]=15;
		matrix [0] [3]=12;
		matrix [0] [4]=1;
		
		matrix [1] [0]=56;
		matrix [1] [1]=45;
		matrix [1] [2]=32;
		matrix [1] [3]=21;
		matrix [1] [4]=11;
		
		matrix [2] [0]=98;
		matrix [2] [1]=89;
		matrix [2] [2]=75;
		matrix [2] [3]=65;
		matrix [2] [4]=58;
		
		matrix [3] [0]=94;
		matrix [3] [1]=82;
		matrix [3] [2]=73;
		matrix [3] [3]=60;
		matrix [3] [4]=24;
		
		
		for (int i=0; i<4; i++ ) {
			System.out.println();
			for (int j=0; j<5; j++) {
				System.out.print(" - " +matrix [i] [j]);
			}
			}
	}
	

}
