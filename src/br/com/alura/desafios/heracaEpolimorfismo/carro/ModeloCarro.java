package br.com.alura.desafios.heracaEpolimorfismo.carro;

// A subclasse herda tudo da classe Carro
public class ModeloCarro extends Carro {

    // Método para definir os dados específicos do modelo
    public void definirModelo(String nome, double preco1, double preco2, double preco3) {
        setModelo(nome);
        calcularPrecos(preco1, preco2, preco3);
    }
}