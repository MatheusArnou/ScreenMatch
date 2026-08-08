package br.com.alura.screenmatch.util;

import br.com.alura.screenmatch.model.Titulo;

public class FiltroRecomendacao {
    public void filtra(Classificavel c){
        if(c.getClassificao() >= 4){
            System.out.println("Está entre os preferidos da galera!");
        } else if (c.getClassificao() >= 2){
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Coloque na sua lista para ver depois");
        }

    }

}
