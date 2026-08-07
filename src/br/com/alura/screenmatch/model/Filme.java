package br.com.alura.screenmatch.model;

public class Filme {
    private String nome;
    private int anoDelancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvalicaoes;
    private int duracaoEmMinuto;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIncluidoNoPlano(boolean ehDoPlano){
        incluidoNoPlano = ehDoPlano;
    }
    public void setAnoDelancamento(int anoDelancamento){
        this.anoDelancamento = anoDelancamento;
    }
    public void setSomaAvaliacoes(double somaAvaliacoes){
        this.somaAvaliacoes = somaAvaliacoes;
    }
    public void setTotalAvalicaoes(int total){
        totalAvalicaoes = total;
    }

    public void setDuracaoEmMinuto(int duracaoEmMinuto) {
        this.duracaoEmMinuto = duracaoEmMinuto;
    }

    public int getTotalAvalicaoes(){
        return totalAvalicaoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDelancamento() {
        return anoDelancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public int getDuracaoEmMinuto() {
        return duracaoEmMinuto;
    }

    public void exibirFicha() {
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDelancamento());
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvalicaoes++;
    }

    public double pegaMedia() {
        return somaAvaliacoes / totalAvalicaoes;
    }
}
