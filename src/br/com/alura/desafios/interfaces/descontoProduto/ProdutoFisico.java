package br.com.alura.desafios.interfaces.descontoProduto;

public class ProdutoFisico implements Calculavel{
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        double acrescimo;
        if (getPreco() > 100 && getPreco() < 500){
            acrescimo = getPreco() +  (getPreco() * 0.20);
        } else if(getPreco() > 1000){
            acrescimo = getPreco() +  (getPreco() * 0.15);
        } else {
            acrescimo = getPreco() +  (getPreco() * 0.10);
        }

        return acrescimo;
    }
}
