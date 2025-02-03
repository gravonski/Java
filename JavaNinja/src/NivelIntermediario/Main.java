package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 18;

        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 17;

        int quantoTempoFaltaProHogake = sasuke.anosParaSerHogake(50);
        sasuke.SharinganAtivado();
        String chamaMetodo = naruto.Saudacao();
        System.out.println("O ninja " + sasuke.nome + " tem " + sasuke.idade + " anos e faltam " + quantoTempoFaltaProHogake + " anos para ser um Hogake");
        System.out.println(chamaMetodo);
    }
}
