package NivelIntermediario;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Adicionando os Ninjas na LinkedList
        LinkedList<Ninja> ninjasLinkedList = new LinkedList<>();
        ninjasLinkedList.add(new Ninja("Naruto Uzumaki", 19, "Aldeia da Folha"));
        ninjasLinkedList.add(new Ninja("Sasuke Uchiha", 17, "Aldeia da Folha"));
        ninjasLinkedList.add(new Ninja("Sakura Haruno", 18, "Aldeia da Folha"));
        ninjasLinkedList.add(new Ninja("Itachi Uchiha", 21, "Aldeia da Folha"));
        ninjasLinkedList.add(new Ninja("Hinata Hyuga", 17, "Aldeia da Folha"));
        ninjasLinkedList.add(new Ninja("Kakashi Hatake", 48, "Aldeia da Folha"));
        ninjasLinkedList.add(new Ninja("Gaara", 24, "Aldeia da Areia"));

        //Printando os Ninjas
        System.out.println("---------------Listas de Ninjas---------------");
        for (int i = 0; i < ninjasLinkedList.size() ; i++) {
            System.out.println(ninjasLinkedList.get(i));
        }
        System.out.println(" ");

        //Adicionando Ninja no index 0
        System.out.println("---------------Listas de Ninjas Atualizada---------------");
        ninjasLinkedList.push(new Ninja("Boruto Uzumaki", 9, "Aldeia da Folha"));
        for (int i = 0; i < ninjasLinkedList.size() ; i++) {
            System.out.println(ninjasLinkedList.get(i));
        }
        System.out.println(" ");

        //Removendo o Ninja no index 0
        System.out.println("---------------Listas de Ninjas Atualizada---------------");
        ninjasLinkedList.pop();
        for (int i = 0; i < ninjasLinkedList.size() ; i++) {
            System.out.println(ninjasLinkedList.get(i));
        }
        System.out.println(" ");

        //Pegando um ninja pelo indice
        System.out.println("---------------Listas de Ninjas por Indice---------------");
        System.out.println(ninjasLinkedList.get(2));
        System.out.println(" ");
    }
}
