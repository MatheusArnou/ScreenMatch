package br.com.alura.screenmatch.desafios.interfaces;


public class Produto implements Vendavel {

    private String nome;
    private double precoUnitario = 100;

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto / 100.0);
    }
}