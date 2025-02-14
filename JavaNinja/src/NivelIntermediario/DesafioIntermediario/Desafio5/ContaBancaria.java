package NivelIntermediario.DesafioIntermediario.Desafio5;

public abstract class ContaBancaria implements Conta{
    double saldo;
    double saldoNovo;
    double taxa;

    @Override
    public void depositar(double valor) {
        System.out.println("Você depositou R$" + valor);
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
}
