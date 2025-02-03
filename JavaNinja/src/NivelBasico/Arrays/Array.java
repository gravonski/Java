package NivelBasico.Arrays;

public class Array {
    public static void main(String[] args) {

        String[][] ninjasEAldeias = new String[3][3];
        ninjasEAldeias [0][0] = "Aldeia da Folha";
        ninjasEAldeias [0][1] = "Naruto Uzumaki";
        ninjasEAldeias [0][2] = "Sasuka Haruno";

        ninjasEAldeias [1][0] = "Aldeia da Nevoa";
        ninjasEAldeias [1][1] = "Zabuza";
        ninjasEAldeias [1][2] = "Haku";

        ninjasEAldeias [2][0] = "Aldeia do Deserto";
        ninjasEAldeias [2][1] = "Gaara";
        ninjasEAldeias [2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println(ninjasEAldeias[i][0]);
        }

       /*int[] idade = new int[5];
        idade[0] = 15;
        idade[1] = 14;
        idade[2] = 16;
        idade[3] = 16;
        idade[4] = 12;

        String nomeNinja = "Naruto";
        nomeNinja = "Boruto";
        System.out.println(nomeNinja);

        ninja = new String[6];
        ninja[0] = "Hashirama";
        ninja[1] = "Tobirama";
        ninja[2] = "Hiruzen";
        ninja[3] = "Minato";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi";
        System.out.println(ninja[0]);

        for (int i = 0; i < 6; i++) {
            System.out.println(ninja[i]);
        }*/
    }
}
