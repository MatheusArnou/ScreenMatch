package br.com.alura.screenmatch.desafios.HeranEPoli;

public class MeuCarro extends Carro{
    private String tipoCarroceria;
    private int MaxPace;
    private String motorizacao;

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public int getMaxPace() {
        return 200;
    }
    public void tipoMotor(String motorizacao){
        this.motorizacao = motorizacao;
        System.out.println(motorizacao);
    }

    @Override
    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Tipo de carroceria: " + getTipoCarroceria());
        System.out.println("Velocidade máxima: " + getMaxPace());
        System.out.println();
    }
}
