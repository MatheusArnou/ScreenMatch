package br.com.alura.screenmatch.desafios.aplicandoPoo;

public class Main {
    public static void main(String[] args) {

        // --- TESTANDO A CLASSE MUSICA ---
        System.out.println("=== TESTANDO MÚSICA ===");
        Musica minhaMusica = new Musica();
        minhaMusica.setAutor("Coldplay");
        minhaMusica.setAlbum("A Head Full of Dreams");
        minhaMusica.setDuracao(263); // segundos

        // Simulando reproduções
        minhaMusica.reproduzir();
        minhaMusica.reproduzir();
        minhaMusica.reproduzir();

        // Simulando curtidas (Interface Curtivel)
        minhaMusica.curtir();
        minhaMusica.curtir();

        // Simulando avaliações (Interface Avaliavel)
        minhaMusica.avaliar(10);
        minhaMusica.avaliar(8.5);
        minhaMusica.avaliar(9.0);

        // Exibindo resultados da música
        System.out.println("Total de reproduções da música: " + minhaMusica.getReproducoes());
        System.out.println("Total de curtidas da música: " + minhaMusica.getCurtidas());
        System.out.println("Média de avaliações da música: " + minhaMusica.getMediaAvaliacoes());

        System.out.println("\n--------------------------------------------------\n");

        // --- TESTANDO A CLASSE PODCAST ---
        System.out.println("=== TESTANDO PODCAST ===");
        Podcast meuPodcast = new Podcast();
        meuPodcast.setAutor("Podpah");
        meuPodcast.setAssunto("Entrevista com Desenvolvedor Java");
        meuPodcast.setDuracao(5400); // segundos

        // Simulando reproduções
        meuPodcast.reproduzir();
        meuPodcast.reproduzir();

        // Simulando curtidas (Interface Curtivel)
        meuPodcast.curtir();

        // Simulando avaliações (Interface Avaliavel)
        meuPodcast.avaliar(10);
        meuPodcast.avaliar(10);

        // Exibindo resultados do podcast
        System.out.println("Total de reproduções do podcast: " + meuPodcast.getReproducoes());
        System.out.println("Total de curtidas do podcast: " + meuPodcast.getCurtidas());
        System.out.println("Média de avaliações do podcast: " + meuPodcast.getMediaAvaliacoes());
    }
}
