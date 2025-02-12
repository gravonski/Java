package NivelIntermediario;

public class Uchiha extends Ninja implements SharinganInterface {

    @Override
    public void sharinganAtivado() {
        System.out.println("O Sharingan foi ativo por " + nome);
    }
}
