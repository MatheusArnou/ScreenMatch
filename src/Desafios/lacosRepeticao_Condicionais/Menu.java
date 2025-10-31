package Desafios.lacosRepeticao_Condicionais;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int op = 0;
        Scanner leitor = new Scanner(System.in);

        double area, lado, raio;

        final double PI = Math.PI;

        String texto = """
                --- Bem vindo ---
                Escolha uma das opções abaixo:
                1. Calcular área do quadrado
                2. Calcular área do circulo
                3. Sair
                """;

        System.out.println(texto);

        // Tentativa de ler a opção
        if (leitor.hasNextInt()) {
            op = leitor.nextInt();
        } else {
            System.out.println("Entrada inválida. Encerrando.");
            return; // Encerra o método main
        }

        switch (op){
            case 1:
                System.out.print("Digite o valor de um dos lados do quadrado: ");
                lado = leitor.nextDouble();
                area = lado * lado;


                String areaQuadrado = """
                        Para calcular a área de um quadrado, multiplicamos o seu lado por ele mesmo (L x L).
                        O valor fornecido foi de %.2f, e sua área corresponde a %.2f
                        """.formatted(lado, area);

                System.out.println(areaQuadrado);
                break;

            case 2:
                System.out.print("Digite o valor do raio do circulo: ");
                raio = leitor.nextDouble();
                area = PI * (raio * raio);

                String areaCirculo = """
                        Para calcular a área de um círculo (π * r²), utilizamos o valor do raio (%.2f).
                        O valor de PI utilizado foi de %.4f (Math.PI).
                        A área corresponde a %.2f
                        """.formatted(raio, PI, area);

                System.out.println(areaCirculo);
                break;

            case 3:
                System.out.println("Programa encerrado com sucesso.");
                break;

            default:
                System.out.println("Opção inválida. Nenhuma ação realizada.");
                break;
        }

    }
}