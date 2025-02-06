package NivelIntermediario.DesafioIntermediario.Desafio4;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade do Ninja: " + idade);
        System.out.println("Habilidade do Ninja: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Minha habilidade é " + habilidade + " e ela está ativa juntamente com a minha especialidade " + especialidade + "!");
        System.out.println("----------------------------------");
    }
}
