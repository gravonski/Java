package NivelBasico;

public class Array {
    public static void main(String[] args) {

        String[] ninja = new String[5];
        ninja[0] = "Naruto Uzimaki";
        ninja[1] = "Sakura Haruno";
        ninja[2] = "Sasuke Uchiha";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Rock Lee";
        System.out.println(ninja[0]);

        int[] idade = new int[5];
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
        }
    }
}
