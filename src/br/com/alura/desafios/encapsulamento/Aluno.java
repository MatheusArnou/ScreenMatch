package br.com.alura.desafios.encapsulamento;

public class Aluno {
    private double notaSoma;
    private String nome;
    private int totalDeAvaliacoes;

    public double getNotaSoma() {
        return notaSoma;
    }

    public void setNotaSoma(double notaSoma) {
        this.notaSoma = notaSoma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public void somadorNotas(double nota){
        this.notaSoma += nota;
        this.totalDeAvaliacoes++;
    }

    public double exibirNota(){
        if (totalDeAvaliacoes == 0) {
            System.out.println("Nenhuma avaliação registrada!");
            return 0;
        }
        return notaSoma / totalDeAvaliacoes;
    }

}
