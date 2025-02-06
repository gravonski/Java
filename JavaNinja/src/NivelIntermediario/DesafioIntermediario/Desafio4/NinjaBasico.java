package NivelIntermediario.DesafioIntermediario.Desafio4;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }


    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade do Ninja: " + idade);
        System.out.println("Habilidade do Ninja: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Minha habilidade é " + habilidade + " e ela está ativa!");
        System.out.println("----------------------------------");
    }

}
