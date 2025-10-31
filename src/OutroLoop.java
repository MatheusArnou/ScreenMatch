import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int i = 0;

        while (nota != -1) {
            System.out.println("Qual sua avaliação do filme?");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
            i++;
        }
        System.out.println("Media de avaliações: " + mediaAvaliacao / i);
    }
}
