package primeiro_projeto.lacosRepeticao_Condicionais;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número qualquer e vamos fazer a sua tabuada: ");
        int numero = leitor.nextInt();

        System.out.println("=== Fazendo com o laço FOR ===");
        for (int i = 1; i <= 10; i++) {
            int result = numero * i;

            System.out.println(numero + " x " + i + " = " + result);
        }

        System.out.println("\n=== Fazendo com While ===");
        int contador = 1;
        while (contador <= 10){
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);

            contador++;
        }

    }

}
