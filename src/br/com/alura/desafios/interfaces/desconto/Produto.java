package br.com.alura.desafios.interfaces.desconto;

public class Produto implements Vendavel{
    private String nomeProduto;
    private double preco;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double precoFinal(int quantidade) {
        return getPreco() * quantidade;
    }

    @Override
    public void aplicarDesconto(double desconto, int quantidade) {
        double precoTotalOriginal = getPreco() * quantidade;

        // 1. Calcula o valor do desconto (baseado no total da transação)
        double valorDoDesconto = precoTotalOriginal * (desconto / 100);

        // 2. Calcula o novo preço total após o desconto
        double novoPrecoTotal = precoTotalOriginal - valorDoDesconto;

        // 3. Recalcula o novo preço unitário (para salvar na instância)
        double novoPrecoUnitario = novoPrecoTotal / quantidade;

        // 4. Atualiza o preço unitário
        setPreco(novoPrecoUnitario);

        // 5. Mensagem de Saída detalhada
        System.out.println("Desconto aplicado (" + String.format("%.0f", desconto) + "% no total R$ " + String.format("%.2f", precoTotalOriginal) + "): R$ " + String.format("%.2f", valorDoDesconto));
        System.out.println("Novo preço unitário após desconto: R$ " + String.format("%.2f", novoPrecoUnitario));
    }
}