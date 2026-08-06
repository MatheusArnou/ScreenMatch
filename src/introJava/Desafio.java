package introJava;/*
 * Desenvolver uma aplicação que simula uma aplicação bancária.
 *
 * Saldo inicial: R$ 2500,00
 *
 * Operações:
 * 1 - Fazer um saque
 * 2 - Fazer um depósito
 * 3 - Sair
 *
 * Só posso sacar se o saldo for maior ou igual ao valor do saque.
 */

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int op = 0;
        double saldo = 2500;
        double saque = 0;

        System.out.println("* *************************** *");
        System.out.println("       Bem-vindo ao BankeX");
        System.out.println("           Olá, Matheus!");
        System.out.println("     Seu saldo atual: R$ " + saldo);
        System.out.println("* *************************** *");

        while (op != 3) {

            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Fazer um saque");
            System.out.println("2 - Fazer um depósito");
            System.out.println("3 - Sair");

            op = scanner.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Digite o valor do saque: R$ ");
                    saque = scanner.nextDouble();

                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                        System.out.println("Seu saldo é de R$ " + saldo);
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado!");
                        System.out.println("Novo saldo: R$ " + saldo);
                    }
                    break;

                case 2:
                    System.out.println("Digite o valor do depósito: R$ ");

                    saldo += scanner.nextDouble();

                    System.out.println("Depósito realizado!");
                    System.out.println("Novo saldo: R$ " + saldo);
                    break;

                case 3:
                    System.out.println("Operação finalizada.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}