package br.com.alura.desafios.heracaEpolimorfismo.ContaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal = 12.50; // Exemplo de tarifa

    // Método específico da Conta Corrente
    public void cobrarTarifaMensal() {
        System.out.println("Cobrando tarifa mensal de R$ " + tarifaMensal);
        saque(tarifaMensal); // reutiliza o método da classe mãe
    }
}