package NivelIntermediario;

public class Uchiha extends Ninja implements SharinganInterface {

    /*
    * Metodo:
    * Implementado pela interface SharinganInterface
    */

    @Override
    public void sharinganAtivado() {
        System.out.println("Sharingan Ativo");
    }

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade, int numerosDeMissoesConcluidas, double altura) {
        super(nome, aldeia, idade, numerosDeMissoesConcluidas, altura);
    }
}
