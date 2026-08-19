package br.com.alura.screenmatch.desafios.aplicandoPoo;

public class Musica extends Audio implements Curtivel, Avaliavel {
    private String album;
    private int curtidas;
    private double somaDasNotas;
    private int totalDeAvaliacoes;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    // Implementação da interface Curtivel
    @Override
    public void curtir() {
        this.curtidas++;
        System.out.println("Você curtiu a música do álbum " + this.album);
    }

    @Override
    public int getCurtidas() {
        return this.curtidas;
    }

    // Implementação da interface Avaliavel
    @Override
    public void avaliar(double nota) {
        this.somaDasNotas += nota;
        this.totalDeAvaliacoes++;
    }

    @Override
    public double getMediaAvaliacoes() {
        if (totalDeAvaliacoes == 0) {
            return 0;
        }
        return this.somaDasNotas / this.totalDeAvaliacoes;
    }
}
