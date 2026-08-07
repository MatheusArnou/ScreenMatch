package br.com.alura.screenmatch.model;

public class Serie extends Titulo{
    private int tempodoras;
    private boolean ativa;
    private int epPorTemp;
    private int minPorEp;

    public int getTempodoras() {
        return tempodoras;
    }

    public void setTempodoras(int tempodoras) {
        this.tempodoras = tempodoras;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpPorTemp() {
        return epPorTemp;
    }

    public void setEpPorTemp(int epPorTemp) {
        this.epPorTemp = epPorTemp;
    }

    public int getMinPorEp() {
        return minPorEp;
    }

    public void setMinPorEp(int minPorEp) {
        this.minPorEp = minPorEp;
    }

    @Override
    public int getDuracaoEmMinuto(){
        return tempodoras * epPorTemp * minPorEp;
    }
}
