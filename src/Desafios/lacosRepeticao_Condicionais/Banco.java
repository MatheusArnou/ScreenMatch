package Desafios.lacosRepeticao_Condicionais;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        double saldoAtual, valorEntrada, valorSaida;
        saldoAtual = 2500.55;
        valorEntrada = 0;
        valorSaida = 0;
        int op = 0;
        Scanner leitor = new Scanner(System.in);
        String nome = "Matheus Arnou";
        String tipoConta = "Corrente";


        do {
            String textoMenu = """
                    ************************
                    Dados iniciais do cliente:
                    
                    Nome: %s
                    Tipo de conta: %s
                    Saldo R$ %.2f
                    
                    ************************
                    
                    Opções:
                    1. Consultar saldo
                    2. Receber valor
                    3. Transferir
                    4. Sair
                    """.formatted(nome, tipoConta, saldoAtual);
            System.out.println(textoMenu);
            System.out.println("Digite a opção desejava");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n[CONSULTA] Seu saldo atual é de R$ " + saldoAtual);
                    break;

                case 2:
                    System.out.print("\n[RECEBIMENTO] Ok, digite o valor a ser recebido R$: ");
                    valorEntrada = leitor.nextDouble();
                    if (valorEntrada > 0) {
                        saldoAtual += valorEntrada;
                        System.out.println("Recebimento de R$ " + valorEntrada + " realizado. Novo saldo: R$ " + saldoAtual);
                    } else {
                        System.out.println("Valor de recebimento inválido.");
                    }
                    break;

                case 3:
                    System.out.print("\n[TRANSFERÊNCIA] Ok, digite o valor do saque R$: ");
                    valorSaida = leitor.nextDouble();

                    // CORREÇÃO DE VALIDAÇÃO: Verifica ANTES de sacar
                    if (valorSaida > saldoAtual) {
                        System.out.println(">>> Operação inválida: Seu saldo é menor que o valor solicitado! Tente novamente.");
                    } else if (valorSaida < 0) {
                        System.out.println("Valor de saque inválido.");
                    } else {
                        saldoAtual -= valorSaida;
                        System.out.println("Saque de R$ " + valorSaida + " realizado. Novo saldo: R$ " + saldoAtual);
                    }
                    break;

                case 4:
                    System.out.println("\n[SAIR] Ok, encerrando o programa. Obrigado!");
                    break;

                default:
                    System.out.println("\n[ERRO] Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println("\n****************************************\n");

        } while (op != 4); // Repete até a opção ser igual a 4.
    }
}
