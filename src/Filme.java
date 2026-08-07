public class Filme {
    String nome;
    int anoDelancamento;
    boolean incluidoNoPlano;
    double somaAvaliacoes;
    int totalAvalicaoes;
    int duracaoEmMinuto;

    void exibirFicha() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDelancamento);
    }

    void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvalicaoes++;
    }

    double pegaMedia() {
        return somaAvaliacoes / totalAvalicaoes;
    }
}
