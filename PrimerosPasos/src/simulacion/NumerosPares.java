package simulacion;


import java.util.Arrays;

public class NumerosPares extends Thread {
    private int[] numeros;
    private int[] numerosPares;

    public NumerosPares(int[] numeros) {
        this.numeros = numeros;
    }

    
    public void run() {
        // Filtrar los números pares
        numerosPares = Arrays.stream(numeros)
                .filter(numero -> numero % 2 == 0)
                .sorted()
                .toArray();
        
        
    }

    public int[] getNumerosPares() {
        return numerosPares;
    }
    
    
    public static void main(String[] args) {
        // Crear un array de números enteros aleatorios
    	
    	System.out.println("Array original:");
    	
        int[] numeros = new int[(int) (Math.random() * 100) + 1];
        for (int i = 0; i < numeros.length; i++) {
        	
        	
            numeros[i] = (int) (Math.random() * 100) + 1;
            
            
            System.out.print(numeros[i]+ " ");
            
        }
System.out.println(" ");
        // Crear un hilo para obtener los números pares
        NumerosPares thread = new NumerosPares(numeros);
        thread.start();

        try {
            thread.join();
            // Obtener el resultado
            int[] numerosPares = thread.getNumerosPares();
            
            // Imprimir el array de números pares
            System.out.println("Array de números pares ordenados de menor a mayor:");
            for (int numero : numerosPares) {
                System.out.print(numero + " ");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

 