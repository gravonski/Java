package NivelIntermediario;

public abstract class Hogakes {

    String nome;
    int idade;
    boolean vivoOuMorto;

    public Hogakes(){
        //construtor vazio
    }

    public abstract void sabedoriaHogake();


    public Hogakes (String nome, int idade, boolean vivoOuMorto) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }


}
