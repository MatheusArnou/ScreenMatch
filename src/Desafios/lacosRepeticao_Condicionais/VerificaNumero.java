    package Desafios.lacosRepeticao_Condicionais;

    import java.util.Scanner;

    public class VerificaNumero {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            int numero = 0;

            System.out.println("Digite um numero qualquer positivo ou negativo: ");
            numero = leitura.nextInt();

            if(numero > 0){
                System.out.println("Esse número é possitivo");
            } else if (numero == 0){
                System.out.println("Esse número é o zero");
            } else {
                System.out.println("Esse número é negativo");
            }

        }
    }
