package br.com.alura.desafios.heracaEpolimorfismo.ContaBancaria;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    // setter privado, pois só os métodos internos devem alterar o saldo
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para depositar dinheiro
    public void deposito(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Operação inválida! Valor do depósito deve ser positivo.");
        }
    }

    // Método para sacar dinheiro
    public void saque(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Operação não autorizada. Saldo insuficiente!");
        } else if (valor <= 0) {
            System.out.println("Operação inválida! Valor de saque deve ser positivo.");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");

        }
    }

    // Método para consultar o saldo
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + getSaldo());
    }
}
