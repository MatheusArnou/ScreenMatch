package br.com.alura.screenmatch.desafios.HeranEPoli;

public class Main {
    public static void main(String[] args) {
        MeuCarro meuCarro = new MeuCarro();

        meuCarro.tipoDeCarro("BYD","King");
        meuCarro.setTipoCarroceria("Sedan");
        meuCarro.pegaPreco(18899.98,17511.98,19000);
        meuCarro.tipoMotor("Hibrido Puglin");
        meuCarro.exibirFicha();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        ContCorrente conta = new ContCorrente();
        conta.depositar(245);
        conta.depositar(50);
        conta.sacar(100);
        conta.cobrarTarifaMensal();
        conta.consultarSaldo();

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);

    }
}
