package br.com.alura.screenmatch.desafios.interfaces;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{


    @Override
    public void celsiusParaFahrenheit(double c) {
        double resultado = (c*1.8) + 32;
        System.out.printf("Convertendo de Celsius %.2f p/ Fahrenheit %.2f", c,resultado);
    }

    @Override
    public void fahrenheitParaCelsius(double f) {
        double resultado = (f - 32) / 1.8;
        System.out.printf("\nConvertendo de Fahrenheit %.2f p/ Celsius %.2f", f,resultado);
    }
}
