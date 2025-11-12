package br.com.alura.desafios.interfaces.descontoProduto;

public class Livro implements Calculavel{
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        double desconto = 0;
        if(getPreco() > 100){
            desconto = getPreco() - (getPreco()* 0.10);
        } else {
            desconto = getPreco() - (getPreco()* 0.02);
        }
        return desconto;
    }
}
