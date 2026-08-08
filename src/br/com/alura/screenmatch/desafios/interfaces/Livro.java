package br.com.alura.screenmatch.desafios.interfaces;

public class Livro implements Calculavel {

    @Override
    public void calcularPrecoFinal(String tipoPagamento, double preco) {

        if (tipoPagamento.equals("Pix")) {
            double desconto = 5.0 / 100;

            System.out.printf("\nSerá aplicado um desconto de 5%% no valor da compra de R$ %.2f", preco);

            preco -= preco * desconto;

            System.out.printf("\nValor a pagar %.2f — Gerando Pix QR Code", preco);
        }

        if (tipoPagamento.equals("Credito")) {
            double incremento = 5.0 / 100;

            preco += preco * incremento;

            System.out.printf("\nValor a pagar %.2f — cartão de crédito", preco);
        }
    }
}