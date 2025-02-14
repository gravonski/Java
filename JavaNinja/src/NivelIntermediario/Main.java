package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

/*        System.out.println("--------------Naruto Uzumaki---------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 19, 8, 1.95);
        System.out.println(naruto.getNome());
        naruto.setNome("Naruto Uzumaki da Silva");
        System.out.println(naruto.getNome());
        System.out.println("--------------Sasuke Uchiha---------------");*/

        Missoes missao = new Missoes("Resgatar o Naruto", RankNinja.CHUUNIN);
        missao.exibirDetalhes();
    }
}
