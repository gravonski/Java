package NivelIntermediario;

public class Hatake extends Ninja implements SharinganInterface, AmbuInterface{

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + " é um Ninja de Elite da Ambu");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("O Sharingan dos Hatake foi ativo por " + nome);
    }

    public void boasVindas() {
        System.out.println(nome + ": 'Eu sou um Hatake!'");
    }

}
