import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Poderoso chefão");
        meuFilme.setAnoDelancamento(1970);
        meuFilme.setDuracaoEmMinuto(180);

        meuFilme.exibirFicha();
        meuFilme.avalia(7.7);
        meuFilme.avalia(8);
        meuFilme.avalia(5.75);
        double media = meuFilme.pegaMedia();

        System.out.println("Total de avaliações: " + meuFilme.getTotalAvalicaoes());


        System.out.printf("%.2f", media);

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDelancamento(2000);
        serie.exibirFicha();
        serie.setTempodoras(10);
        serie.setEpPorTemp(10);
        serie.setMinPorEp(50);
        System.out.println("Tempo para maratonar a série: " + serie.getDuracaoEmMinuto()+ "Hr(s)");

    }
}
