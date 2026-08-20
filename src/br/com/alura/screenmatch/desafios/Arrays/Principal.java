package br.com.alura.screenmatch.desafios.Arrays;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var p1 = new Pessoa();
        var p2 = new Pessoa();
        var p3 = new Pessoa();

        p1.pegaDados("Matheus", 29);
        p2.pegaDados("Juliana", 28);
        p3.pegaDados("Maju", 10);


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.getFirst());
        System.out.println("Lista completa: ");
        System.out.println(listaDePessoas);


    }
}
