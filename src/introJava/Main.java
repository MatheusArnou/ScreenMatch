package introJava;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Filme: Top Gun: Maverick");
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = (9.8 + 6.3 + 8.0) / 3;
        int classificacao = (int) notaDoFilme / 2;
        String sinopse;
        sinopse = """
                  Filme Top Gun
                  Filme de aventura com gala dos anos 80
                  nota %.2f
                  Muito bom!
                  Ano de lançamento %d
                """.formatted(notaDoFilme, anoDeLancamento);

        System.out.println("Ano de lançameto: " + anoDeLancamento);
        System.out.println("Nota do filme: " + classificacao);
        System.out.println(sinopse);


    }
}