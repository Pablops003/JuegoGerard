import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.concurrent.Executors;

public class Atrapados  {
        static int tamaño = 5;
        static boolean[][] tablero = new boolean[tamaño][tamaño]

    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()){
            ServerSocket serverSocket = new ServerSocket(80);

            while(true){
                Socket jugador1 =serverSocket.accept();
                try {
                    PrintWriter printWriter1 = new PrintWriter(jugador1.getOutputStream(), true);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jugador1.getInputStream()));
                    printWriter1.println("conectando...");

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}