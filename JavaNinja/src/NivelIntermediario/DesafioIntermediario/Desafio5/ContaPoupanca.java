package NivelIntermediario.DesafioIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Você depositou R$" + valor + " na Conta Poupança");
        taxa = valor / 100;
        saldoNovo = saldo + valor - taxa;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Você tem R$" + saldoNovo + " na Conta Poupança");
    }

}
