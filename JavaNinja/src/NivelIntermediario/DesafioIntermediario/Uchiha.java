package NivelIntermediario.DesafioIntermediario;

import DesafioIntermediario.Ninja;

public class Uchiha extends NinjaDesafio {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        mostrarInformacoes();
        System.out.println("Habilidade especial do Ninja: " + habilidadeEspecial);
    }
}
