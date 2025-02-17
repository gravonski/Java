package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        BolsaGenerica<Object> bolsaNinja = new BolsaGenerica<>();
        bolsaNinja.adicionarEquipamentosGenericos("Kunai");
        bolsaNinja.adicionarEquipamentosGenericos("Shuriken");
        bolsaNinja.adicionarEquipamentosGenericos("Pergaminho");
        bolsaNinja.mostrarEquipamentos();
        

        /*
        EquipamentosNinja kunai = new EquipamentosNinja("Kunai");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminhos = new EquipamentosNinja("Pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsaNinja = new BolsaGenerica<>();
        bolsaNinja.adicionarEquipamentosGenericos(kunai);
        bolsaNinja.adicionarEquipamentosGenericos(shuriken);
        bolsaNinja.adicionarEquipamentosGenericos(pergaminhos);
        bolsaNinja.mostrarEquipamentos();
*/

    }
}
