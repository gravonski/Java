package NivelIntermediario.DesafioIntermediario.Desafio5;

public class Main {
    public static void main(String[] args) {

        ContaCorrente deposito = new ContaCorrente(1000);
        System.out.println("Seu saldo bancário: R$" + deposito.saldo);
        deposito.depositar(800);
        deposito.consultarSaldo();


        ContaPoupanca pagamento = new ContaPoupanca(550);
        System.out.println("Saldo bancário: R$" + pagamento.saldo);
        pagamento.depositar(500);
        System.out.println("Taxa de depósito: R$" + pagamento.taxa);
        pagamento.consultarSaldo();
    }
}
