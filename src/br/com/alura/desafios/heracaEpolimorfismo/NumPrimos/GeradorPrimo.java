package br.com.alura.desafios.heracaEpolimorfismo.NumPrimos;

public class GeradorPrimo extends NumerosPrimos {

    // Método específico da subclasse
    public int gerarProximoPrimo(int numero) {
        int proximo = numero + 1;
        while (!verificarPrimalidade(proximo)) {
            proximo++;
        }
        return proximo;
    }
}
