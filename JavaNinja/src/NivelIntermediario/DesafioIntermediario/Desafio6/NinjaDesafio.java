package NivelIntermediario.DesafioIntermediario.Desafio6;

public class NinjaDesafio {
    private String nome;
    private int idade;
    private String aldeia;

    public NinjaDesafio() {
    }

    public NinjaDesafio(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    @Override
    public String toString() {
        return "Nome do Ninja: " + nome + " , Idade do Ninja: " + idade + " , Aldeia do Ninja: " + aldeia;
    }


}
