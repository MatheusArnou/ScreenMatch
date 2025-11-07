package br.com.alura.desafios.heracaEpolimorfismo.NumPrimos;

public class NumerosPrimos {
    // Método que verifica se um número é primo
    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Método que lista todos os números primos até um limite
    public void listarPrimos(int limite) {
        System.out.println("Primos até " + limite + ":");
        for (int i = 2; i <= limite; i++) {
            if (verificarPrimalidade(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
