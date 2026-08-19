package br.com.alura.screenmatch.desafios.aplicandoPoo;

public class Audio {
    private String autor;
    private int duracao;
    private int reproducoes;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public void reproduzir() {
        this.reproducoes++;
        System.out.println("Tocando agora o áudio de: " + this.autor);
    }
}
