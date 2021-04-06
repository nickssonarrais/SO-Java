import questao_1.*;
import questao_2.Corredor;
import questao_3.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite a questão desejada ou exit para sair: ");
        String escolha = terminal.nextLine();

        while (!escolha.equalsIgnoreCase("exit")) {
            if (escolha.equalsIgnoreCase("1")) {
                System.out.println("\nPRIMEIRA QUESTÃO\n");
                int ate = 100;
                ContadorDecrescente cont1 = new ContadorDecrescente("Decrescente T1", ate);
                ContadorDecrescente cont2 = new ContadorDecrescente("Decrescente T2", ate);

                ContadorCrescente cont3 = new ContadorCrescente("Crescente T3", ate);
                ContadorCrescente cont4 = new ContadorCrescente("Crescente T4", ate);
                Thread tcont3 = new Thread(cont3);
                Thread tcont4 = new Thread(cont4);

                cont1.start();
                cont2.start();
                tcont3.start();
                tcont4.start();
            }
            else if (escolha.equalsIgnoreCase("2")) {
                System.out.println("\nSEGUNDA QUESTÃO\n");
                int trajeto = 20;
                Corredor cor1 = new Corredor("Corredor 1", trajeto, 1);
                Corredor cor2 = new Corredor("Corredor 2", trajeto, 2);
                Corredor cor3 = new Corredor("Corredor 3", trajeto, 3);
                Corredor cor4 = new Corredor("Corredor 4", trajeto, 4);

                cor1.start();
                cor2.start();
                cor3.start();
                cor4.start();
            }
            else if (escolha.equalsIgnoreCase("3")) {
                System.out.println("\nTERCEIRA QUESTÃO\n");
                Conta c1 = new Conta("João", 1000);
                Conta c2 = new Conta("Paulo", 1000);
                Conta c3 = new Conta("Pedro", 1000);

                //Transferir t1 = new Transferir(c1, c2, 200, "t1");
                //Transferir t2 = new Transferir(c2, c3, 200, "t2");

                Sacar s1c1 = new Sacar(c1, 1000, "s1");
                Sacar s2c1 = new Sacar(c1, 800, "s3");
                Sacar s3c1 = new Sacar(c1, 150, "s3");
//                Sacar s2 = new Sacar(c2, 200, "s3");

//
//                Depositar d1 = new Depositar(c1, 1900, "d1");
//                Depositar d2 = new Depositar(c3, 1000, "d2");

//                t1.start();
//                t2.start();

//                d2.start();
//                d1.start();

                s1c1.start();
                s2c1.start();
                s3c1.start();

            }
            //System.out.print("Digite a questão desejada ou exit para sair: ");
            escolha = terminal.nextLine();
        }
    }
}
