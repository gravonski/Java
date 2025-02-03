package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        * Scanner : Jeito de colocar o Usuário na aplicação(Interação)
        */
        Scanner caixaDeTexto = new Scanner (System.in);

        System.out.print("Escreva aqui o nome do Ninja: ");
        String nome = caixaDeTexto.nextLine();

        System.out.print("Escreva aqui a idade do Ninja: ");
        int idade = caixaDeTexto.nextInt();

        if (idade < 18) {
            System.out.println("O ninja " + nome + " tem " + idade + " anos e ainda não pode fazer missões fora da aldeia.");
        } else {
            System.out.println("O ninja " + nome + " tem " + idade + " anos e já pode realizar missões fora da aldeia.");
        }

        caixaDeTexto.close();
    }
}
