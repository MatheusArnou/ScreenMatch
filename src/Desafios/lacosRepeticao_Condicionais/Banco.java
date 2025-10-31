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
                """.formatted(nome,tipoConta,saldoAtual);

        do{
        System.out.println(textoMenu);
        System.out.println("Digite a opção desejava");
        op = leitor.nextInt();

            if(op == 1){
                System.out.println("Saldo atual é de R$ " + saldoAtual);
            }
            if (op == 2){
                System.out.println("Ok, digite o valor a ser recebido R$: ");
                valorEntrada = leitor.nextDouble();
                saldoAtual += valorEntrada;

            }
            if(op == 3){
                System.out.println("Ok, digite o valor do saque R$: ");
                valorSaida = leitor.nextDouble();
                saldoAtual -= valorSaida;
                if(valorEntrada > saldoAtual){
                    System.out.println("Operação invalida: Seu saldo é menor que o saque! Tente novamente!");
                }
            }
            if(op == 4){
                System.out.println("Ok encerrando");
                break;
            }
            if(op > 5 || op < 1){
                System.out.println("Opção invalida estou encerrando por segurança");
                break;
            }

        } while (op < 5);



    }
}
