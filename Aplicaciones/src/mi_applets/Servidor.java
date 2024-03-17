package mi_applets;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Crear un servidor en el puerto 12345
            System.out.println("STATUS: Esperando conexión de cliente...");
            Socket clientSocket = serverSocket.accept(); // Esperar a que un cliente se conecte
            System.out.println("STATUS: Cliente conectado");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // Para recibir datos del cliente
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // Para enviar datos al cliente
            Scanner scanner = new Scanner(System.in);

            String inputLine;
            while (true) {
                inputLine = in.readLine(); // Recibir la cadena del cliente
                System.out.println("Cliente dice: " + inputLine);
                out.println(inputLine); // Enviar eco al cliente
                if (inputLine.equals("FIN")) {
                    break;
                }
            }

            in.close();
            out.close();
            clientSocket.close(); // Cerrar el socket al finalizar
            serverSocket.close(); // Cerrar el socket del servidor al finalizar
            scanner.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}