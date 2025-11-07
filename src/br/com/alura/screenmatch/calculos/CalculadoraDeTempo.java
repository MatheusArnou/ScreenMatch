package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void filmesFavoritos(Filme f) {
//            tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void filmesFavoritos(Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }
    public void inclui(Titulo t){
        System.out.println("Titulo: " + t);
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
