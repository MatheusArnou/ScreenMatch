public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDelancamento = 1970;
        meuFilme.duracaoEmMinuto = 180;

        meuFilme.exibirFicha();
        meuFilme.avalia(7.7);
        meuFilme.avalia(8);
        meuFilme.avalia(5.75);
        double media = meuFilme.pegaMedia();

        System.out.println("Total de avaliações: " + meuFilme.getTotalAvalicaoes());


        System.out.printf("%.2f",media);

    }
}
