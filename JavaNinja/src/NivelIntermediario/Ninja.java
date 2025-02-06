package NivelIntermediario;

public abstract class Ninja implements EstrategiaDeBatalha {

    String nome;
    String aldeia;
    int idade;

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é me ataque especial");
    }

    @Override
    public void EstrategiaDeBatalhaNinja(){
    System.out.println("Meu nome é " + nome + " e essa é minha estratégia de batalha;");
    }

}
