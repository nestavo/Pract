package mi_applets;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345); // Conectar al servidor
            System.out.println("STATUS: Conectado al servidor");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Para recibir datos del servidor
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // Para enviar datos al servidor
            Scanner userInput = new Scanner(System.in);

            String userInputLine;
            while (true) {
                System.out.println("Introduce un texto a enviar (FIN para acabar): ");
                userInputLine = userInput.nextLine();
                out.println(userInputLine); // Enviar la cadena al servidor
                if (userInputLine.equals("FIN")) {
                    break;
                }
                System.out.println("STATUS: Enviando "+ userInputLine);
                System.out.println("STATUS: esperando eco");              
                System.out.println("echo:" + in.readLine()); // Mostrar el eco recibido
            }

            in.close();
            out.close();
            socket.close();
            userInput.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}