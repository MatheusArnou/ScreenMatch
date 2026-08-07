package br.com.alura.screenmatch.util;

import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

public class CalcualdoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    //    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinuto();
//
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinuto();
//    }
    public void inclui(Titulo t) {
        tempoTotal += t.getDuracaoEmMinuto();
    }
}
