package NivelIntermediario.DesafioIntermediario.Desafio6;

import NivelIntermediario.Ninja;

import java.util.LinkedList;

public class MainDesafio {
    public static void main(String[] args) {

        //Adicionando os Ninjas na LinkedList
        LinkedList<NinjaDesafio> ninjasLinkedList = new LinkedList<>();
        ninjasLinkedList.add(new NinjaDesafio("Naruto Uzumaki", 19, "Aldeia da Folha"));
        ninjasLinkedList.add(new NinjaDesafio("Sasuke Uchiha", 17, "Aldeia da Folha"));
        ninjasLinkedList.add(new NinjaDesafio("Sakura Haruno", 18, "Aldeia da Folha"));
        ninjasLinkedList.add(new NinjaDesafio("Itachi Uchiha", 21, "Aldeia da Folha"));
        ninjasLinkedList.add(new NinjaDesafio("Hinata Hyuga", 17, "Aldeia da Folha"));
        ninjasLinkedList.add(new NinjaDesafio("Kakashi Hatake", 48, "Aldeia da Folha"));
        ninjasLinkedList.add(new NinjaDesafio("Gaara", 24, "Aldeia da Areia"));

        //Printando os Ninjas
        System.out.println("---------------Listas de Ninjas---------------");
        for (int i = 0; i < ninjasLinkedList.size() ; i++) {
            System.out.println(ninjasLinkedList.get(i));
        }
        System.out.println(" ");

        //Adicionando Ninja no index 0
        System.out.println("---------------Listas de Ninjas Atualizada---------------");
        ninjasLinkedList.push(new NinjaDesafio("Boruto Uzumaki", 9, "Aldeia da Folha"));
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
