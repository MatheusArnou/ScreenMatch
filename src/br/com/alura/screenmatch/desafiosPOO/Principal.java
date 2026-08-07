package br.com.alura.screenmatch.desafiosPOO;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Matheus");
        conta.depositar(1000);
        conta.depositar(500);
        conta.depositar(200);
        //double saldo = conta.exibirSaldo(); teste
        conta.sacar(1500);
        System.out.println("Titular da conta: " + conta.getTitular());
        //System.out.printf("Saldo %.2f", saldo) teste
        System.out.printf("Saldo %.2f", conta.exibirSaldo());

        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Matheus");
        idadePessoa.setIdade(29);
        System.out.println();
        System.out.println(idadePessoa.verificarMaioridade());

        Produto produto = new Produto();
        produto.setNome("PlayStation 5");
        produto.setPreco(5500);
        System.out.println(produto.aplicarDesconto(10));

        Aluno aluno = new Aluno();
        System.out.println(aluno.calcularNota(10,7,8));

        Livro livro = new Livro();
        livro.setTitulo("Cansação para ninar menino grande");
        livro.setAutor("Conceição Evaristo");
        livro.exibirDetalhes();

    }
}
