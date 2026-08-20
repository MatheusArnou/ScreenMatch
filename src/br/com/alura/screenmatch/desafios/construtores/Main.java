package br.com.alura.screenmatch.desafios.construtores;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
            Produto produto1 = new Produto("Notebook", 999.98, 55);
            Produto produto2 = new Produto("Smartphone", 500.10, 1005);
            Produto produto3 = new Produto("Motocycle Eletric", 2000, 3);

            ArrayList<Produto> list = new ArrayList<>();
            list.add(produto1);
            list.add(produto2);
            list.add(produto3);

            System.out.println("Size of list: " + list.size());
            System.out.println(list);

            ProdutoPerecivel p1 = new ProdutoPerecivel("Apple", 1.99, 999, 2025);
            System.out.println(p1.validateDate(2026));

            ProdutoPerecivel p2 = new ProdutoPerecivel("Meat", 28.71, 500, 2027);
            System.out.println(p2.validateDate(2020));

            ProdutoPerecivel p3 = new ProdutoPerecivel("Cand", 0.87, 5000, 2029);
            System.out.println(p3.validateDate(2030));

            ArrayList<ProdutoPerecivel> list1 = new ArrayList<>();
            list1.add(p1);
            list1.add(p2);
            list1.add(p3);

            System.out.println(list1);
        }
}
