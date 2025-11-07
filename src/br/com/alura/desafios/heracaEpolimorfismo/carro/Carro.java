package br.com.alura.desafios.heracaEpolimorfismo.carro;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;
    private double maior;
    private double menor;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    public void calcularPrecos(double p1, double p2, double p3) {
        setPrecoAno1(p1);
        setPrecoAno2(p2);
        setPrecoAno3(p3);

        maior = p1;
        menor = p1;

        //verifica o maior preço
        if (p2 > maior) maior = p2;
        if (p3 > maior) maior = p3;
        // verifica o menor preço
        if (p2 < menor) menor = p2;
        if (p3 < menor) menor = p3;
    }

    public void exibirFicha(){
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preço ano 1 R$: " + precoAno1);
        System.out.println("Preço ano 2 R$: " + precoAno2);
        System.out.println("Preço ano 3 R$: " + precoAno3);
        System.out.println("Maior preço divulgado R$: " + maior);
        System.out.println("Menor preço divulgado R$: " + menor);
    }
}
