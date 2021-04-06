package socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    
      
    static String HOST = "127.0.0.1";
    static int PORTA = 20000;
    
    public static void main(String[] args) {
        try {
            Socket cliente = new Socket(HOST, PORTA);
            System.out.println("Cliente conectou ao server");
            PrintStream saida = new PrintStream(cliente.getOutputStream());
            Scanner teclado = new Scanner(System.in);
            String buffet = "";
            boolean exist_msg = false;
            
            while (!buffet.equals("exit")) {
                buffet = teclado.nextLine();
                saida.println(buffet);
                //exist_msg = teclado.hasNextLine();
            }
            System.out.println("Cliente Encerrou o Servidor e Também Será encerrado");
            saida.close();
            teclado.close();
            cliente.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
