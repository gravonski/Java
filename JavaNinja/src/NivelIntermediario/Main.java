package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha" , 18, 8, RankNinja.KAGE);
        sasuke.sharinganAtivado();
        sasuke.metodoSemOver();
        System.out.println(sasuke);

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Névoa" , 58, 9, RankNinja.KAGE);
        madara.sharinganAtivado();
        System.out.println(madara.rank);
        madara.inteligenciaDeCombate(110);

        Hatake kakashi = new Hatake("Kakashi Hatake", "Aldeia da Folha" , 79, 46, RankNinja.JOUNIN);
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
        kakashi.metodoSemOver();
    }

}
