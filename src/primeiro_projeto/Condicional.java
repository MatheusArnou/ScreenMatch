package primeiro_projeto;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaAvaliacao = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamentos que os clientes estão curtindo");
        } else {
            System.out.println("Filmes retrô que vale a pena assistir");
        }
        if(incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Aproveite esse lançamento sem pagar a mais");
        } else {
            System.out.println("Para assistir esse filme você precisa adquirir ou assinar o plano Plus");
        }


    }
}
