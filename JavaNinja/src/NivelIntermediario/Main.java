package NivelIntermediario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List <String> listaNinja = new ArrayList<>();
        listaNinja.add("Naruto Uzumaki");
        listaNinja.add("Sasuke Uchiha");
        listaNinja.add("Sakura Haruno");
        listaNinja.add("Naruto Uzumaki");

        Set <String> setNinjas = new HashSet<>();
        setNinjas.addAll(listaNinja);


        System.out.println(setNinjas);
    }
}
