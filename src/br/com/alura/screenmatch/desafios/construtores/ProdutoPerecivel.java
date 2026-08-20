package br.com.alura.screenmatch.desafios.construtores;

public class ProdutoPerecivel extends Produto {
    private int expirationDate;

    public ProdutoPerecivel(String name, double price, int qty, int expirationDate) {
        super(name, price, qty);
        this.expirationDate = expirationDate;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    boolean validateDate(int date) {
        if (date <= expirationDate) {
            return true;
        }
        return false;
    }
}