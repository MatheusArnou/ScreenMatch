package br.com.alura.screenmatch.desafios.aplicandoPoo;

public class Podcast extends Audio implements Curtivel, Avaliavel {
    private String assunto;
    private int curtidas;
    private double somaDasNotas;
    private int totalDeAvaliacoes;

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    // Implementação da interface Curtivel
    @Override
    public void curtir() {
        this.curtidas++;
        System.out.println("Você curtiu o podcast sobre: " + this.assunto);
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
