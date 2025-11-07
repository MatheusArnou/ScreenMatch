package br.com.alura.desafios.heracaEpolimorfismo.animal;

public class Gato extends Animal{
    @Override
    public void emitirSom(String som) {
        System.out.println("O gato faz: " + som);
    }
    public void arranharMoveis(){
        System.out.println("Preciso atacar o cão vou afiar as minhas unhas, ta muito felizinho cão insolente");
    }

}
