package NivelIntermediario.DesafioIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Você depositou R$" + valor + " na Conta Corrente");
        saldoNovo = saldo + valor;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Você tem R$" + saldoNovo + " na Conta Corrente");
        }

}
