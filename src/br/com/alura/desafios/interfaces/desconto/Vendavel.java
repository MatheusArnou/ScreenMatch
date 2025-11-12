package br.com.alura.desafios.interfaces.desconto;

public interface Vendavel {
    double precoFinal(int quantidade);
    void aplicarDesconto(double desconto, int quantidade);

}
