package Desafios;

public class MissoesNinja {
    public static void main(String[] args) {
        /*Ninja 1*/
        String ninja1 = "Naruto";
        int idade1 = 13;
        String missao1 = "Escoltar Tazuna";
        char dificuldade1 = 'A';
        boolean concluido1 = false;

        /*Ninja 2*/
        String ninja2 = "Sasuke";
        int idade2 = 14;
        String missao2 = "Exame Chūnin";
        char dificuldade2 = 'B';
        boolean concluido2 = true;

        /*Ninja 3*/
        String ninja3 = "Sakura";
        int idade3 = 15;
        String missao3 = "Resgatar Sasuke";
        char dificuldade3 = 'A';
        boolean concluido3 = true;

        String mensagem1;
        String mensagem2;
        String mensagem3;

        if (concluido1){
            mensagem1 = "Missão conclúida";
        } else {
            mensagem1 = "Missão não concluída";
        }

        if (concluido2){
            mensagem2 = "Missão conclúida";
        } else {
            mensagem2 = "Missão não concluída";
        }

        if (concluido3) {
            mensagem3 = "Missão conclúida";
        } else {
            mensagem3 = "Missão não concluída";
        }

        if (idade1 < 15) {
            if (dificuldade1 == 'C') {
                System.out.println(mensagem1 + " pelo Ninja " + ninja1);
            } else if (dificuldade1 == 'D') {
                System.out.println(mensagem1 + " pelo Ninja " + ninja1);
            } else {
                System.out.println(mensagem1 + " pelo Ninja " + ninja1);
            }
        } else {
            System.out.println(mensagem1 + " pelo Ninja " + ninja1);
        }

        if (idade2 < 15) {
            if (dificuldade2 == 'C') {
                System.out.println(mensagem2 + " pelo Ninja " + ninja2);
            } else if (dificuldade2 == 'D') {
                System.out.println(mensagem2 + " pelo Ninja " + ninja2);
            } else {
                System.out.println(mensagem2 + " pelo Ninja " + ninja2);
            }
        } else {
            System.out.println(mensagem2 + " pelo Ninja " + ninja2);
        }

        if (idade3 < 15) {
            if (dificuldade3 == 'C') {
                System.out.println(mensagem3 + " pelo Ninja " + ninja3);
            } else if (dificuldade3 == 'D') {
                System.out.println(mensagem3 + " pelo Ninja " + ninja3);
            } else {
                System.out.println(mensagem3 + " pelo Ninja " + ninja3);
            }
        } else {
            System.out.println(mensagem3 + " pelo Ninja " + ninja3);
        }
    }
}
