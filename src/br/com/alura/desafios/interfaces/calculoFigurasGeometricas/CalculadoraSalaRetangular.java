package br.com.alura.desafios.interfaces.calculoFigurasGeometricas;

import br.com.alura.desafios.interfaces.conversorMoeda.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("Aqui a área do seu retângulo: " + area);

    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = altura + largura;
        System.out.println("Aqui o perímetro do seu retangulo: " + perimetro);
    }
}
