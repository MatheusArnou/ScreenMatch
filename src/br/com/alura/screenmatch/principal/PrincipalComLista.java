package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2022);
        outroFilme.avalia(6);
        Filme filmeMatheus = new Filme("Dogville", 2003);
        filmeMatheus.avalia(7);
        Serie serie = new Serie("Lost", 2000);
        serie.setTempodoras(10);
        serie.setEpPorTemp(10);
        serie.setMinPorEp(50);

        ArrayList<Titulo> list = new ArrayList<>();
        list.add(filmeMatheus);
        list.add(meuFilme);
        list.add(outroFilme);
        list.add(serie);

        for (Titulo item : list) {
            System.out.println(item.getNome());
            if (item instanceof Filme f && f.getClassificao() > 3) {
                System.out.println("Classificação: " + f.getClassificao());
            }
        }
    }
}
