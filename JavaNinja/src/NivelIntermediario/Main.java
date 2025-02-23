package NivelIntermediario;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {



        //Adicionando os Ninjas
        Ninja ninjaNaruto = new Ninja("Naruto Uzumaki", 19, "Aldeia da Folha");
        Ninja ninjaSasuke = new Ninja("Sasuke Uchiha", 17, "Aldeia da Folha");
        Ninja ninjaSakura = new Ninja("Sakura Haruno", 18, "Aldeia da Folha");
        Ninja ninjaItachi = new Ninja("Itachi Uchiha", 21, "Aldeia da Folha");
        Ninja ninjaHinata = new Ninja("Hinata Hyuga", 17, "Aldeia da Folha");
        Ninja ninjaKakashi = new Ninja("Kakashi Hatake", 48, "Aldeia da Folha");
        Ninja ninjaGaara = new Ninja("Gaara", 24, "Aldeia da Areia");
        Ninja ninjaBoruto = new Ninja("Boruto", 9, "Aldeia da Areia");

        //Adicionando os Ninjas na LinkedList
        LinkedList<Ninja> ninjasLinkedList = new LinkedList<>();
        ninjasLinkedList.add(ninjaNaruto);
        ninjasLinkedList.add(ninjaSasuke);
        ninjasLinkedList.add(ninjaSakura);
        ninjasLinkedList.add(ninjaItachi);
        ninjasLinkedList.add(ninjaHinata);
        ninjasLinkedList.add(ninjaKakashi);
        ninjasLinkedList.add(ninjaGaara);


        System.out.println("---------------Listas de Ninjas---------------");

        System.out.println(ninjasLinkedList.size());
        for (int i = 0; i < ninjasLinkedList.size() ; i++) {
            System.out.println(ninjasLinkedList.peek());
            ninjasLinkedList.pop();
        }


    }
}
