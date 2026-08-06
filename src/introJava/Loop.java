package introJava;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int cont = 0;

        for (int i = 0; i < 3; i++) {
            cont++;
            System.out.println("Avalie o filme: ");
            nota = leitor.nextDouble();
            media += nota;
            //System.out.println(media);
            //System.out.println(cont);
        }
        media /= cont;
        System.out.printf("Avaliaçao do filme %.2f", media);

    }
}
