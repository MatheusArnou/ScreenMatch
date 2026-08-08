package br.com.alura.screenmatch.desafios.interfaces;



public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(50);

        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();

        sala.calcularArea(5,3);

        System.out.println("Area de minha sala: "+ sala.calcularArea(5,3));
        System.out.println("Area de minha perímetro: "+ sala.calcularPerimetro(5,3));

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.calcularTabuada(7);

        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();
        temperatura.celsiusParaFahrenheit(18);
        temperatura.fahrenheitParaCelsius(18);

        Livro livro = new Livro();
        ProdutoFisico produto = new ProdutoFisico();
        livro.calcularPrecoFinal("Pix",100);
        produto.calcularPrecoFinal("Credito",100);
        Produto p = new Produto();
        Servico s = new Servico();

        System.out.println(p.calcularPrecoTotal(10));

        p.aplicarDesconto(3.23);

        System.out.println(p.calcularPrecoTotal(10));

        System.out.println(s.calcularPrecoTotal(25));

        s.aplicarDesconto(1.39);

        System.out.println(s.calcularPrecoTotal(25));



    }
}
