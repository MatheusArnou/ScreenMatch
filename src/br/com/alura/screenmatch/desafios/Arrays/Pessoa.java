package br.com.alura.screenmatch.desafios.Arrays;

public class Pessoa {
    private int idade;
    private String nome;

    void pegaDados(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + ", idade: " + this.getIdade();
    }
}
