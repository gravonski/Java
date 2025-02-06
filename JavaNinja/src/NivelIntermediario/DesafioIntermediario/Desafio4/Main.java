package NivelIntermediario.DesafioIntermediario.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico naruto = new NinjaBasico("Naruto Uzumaki", 19, "Jutsu das Sombras");
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        NinjaAvancado sasuke = new NinjaAvancado("Sasuke Uchiha", 18, "Clone de Espécies", "Clonagem");
        sasuke.mostrarInformacoes();
        sasuke.executarHabilidade();

    }
}
