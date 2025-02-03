package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudosSwitchCase {
    public static void main(String[] args) {
        /*Swich Case: Servem para gerar casos ESPECÍFICOS
        */
        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Escolha um personagem:");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sakura Haruno");
        System.out.println("3 - Sasuke Uchiha");

        int choose = caixaDeTexto.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu a Sakura Haruno");
                break;
            case 3:
                System.out.println("Você escolheu o Sasuke Uchiha");
                break;
            default:
                System.out.println("Resposta inválida! Tente novamente");
        }
        caixaDeTexto.close();
    }
}
