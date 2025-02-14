package NivelIntermediario;

public class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numerosDeMissoesConcluidas;
    private double altura = 1.80;

    public Ninja() {

    }

    public Ninja(String nome, String aldeia, int idade, int numerosDeMissoesConcluidas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numerosDeMissoesConcluidas = numerosDeMissoesConcluidas;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumerosDeMissoesConcluidas() {
        return numerosDeMissoesConcluidas;
    }

    public void setNumerosDeMissoesConcluidas(int numerosDeMissoesConcluidas) {
        this.numerosDeMissoesConcluidas = numerosDeMissoesConcluidas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

