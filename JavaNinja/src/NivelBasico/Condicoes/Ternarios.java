package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        *Ternários : maneira de reduzir o código
        * */

        int idade = 10;

        String age = (idade <= 10) ? "O ninja tem 10 anos ou menos" : "Idade maior que 10";

        System.out.println("Idade: " + idade);
        System.out.println(age);
    }
}
