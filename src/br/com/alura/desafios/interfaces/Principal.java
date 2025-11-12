package br.com.alura.desafios.interfaces;


import br.com.alura.desafios.interfaces.calculoFigurasGeometricas.CalculadoraSalaRetangular;
import br.com.alura.desafios.interfaces.conversorMoeda.ConversorMoeda;
import br.com.alura.desafios.interfaces.conversorTemperatura.ConversorTemperaturaPadrao;
import br.com.alura.desafios.interfaces.desconto.Produto;
import br.com.alura.desafios.interfaces.descontoProduto.Livro;
import br.com.alura.desafios.interfaces.descontoProduto.ProdutoFisico;
import br.com.alura.desafios.interfaces.tabuada.TabuadaMultiplicacao;

public class Principal {
    public static void main(String[] args) {
        ConversorMoeda converter = new ConversorMoeda();
        converter.converterDolarParaReal(100);
        System.out.println(converter.getValorReal());
        System.out.println("\n");
        CalculadoraSalaRetangular calcular = new CalculadoraSalaRetangular();
        calcular.calcularArea(5.15, 10.78);
        calcular.calcularPerimetro(12, 24);
        System.out.println("\n");
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.tabuada(5);

        System.out.println("\n");

        ConversorTemperaturaPadrao conversorTemp = new ConversorTemperaturaPadrao();
        System.out.println("Celsius p/ Fahrenheit " + conversorTemp.celsiusParaFahrenheit(26));
        System.out.println("Fahrenheit p/ Celsius " + conversorTemp.fahrenheitParaCelsius(150));

        System.out.println("\n");
        Livro livro = new Livro();
        ProdutoFisico produtoFisico = new ProdutoFisico();

        livro.setPreco(124.59);
        produtoFisico.setPreco(447.89);
        System.out.println("Valor do seu livro R$ " + livro.calcularPrecoFinal());
        System.out.println("Valor do seu produto na loja R$ " + produtoFisico.calcularPrecoFinal());

        System.out.println("\n");

        // --- PRODUTO (Cadeira) ---
        Produto p = new Produto();
        p.setNomeProduto("Cadeira");
        p.setPreco(100.0);
        int quantidadeProduto = 6;

        System.out.println("--- PRODUTO: " + p.getNomeProduto() + " (R$ " + String.format("%.2f", p.getPreco()) + " unitário) ---");

        // 1. Preço Total Original
        System.out.println("Preço total original (" + quantidadeProduto + " unidades): R$ " + String.format("%.2f", p.precoFinal(quantidadeProduto)));

        // 2. Aplicar Desconto (Passando a quantidade)
        p.aplicarDesconto(2.0, quantidadeProduto); // 2% de desconto no total (R$ 600,00) = R$ 12,00

        // 3. Preço Total Final (Recalculado com o novo preço unitário)
        System.out.println("Preço total final (R$ " + String.format("%.2f", p.getPreco()) + " unitário): R$ " + String.format("%.2f", p.precoFinal(quantidadeProduto)));




    }


}
