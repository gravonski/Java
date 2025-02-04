package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 17;
        naruto.ModoSabio();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 19;
        sasuke.SharinganAtivado();

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "Aldeia da Folha";
        sakura.idade = 18;
        sakura.Cura();

        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.aldeia = "Aldeia da Folha";
        hinata.idade = 16;
        hinata.ChakraDoFogo();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Hyuga Uzumaki";
        boruto.idade = 15;
        boruto.aldeia = "Aldeia da Folha";
        boruto.AtivarJougan();
        boruto.AtivarKarma();
        boruto.ModoSabio();
    }
}
