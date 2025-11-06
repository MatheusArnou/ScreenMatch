package br.com.alura.desafios.poo;

public class Carro {
    public String modelo;
    public int anoFabricacao;
    public String cor;

    public void ficha() {
        System.out.println("modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Cor: " + cor);

    }

    public int calcularIdade(int anoAtual){
        int result = anoAtual - anoFabricacao;
        return result;
    }


}
