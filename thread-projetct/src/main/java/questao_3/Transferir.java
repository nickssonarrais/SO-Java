package questao_3;

public class Transferir extends Thread {
    private Conta contaSacada;
    private Conta contaDepositada;
    private double valor;
    private String idLock;
    private String idFree;

    public Transferir(Conta contaSacada, Conta contaDepositada, double valor, String id) {
        this.contaSacada = contaSacada;
        this.contaDepositada = contaDepositada;
        this.valor = valor;
        this.idLock = id + " LOCK ";
        this.idFree = id + " FREE ";
    }
    public void run() {
        synchronized (contaDepositada) {
            synchronized (contaSacada) {
                System.out.println(idLock + contaSacada + " DESEJA TRANSFERIR " + valor + " PARA "+ contaDepositada );

                double saldo = contaSacada.getSaldo();
                double novoSaldo = saldo - valor;

                if (novoSaldo < 0) System.out.println(idFree + contaSacada + " NÃO TRANSFERE " + valor + " PARA "+ contaDepositada + ". Saldo insuficiente. " );
                else {
                    contaSacada.setSaldo(novoSaldo);
                    contaDepositada.setSaldo(contaDepositada.getSaldo() + valor);
                    System.out.println(idFree + contaSacada + " TRANSFERIU " + valor + " PARA "+ contaDepositada );
                }
            }
        }
    }
}
