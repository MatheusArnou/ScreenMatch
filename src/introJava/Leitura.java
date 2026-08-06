package introJava;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu filme favorito: ");
        String filme = leitor.nextLine();
        System.out.println("Qual o ano de lançamento");
        int anoDeLancamento = leitor.nextInt();
        System.out.println("Avalie o filme: ");
        double avaliacao = leitor.nextDouble();
    }
}
