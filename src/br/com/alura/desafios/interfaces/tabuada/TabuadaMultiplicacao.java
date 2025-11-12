package br.com.alura.desafios.interfaces.tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void tabuada(int n) {
        for (int i = 1; i < 11; i++) {
            int result = n * i;
            System.out.println(n + " * " + i+ " = " + result);
        }
    }
}
