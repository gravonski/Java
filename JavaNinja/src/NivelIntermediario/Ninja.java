package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    public void SharinganAtivado() {
        System.out.println("O Sharingan está Ativo!");
    }

    public String Saudacao() {
        return "Olá, eu sou um Ninja.";
    }

    public int anosParaSerHogake(int idadeMininaParaSerHogake) {
        return idadeMininaParaSerHogake - idade;
    }
}
