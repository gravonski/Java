package NivelIntermediario;

public class Ninja {

    //TODO: INCLUIR 2 NOVOS ATRIBUTOS:  numerosDeMissoesConcluidas & Rank
    //TODO: RANK: Gennin, Chunnin, Jouninn, Hogake

    String nome;
    String aldeia;
    int idade;
    int numerosDeMissoesConcluidas;
    RankNinja rank;

    //TODO: Sobrecarregar o novo construtor com o novos atributos

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, int numerosDeMissoesConcluidas, RankNinja rank) {
        this(nome, aldeia, idade);
        this.numerosDeMissoesConcluidas = numerosDeMissoesConcluidas;
        this.rank = rank;
    }

    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é " + nome + " e essa é a minha Inteligência de Combate");
    }

    public void inteligenciaDeCombate(int qi){
        if (qi >= 120) {
            System.out.println("Meu nome é " + nome + " e eu sou um gênio em Inteligência de Combate, pois meu QI é de " + qi);
        } else {
            System.out.println("Meu nome é " + nome + " e Inteligência de Combate não é o meu forte, pois meu QI é de " + qi);
        }

    }

    public void metodoSemOver() {
        System.out.println("Hello, World!");
    }

    @Override
    public String toString() {
        return "Nome do Ninja: " + nome + ".   Venho da " + aldeia + " e tenho " + idade + " anos.";
    }
}

