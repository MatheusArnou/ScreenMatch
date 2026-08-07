package br.com.alura.screenmatch.desafios.HeranEPoli;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double precoA;
    private double precoB;
    private double precoC;

    public void tipoDeCarro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    ;

    public void pegaPreco(double A, double B, double C) {
         precoA = A;
         precoB = B;
         precoC = C;
    }

    ;

    public void exibirFicha() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço de tabela há 1 ano atrás: " + precoA);
        System.out.println("Preço de tabela há 3 ano atrás: " + precoB);
        System.out.println("Preço de tabela há 5 ano atrás: " + precoC);
        System.out.println("Maior preço: " + calcularMaiorPreco());
        System.out.println("Menor preço: " + calcularMenorPreco());
    }

    private double calcularMenorPreco() {
        double menorPreco = precoA;

        if (menorPreco > precoB) {
            menorPreco = precoB;
        }

        if (menorPreco > precoC) {
            menorPreco = precoC;
        }

        return menorPreco;
    }

    private double calcularMaiorPreco() {
        double maiorPreco = precoA;

        if (maiorPreco < precoB) {
            maiorPreco = precoB;
        }

        if (maiorPreco < precoC) {
            maiorPreco = precoC;
        }

        return maiorPreco;
    }


}
