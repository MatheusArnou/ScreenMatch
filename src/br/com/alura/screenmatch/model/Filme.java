package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.util.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getClassificao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + ", ano de lançamento " + this.getAnoDelancamento();
    }

    public Filme(String nome){
        this.setNome(nome);
    }
}
