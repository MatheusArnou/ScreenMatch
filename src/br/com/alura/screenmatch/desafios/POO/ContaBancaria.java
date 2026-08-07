package br.com.alura.screenmatch.desafios.POO;
/*
* Crie uma classe ContaBancaria com os seguintes atributos:
* numeroConta (privado), saldo (privado) e titular (publico).
* Implemente métodos getters e setters para os atributos privados.
* */
public class ContaBancaria {
    private int numConta;
    private double saldo;
    public String titular;

    public void depositar(double deposito){
        saldo += deposito;
    }
    public void sacar(double saque){
        if(saque <= saldo){
            saldo -= saque;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public double exibirSaldo(){
        return getSaldo();
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
