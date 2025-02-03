package NivelBasico.Condicoes;

public class IfeElse {
    public static void main(String[] args) {
        /*
        * Passar o NINJA de nível conforme o número de missões realizadas;
        * */

        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;
        String rank;

        if (numeroDeMissoes >= 10 && numeroDeMissoes <= 19 && idade >= 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }
    }
}
