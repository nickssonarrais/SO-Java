package questao_3;

public class Depositar extends Thread {
    private Conta conta;
    private double valor;
    private String idLock;
    private String idFree;

    public Depositar(Conta conta, double valor, String id) {
        this.conta = conta;
        this.valor = valor;
        this.idLock = id + " LOCK ";
        this.idFree = id + " FREE ";
    }


    public void run() {
        synchronized (conta) {
            System.out.println(idLock + conta + " DESEJA DEPOSITAR " + valor);
            double saldo = conta.getSaldo();
            double novoSaldo = saldo + valor;
            conta.setSaldo(novoSaldo);
            System.out.println(idFree + conta + " DEPOSITOU " + valor);
        }
    }
}
