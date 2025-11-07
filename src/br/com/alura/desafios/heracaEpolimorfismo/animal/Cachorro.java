package br.com.alura.desafios.heracaEpolimorfismo.animal;

public class Cachorro extends Animal {

    @Override
    public void emitirSom(String som) {
        System.out.println("O cachorro faz: " + som);
    }

    public void abanarRabo(){
        System.out.println("Esto muito feliz, rabinho abanando! ");
    }
}
