package introJava;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int cont = 0;

        while (nota != -1) {
            System.out.println("Avalie o seu filme ou -1 para sair: ");
            nota = leitor.nextInt();

            if (nota != -1) {
                media += nota;
                cont++;
            }
        }
        media /= cont;
        System.out.printf("Avaliação do filme %.2f", media);
    }
}
