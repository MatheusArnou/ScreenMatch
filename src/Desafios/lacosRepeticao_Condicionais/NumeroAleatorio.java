package Desafios.lacosRepeticao_Condicionais;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int MAX_TENTATIVAS = 5;
        int tentativasRealizadas = 0;
        int chute = 0;
        //System.out.println(numeroAleatorio);

        System.out.println("🎉 Bem-vindo ao Jogo de Adivinhação! 🎉");
        System.out.println("Tente adivinhar o número entre 0 e 99 em até " + MAX_TENTATIVAS + " tentativas.");
        System.out.println("----------------------------------------");


        while (tentativasRealizadas < MAX_TENTATIVAS) {
            System.out.print("Tentativa #" + (tentativasRealizadas + 1) + ". Digite o seu número: ");
            chute = leitor.nextInt();
            tentativasRealizadas++;

            if (chute == numeroAleatorio) {
                System.out.println("\n*** PARABÉNS! Você acertou o número " + numeroAleatorio +
                        " em " + tentativasRealizadas + " tentativa(s)! ***");
                break;
            } else if (chute < numeroAleatorio) {
                System.out.println("➡️ O número sorteado é MAIOR do que " + chute + ".");
            } else {
                System.out.println("⬅️ O número sorteado é MENOR do que " + chute + ".");
            }
            int tentativasRestantes = MAX_TENTATIVAS - tentativasRealizadas;
            if (tentativasRestantes > 0) {
                System.out.println("Você ainda tem " + tentativasRestantes + " tentativa(s) restante(s).");
            }
            System.out.println("----------------------------------------");
        }
        if (tentativasRealizadas == MAX_TENTATIVAS && chute != numeroAleatorio) {
            System.out.println("\n❌ Fim de jogo. Você não conseguiu acertar o número em " + MAX_TENTATIVAS + " tentativas.");
            System.out.println("O número secreto era: " + numeroAleatorio);
        }
    }
}