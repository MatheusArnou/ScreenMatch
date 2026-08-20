package br.com.alura.screenmatch.desafios.construtores;

public class Produto {
    private String name;
    private double price;
    private int qty;

    public Produto(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    @Override
    public String toString() {
        return "Product: " + getName() + "\n Price: " + getPrice() + "\n Inventory (unit) " + getQty() + "";
    }
}
