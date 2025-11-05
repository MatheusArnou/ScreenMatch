package br.com.alura.desafios.encapsulamento;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.setSaldo(1000);
        contaBancaria.setNumeroConta(1289);
        contaBancaria.titular = "Matheus Arnou";

        System.out.println(contaBancaria.exibirDados());

        System.out.println("\n");

        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setIdade(28);
        idadePessoa.setNome("Matheus Arnou");
        idadePessoa.verificaIdade();

        System.out.println("\n");

        Produto produto = new Produto();
        produto.setNome("Mochila");
        produto.setPreco(100);
        System.out.println(produto.aplicarDesconto(0.15));

        System.out.println("\n");

        Aluno aluno = new Aluno();
        aluno.setNome("Matheus");
        aluno.somadorNotas(8.5);
        aluno.somadorNotas(5.59);
        aluno.somadorNotas(10);
        System.out.println(aluno.exibirNota());

        System.out.println("\n");

        Livro livro = new Livro();
        livro.setTitulo("Jogos Vorazes");
        livro.setAutor("Suzanne Collins");
        livro.exibirDetalhes();

        System.out.println("\n");



    }
}
