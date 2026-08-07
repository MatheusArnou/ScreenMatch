package introJava;

public class Condicionais {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        double notaDoFilme = (9.8 + 6.3 + 8.0) / 3;
        boolean incluidoNoPlano = true;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("br.com.alura.screenmatch.model.Filme retrô que vale a pena ver de novo!");
        }

        if(incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Usuário pode assitir");
        } else {
            System.out.println("Para assitir pode acessar o nosso plano plus");
        }

    }
}
