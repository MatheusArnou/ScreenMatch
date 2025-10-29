public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        //System.out.println("Filme: Tog Gun: Maverick");

        int anoDeLancamento = 2022;
        //System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaAvaliacao = 8.1;

        double media = (9.8+6.3+8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme: Tog Gun: Maverick
                Filme de ação com galã dos anos 80
                Muito Bom!!!
                Ano de lançamento 
                """ + anoDeLancamento;
        System.out.println(sinopse);

    }
}