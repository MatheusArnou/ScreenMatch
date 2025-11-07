package br.com.alura.desafios.heracaEpolimorfismo.NumPrimos;

public class VerificadorPrimo extends NumerosPrimos {
    // Método específico da subclasse
    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é primo!");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
