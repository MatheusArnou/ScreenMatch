package br.com.alura.desafios.heracaEpolimorfismo;

import br.com.alura.desafios.heracaEpolimorfismo.ContaBancaria.ContaCorrente;
import br.com.alura.desafios.heracaEpolimorfismo.NumPrimos.GeradorPrimo;
import br.com.alura.desafios.heracaEpolimorfismo.NumPrimos.VerificadorPrimo;
import br.com.alura.desafios.heracaEpolimorfismo.animal.Cachorro;
import br.com.alura.desafios.heracaEpolimorfismo.animal.Gato;
import br.com.alura.desafios.heracaEpolimorfismo.carro.ModeloCarro;

public class Principal {
    public static void main(String[] args) {
        // Cria uma instância específica de ModeloCarro
        ModeloCarro civic = new ModeloCarro();
        civic.definirModelo("Honda Civic", 95000, 102000, 99000);

        ModeloCarro corolla = new ModeloCarro();
        corolla.definirModelo("Toyota Corolla", 98000, 103000, 97000);

        // Exibe as informações
        civic.exibirFicha();
        System.out.println("-----------------------------");
        corolla.exibirFicha();
        System.out.println("-----------------------------\n");

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom("Au au");
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom("Miau");
        gato.arranharMoveis();

        System.out.println("-----------------------------\n");
        ContaCorrente conta = new ContaCorrente();

        conta.deposito(500);
        conta.saque(100);
        conta.cobrarTarifaMensal();
        conta.consultarSaldo();

        System.out.println("-----------------------------\n");
        VerificadorPrimo verificador = new VerificadorPrimo();
        GeradorPrimo gerador = new GeradorPrimo();

        verificador.verificarSeEhPrimo(7); // Deve dizer que é primo
        verificador.verificarSeEhPrimo(10); // Deve dizer que não é primo

        gerador.listarPrimos(20); // Usa o método herdado
        System.out.println("O próximo primo após 10 é: " + gerador.gerarProximoPrimo(10));


    }
}
