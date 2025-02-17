package NivelIntermediario;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica <T> {

    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    //colocar equipamentos genericos
    public void adicionarEquipamentosGenericos(T equipamentoGenerico) {
        equipamentos.add(equipamentoGenerico);
    }

    //Mostrar ferramentas
    public void mostrarEquipamentos() {
        for (T equipamento : equipamentos){
            System.out.println(equipamento);
        }
    }

    @Override
    public String toString() {
        return "Bolsa de Equipamentos: " + equipamentos.toString();
    }
}
