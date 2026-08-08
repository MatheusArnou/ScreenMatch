package br.com.alura.screenmatch.desafios.interfaces;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void calcularTabuada(int valor) {
        for (int i = 1; i < 11; i++) {
            int resultado = valor*i;
            System.out.println(valor + " X " + i + "= " + resultado);

        }
    }
}
