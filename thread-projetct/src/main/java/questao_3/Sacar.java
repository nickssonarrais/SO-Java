package questao_3;

public class Sacar extends Thread {
    private Conta conta;
    private double valor;
    private String idLock;
    private String idFree;

    public Sacar(Conta conta, double valor, String id) {
        this.conta = conta;
        this.valor = valor;
        this.idLock = id + " LOCK ";
        this.idFree = id + " FREE ";
    }

    public void run() {
        synchronized (conta){
            double saldo = conta.getSaldo();
            double novoSaldo = saldo - valor;

            System.out.println(idLock+ conta + " DESEJA SACAR "+ valor);

            if (novoSaldo < 0){
                    
                System.out.println(idFree + conta + " NÃO SACOU " + valor + "  -- Saldo Disponível: "+saldo);
            }
            else {
                conta.setSaldo(novoSaldo);
                System.out.println(idFree + conta + " SACOU " + valor);
            }
        }
    }
    
//        public void run() {
//            double saldo = conta.getSaldo();
//            double novoSaldo = saldo - valor;
//
//            System.out.println(idLock+ conta + " DESEJA SACAR "+ valor);
//
//            if (novoSaldo < 0){
//                System.out.println(idFree + conta + " NÃO SACOU " + valor + "  -- Saldo Disponível: "+saldo);
//            }
//            else {
//                conta.setSaldo(novoSaldo);
//                System.out.println(idFree + conta + " SACOU " + valor);
//            }
//    }

}
