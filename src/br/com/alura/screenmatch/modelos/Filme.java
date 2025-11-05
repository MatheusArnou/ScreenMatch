package br.com.alura.screenmatch.modelos;

public class Filme {
    public String nome;
    public int anoLancamento;
    public boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    public int duracaoEmMinutos;

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    //método com argumentos (valores)
    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    //método com retorno sem argumento
     public double pegaMedia() {
        double resultado = somaAvaliacoes / totalAvaliacoes;
        return resultado;
    }

    //método acessor
    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }
}
