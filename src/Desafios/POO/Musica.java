package Desafios.POO;

public class Musica {
    public String titulo;
    public String artista;
    public int anoLancamento;
    public double avaliacao;
    public int numAvaliacoes;

    public void exibirFicha() {
        System.out.println("Nome do artista: " + artista);
        System.out.println("Música: " + titulo);
        System.out.println("Lançado em: " + anoLancamento);

    }

    public void avalia(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    public double notaFinal (){
        double result = avaliacao / numAvaliacoes;
        return result;
    }

}
