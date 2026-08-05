//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
        //System.out.println("\n");

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = (9.8+6.3+8.0) / 3;
        String sinopse;
        sinopse = """
                  Filme Top Gun
                  Filme de aventura com gala dos anos 80
                  Muito bom!
                  Ano de lançamento
                """ + anoDeLancamento;


        System.out.println("\n");
        System.out.println("Ano de lançameto: " + anoDeLancamento);
        System.out.println("Nota do filme: " + notaDoFilme);
        System.out.println(sinopse);


    }
}