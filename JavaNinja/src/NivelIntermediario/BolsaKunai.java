package NivelIntermediario;

import java.util.List;

public class BolsaKunai {

    private List<Kunai> kunais;

    public BolsaKunai(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    public void adicionarKunai(Kunai kunai){
        kunais.add(kunai);
    }

    @Override
    public String toString() {
        return "Bolsa de Kunais: " + kunais.toString();
    }
}