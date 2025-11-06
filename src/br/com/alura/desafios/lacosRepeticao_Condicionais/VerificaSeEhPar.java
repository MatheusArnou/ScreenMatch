package br.com.alura.desafios.lacosRepeticao_Condicionais;

import java.util.Scanner;

public class VerificaSeEhPar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número:");
        numero = leitor.nextInt();

        if (numero > 0 && numero % 2 == 0){
            System.out.println("Esse numero é par");
        } else {
            System.out.println("Esse número é impar");
        }

    }
}
