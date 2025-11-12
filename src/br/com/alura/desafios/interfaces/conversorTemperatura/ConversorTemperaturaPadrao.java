package br.com.alura.desafios.interfaces.conversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public double celsiusParaFahrenheit(double temperaturaAtualCelsius) {
        return (temperaturaAtualCelsius * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaAtualFahrenheit) {
        return (temperaturaAtualFahrenheit - 32) * (5.0 / 9.0);
    }
}
