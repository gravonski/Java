package Desafios;

import jdk.jshell.Snippet;

public class MissoesNinja {
    public static void main(String[] args) {
        /*Ninja 1*/
        String ninja1 = "Naruto";
        int idade1 = 13;
        String missao1 = "Escoltar Tazuna";
        char dificuldade1 = 'd';
        String status1 = "Conclúida";


        /*Ninja 2*/
        String ninja2 = "Sasuke";
        int idade2 = 15;
        String missao2 = "Exame Chūnin";
        char dificuldade2 = 'B';
        String status2 = "Em Andamento";

        /*Ninja 3*/
        String ninja3 = "Sakura";
        int idade3 = 12;
        String missao3 = "Resgatar Sasuke";
        char dificuldade3 = 'A';
        String status3 = "Iniciando";

        if (idade1 < 15) {
            if(dificuldade1 == 'C' || dificuldade1 == 'D' || dificuldade1 == 'c' || dificuldade1 == 'd') {
                status1 = "Missão Conclúida";
            } else {
                status1 = "O Ninja não tem idade suficiente para concluir a missão";
            }
        } else {
            status1 = "Missão concluída com sucesso";
        }

        if (idade1 < 15) {
            if(dificuldade2 == 'C' || dificuldade2 == 'D' || dificuldade2== 'c' || dificuldade2 == 'd') {
                status2 = "Missão Conclúida";
            } else {
                status2 = "O Ninja não tem idade suficiente para concluir a missão";
            }
        } else {
            status2 = "Missão concluída com sucesso";
        }

        if (idade1 < 15) {
            if(dificuldade3 == 'C' || dificuldade3 == 'D' || dificuldade3 == 'c' || dificuldade3 == 'd') {
                status3 = "Missão Conclúida";
            } else {
                status3 = "O Ninja não tem idade suficiente para concluir a missão";
            }
        } else {
            status3 = "Missão concluída com sucesso";
        }

        System.out.println("-----------------------------------------");
        System.out.println("Nome do Ninja: " + ninja1);
        System.out.println("Idade do Ninja: " + idade1);
        System.out.println("Missão: " + missao1);
        System.out.println("Dificuldade da Missão: " + dificuldade1);
        System.out.println("Status da Missão: " + status1);
        System.out.println("-----------------------------------------");

        System.out.println("Nome do Ninja: " + ninja2);
        System.out.println("Idade do Ninja: " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Dificuldade da Missão: " + dificuldade2);
        System.out.println("Status da Missão: " + status2);

        System.out.println("-----------------------------------------");
        System.out.println("Nome do Ninja: " + ninja3);
        System.out.println("Idade do Ninja: " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Dificuldade da Missão: " + dificuldade3);
        System.out.println("Status da Missão: " + status3);
        System.out.println("-----------------------------------------");
    }
}
