import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.util.CalcualdoraDeTempo;
import br.com.alura.screenmatch.util.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Poderoso chefão");
        meuFilme.setAnoDelancamento(1970);
        meuFilme.setDuracaoEmMinuto(180);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDelancamento(2022);
        outroFilme.setDuracaoEmMinuto(200);

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
        System.out.println("Tempo para maratonar a série: " + serie.getDuracaoEmMinuto());

        CalcualdoraDeTempo calculadora = new CalcualdoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.printf("Tempo total para os filmes listados: %d minutos%n", calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(serie);
        ep.setTotalAvaliacoes(300);
        filtro.filtra(ep);




    }
}
