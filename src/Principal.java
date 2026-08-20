import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.util.CalcualdoraDeTempo;
import br.com.alura.screenmatch.util.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso chefão");
        meuFilme.setAnoDelancamento(1970);
        meuFilme.setDuracaoEmMinuto(180);

        Filme outroFilme = new Filme("Avatar");
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

        Filme filmeMatheus = new Filme("Dogville");
        // ou var filmeMatheus = new Filme(); -> Inferência, não podemos trocar o tipo de dado Ex: filmeMatheus = 10;


        System.out.println("");
        filmeMatheus.setDuracaoEmMinuto(200);
        filmeMatheus.setAnoDelancamento(2003);
        filmeMatheus.avalia(10);
        filmeMatheus.avalia(9);
        filmeMatheus.avalia(6);
        filmeMatheus.avalia(5);
        filmeMatheus.exibirFicha();
        double novaMed = filmeMatheus.pegaMedia();
        System.out.printf("Avaliação: %.2f", novaMed);
        System.out.println();

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeMatheus);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());

        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Ano: " + listaDeFilmes.get(0).getAnoDelancamento());
        System.out.println("Duração: " + listaDeFilmes.get(0).getDuracaoEmMinuto());
        System.out.println("Classe: " + listaDeFilmes.get(0).getClass());
        //ou getFirst(), getLast() e getClass()

        System.out.println(listaDeFilmes);
    }
}
