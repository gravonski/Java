package NivelIntermediario;

import NivelBasico.Arrays.Array;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Arrays
        System.out.println("---------------ARRAY-----------------");
        String[] ninjas = new String[3];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        System.out.println(ninjas[2]);
        //Listas
        System.out.println("---------------LISTAS-----------------");
        List <String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        System.out.println(ninjasList);


    }
}
