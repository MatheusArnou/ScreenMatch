import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int i = 0;

        while (nota >= 0) {
            System.out.println("Qual sua avaliação do filme?");
            nota = leitura.nextDouble();
            if(nota < 0 ){
                break;
            }
            mediaAvaliacao += nota;
            i++;
        }
        System.out.println("Media de avaliações: " + mediaAvaliacao / i);
    }
}
