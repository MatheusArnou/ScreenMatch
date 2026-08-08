package br.com.alura.screenmatch.desafios.interfaces;

public class ProdutoFisico implements Calculavel {

    @Override
    public void calcularPrecoFinal(String tipoPagamento, double preco) {

        if (tipoPagamento.equals("Pix")) {
            double comissaoVendedor = 1.5;
            double desconto = 5.0 / 100;

            System.out.printf("Será aplicado um desconto de 5%% no valor da compra de R$ %.2f", preco);

            double result = preco - (preco * desconto) + (preco * (comissaoVendedor / 100));

            System.out.printf("\nValor a pagar %.2f — Gerando Pix QR Code", result);
        }

        if (tipoPagamento.equals("Credito")) {
            double comissaoVendedor = 1.5;
            double incremento = 5.0 / 100;

            double result = preco + (preco * incremento) + (preco * (comissaoVendedor / 100));

            System.out.printf("\nValor a pagar %.2f — cartão de crédito", result);
        }
    }
}