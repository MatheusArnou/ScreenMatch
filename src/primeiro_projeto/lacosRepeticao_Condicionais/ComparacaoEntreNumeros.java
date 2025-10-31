package primeiro_projeto.lacosRepeticao_Condicionais;

import java.util.Scanner;

public class ComparacaoEntreNumeros {
    public static void main(String[] args) {
        int numA, numB;
        numA = 0;
        numB = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu primeiro número: ");
        numA = leitor.nextInt();
        System.out.println("Digite o seu segundo número: ");
        numB = leitor.nextInt();

        if(numA != numB){
            System.out.println("Esse números são diferentes");
            if (numA > numB){
                System.out.println("O primeiro número é maior que o segundo!");
            } else {
                System.out.println("O segundo número é maior que o primeiro!");
            }
        } else {
            System.out.println("Os dois numeros são iguais!");
        }
    }
}
