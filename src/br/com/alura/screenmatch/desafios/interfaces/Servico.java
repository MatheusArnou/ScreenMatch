package br.com.alura.screenmatch.desafios.interfaces;

public class Servico implements Vendavel {

    private String descricao;
    private double precoHora = 50;

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }
}