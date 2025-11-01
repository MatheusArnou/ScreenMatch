public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacoes;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }
    //método com argumentos (valores)
    void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    //método com retorno sem argumento
    double pegaMedia(){
        double resultado = somaAvaliacoes / totalAvaliacoes;
        return resultado;
    }
}
