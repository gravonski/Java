package NivelIntermediario;

public enum RankNinja {
    GENIN("ser pika", 5),
    CHUUNIN("ser brabão", 4),
    JOUNIN("ser bão", 3),
    KAGE("ser fodinha", 2 );

    private String descricao;
    private int dificuldade;

    RankNinja(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
