package NivelIntermediario.DesafioIntermediario;

import DesafioIntermediario.Uchiha;

public class NinjaDesafio {
    String nome;
    int idade;
    String missao;
    char nivelMissao;
    String statusMissao;


    public void mostrarInformacoes(){
        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade do Ninja: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade da Missão: " + nivelMissao);
        System.out.println("Status da Missão: " + statusMissao);
    }
}
