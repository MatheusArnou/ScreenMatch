package br.com.alura.desafios.interfaces.conversorMoeda;

public class ConversorMoeda implements ConversãoFinanceira {
    private double valorReal;
    private double valorDolar;

    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    @Override
    public double converterDolarParaReal(double valorConverter) {
        setValorDolar(valorConverter);
        double cambio = 5.27;
        setValorReal(getValorDolar() * cambio);
        return getValorReal();
    }
}
