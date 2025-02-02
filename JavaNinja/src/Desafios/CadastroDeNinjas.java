package Desafios;

import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {
        /*Scanner*/
        Scanner textBox = new Scanner(System.in);


        /*Array dos Ninjas*/
        int numeroNinjas = 10;
        String[] ninjas = new String[numeroNinjas];

        //Contadores
        int ninjasCadastrados = 0;
        int opcoes = 0;



        while (opcoes != 3) {
            /*Menu*/
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcoes = textBox.nextInt();
            textBox.nextLine();

            switch (opcoes) {
                case 1:
                    if (ninjasCadastrados < numeroNinjas) {
                        System.out.print("Digite o nome do Ninja: ");
                        String nomeNinja = textBox.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("O ninja " + nomeNinja + " foi cadastrado com sucesso.");
                        System.out.println(" ");
                    } else {
                        System.out.println("Número máximo de cadastro alcançados, tente novamente mais tarde!");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado.");
                    } else {
                        System.out.println("--------- Lista de Ninjas ---------");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                break;}

                        case 3:
                            System.out.println("Estamos encerrando o programa...");
                            break;

                        default :
                            System.out.println("Opção Inválida");
                            break;
            }

        }

        textBox.close();
        }
    }
