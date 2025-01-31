package Desafios;

import java.util.Scanner;
import java.util.SortedMap;

public class CadastroDeNinjas {
    public static void main(String[] args) {
        /*Menu*/
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");

        /*Scanner*/
        Scanner textBox = new Scanner(System.in);

        int menu = textBox.nextInt();
        textBox.nextLine();

        switch (menu) {
            case 1:
                String[] nomeNinja = new String[1];
                String[] aldeia = new String[1];
                System.out.println(" ");
                System.out.println("-Cadastro de Ninjas-");
                System.out.print("Digite o nome do ninja: ");
                String cadastroNinja = textBox.nextLine();
                nomeNinja[0] = cadastroNinja;
                System.out.print("Qual a aldeia do ninja: ");
                String aldeiaNinja = textBox.nextLine();
                aldeia[0] = aldeiaNinja;
                System.out.println(nomeNinja[0]);
                System.out.println(aldeia[0]);

            break;
            case 2:
                System.out.println("-Lista de Ninjas-");
                for (int i = 0; i < 1; i++) {
                    System.out.println(nomeNinja[0]);
                }
        }

        /*if (menu == 1) {
            String[] nomeNinja = new String[1];
            String[] aldeia = new String[1];
            System.out.println(" ");
            System.out.println("-Cadastro de Ninjas-");
            System.out.print("Digite o nome do ninja: ");
            String cadastroNinja = textBox.nextLine();
            nomeNinja[0] = cadastroNinja;
            System.out.print("Qual a aldeia do ninja: ");
            String aldeiaNinja = textBox.nextLine();
            aldeia[0] = aldeiaNinja;
        } else if (menu == 2) {

            System.out.println("-Lista de Ninjas-");


        }*/


        textBox.close();
    }
}
