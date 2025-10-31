package Desafios.lacosRepeticao_Condicionais;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        System.out.println("--- Sequência das Contas ---");
        System.out.println("Valor inicial do Fatorial: " + fatorial);

        for (int i = 1; i <= numero; i++) {
            int fatorialAnterior = fatorial;

            fatorial *= i;


            System.out.println("Passo " + i + ": " + fatorialAnterior + " * " + i + " = " + fatorial);
        }

        System.out.println("----------------------------");
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        // scanner.close();
    }
}