package NivelIntermediario;

public class Uchiha extends Ninja implements SharinganInterface {

    @Override
    public void inteligenciaDeCombate() {
        super.inteligenciaDeCombate();
    }

    @Override
    public void metodoSemOver() {
        System.out.println("Oi");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("O Sharingan foi ativo por " + nome);
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        super.inteligenciaDeCombate(qi);
    }

    public Uchiha(String nome, String aldeia, int idade, int numerosDeMissoesConcluidas, RankNinja rank) {
        super(nome, aldeia, idade, numerosDeMissoesConcluidas, rank);
    }
}
