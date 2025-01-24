package Desafios;

public class MissoesNinja {
    public static boolean main(String[] args) {
        /*Ninja 1*/
        String ninja1 = "Naruto";
        int idade1 = 16;
        String missão1 = "Escoltar Tazuna";
        char dificuldade1 = 'C';
        boolean concluido1 = true;

        /*Ninja 2*/
        String ninja2 = "Sasuke";
        int idade2 = 17;
        String missão2 = "Exame Chūnin";
        char dificuldade2 = 'B';
        boolean concluido2;

        /*Ninja 3*/
        String ninja3 = "Sakura";
        int idade3 = 15;
        String missão3 = "Resgatar Sasuke";
        char dificuldade3 = 'A';
        boolean concluido3 = false;

        if (idade1 < 15) {
            if (dificuldade1 == 'C') {
                System.out.println("A missão pode ser executada.");
            }
            return concluido1 = true;
        }
    }
}
