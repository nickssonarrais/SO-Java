package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 399611
 */
public class Server {
    
    static String HOST = "127.0.0.1";
    static int PORT = 20000;

    public static void main(String[] args) {
        try {
            // TODO code application logic here
            ServerSocket server = new ServerSocket(PORT);
            System.out.println("Servidor iniciado em " + PORT);
            Socket cliente = server.accept();
            System.out.println("Nova conexao com Cliente+ "+cliente.getInetAddress().getHostAddress() );
            Scanner scanner = new Scanner(cliente.getInputStream());
            String buffet = "";
            
            while (!buffet.equals("exit")) {
                   buffet = scanner.nextLine();
                   System.out.println(buffet);
            }
            scanner.close();
            server.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}