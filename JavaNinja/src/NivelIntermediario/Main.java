package NivelIntermediario;

import NivelBasico.Arrays.Array;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*//Arrays
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
        //Stack
        System.out.println("---------------STACK-----------------");
        Stack <String> ninjasStack = new Stack<>();
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Naruto Uzumaki");
        ninjasStack.push("Sakura Haruno");
        System.out.println("Stack completa: " + ninjasStack);
        ninjasStack.pop();
        System.out.println("Stack com Pop: " + ninjasStack);
        System.out.println("Peek da Stack: " + ninjasStack.peek());

        System.out.println("---------------QUEUE-----------------");
        Queue <String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto Uzumaki");
        ninjasQueue.add("Sasuke Uchiha");
        ninjasQueue.add("Sakura Haruno");
        ninjasQueue.add("Kakashi Uchiha");
        System.out.println("Ninjas na fila: " + ninjasQueue);
        ninjasQueue.poll();
        System.out.println("Fila com Pool: " + ninjasQueue);
        System.out.println("Topo da Fila: " + ninjasQueue.peek());*/

        LinkedList <String> ninjasLinked = new LinkedList<>();
        ninjasLinked.add("Naruto");
        ninjasLinked.add("Sasuke");
        ninjasLinked.add("Sakura");
        ninjasLinked.add(2, "Julião Balestin");
        System.out.println(ninjasLinked);

    }
}
