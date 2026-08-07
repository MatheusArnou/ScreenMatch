package br.com.alura.screenmatch.desafios.HeranEPoli;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public void sacar(double saque) {
        if (saque > getSaldo()) {
            System.out.println("Saque não permitido");
        } else {
            saldo -= saque;

        }
    }
    public void consultarSaldo(){
        System.out.println("Saldo atual: " + getSaldo());

    }
}
