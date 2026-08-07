package br.com.alura.screenmatch.desafios;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Matheus");
        conta.depositar(1000);
        conta.depositar(500);
        conta.depositar(200);
        //double saldo = conta.exibirSaldo(); teste
        conta.sacar(1500);
        System.out.println("Titular da conta: " + conta.getTitular());
        //System.out.printf("Saldo %.2f", saldo) teste
        System.out.printf("Saldo %.2f", conta.exibirSaldo());
    }
}
