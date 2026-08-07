package br.com.alura.screenmatch.desafios.HeranEPoli;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Au Au");
    }
    public void abanarRabo(){
        System.out.println("〰");
        System.out.println("〜");
        System.out.println("〰");
    }
}
