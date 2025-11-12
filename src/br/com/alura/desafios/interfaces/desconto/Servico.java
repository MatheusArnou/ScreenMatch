package br.com.alura.desafios.interfaces.desconto;

public class Servico implements Vendavel {
    private String nomeServico;
    private double precoHora;

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public double precoFinal(int quantidade) {
        return getPrecoHora() * quantidade;
    }

    @Override
    public void aplicarDesconto(double desconto, int quantidade) {
        double precoTotalOriginal = getPrecoHora() * quantidade;

        // 1. Calcula o valor do desconto (baseado no total da transação)
        double valorDoDesconto = precoTotalOriginal * (desconto / 100);

        // 2. Calcula o novo preço total após o desconto
        double novoPrecoTotal = precoTotalOriginal - valorDoDesconto;

        // 3. Recalcula o novo preço por hora (para salvar na instância)
        double novoPrecoUnitario = novoPrecoTotal / quantidade;

        // 4. Atualiza o preço por hora
        setPrecoHora(novoPrecoUnitario);

        // 5. Mensagem de Saída detalhada
        System.out.println("Desconto aplicado (" + String.format("%.0f", desconto) + "% no total R$ " + String.format("%.2f", precoTotalOriginal) + "): R$ " + String.format("%.2f", valorDoDesconto));
        System.out.println("Novo preço por hora após desconto: R$ " + String.format("%.2f", novoPrecoUnitario));
    }
}