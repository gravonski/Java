package NivelIntermediario;

public class Missoes {
    private String nome;
    private RankNinja rank ;

    public void exibirDetalhes() {
        System.out.println("Missão: " + nome + " Rank: " + rank + " Descrição: " + rank.getDescricao() + " Dificuldade: " + rank.getDificuldade());
    }

    public Missoes(String nome, RankNinja rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankNinja getRank() {
        return rank;
    }

    public void setRank(RankNinja rank) {
        this.rank = rank;
    }
}
