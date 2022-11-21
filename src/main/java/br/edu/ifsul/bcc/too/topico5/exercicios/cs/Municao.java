package br.edu.ifsul.bcc.too.topico5.exercicios.cs;

public class Municao extends Artefato {

    private Boolean explosiva;
    private Calibre calibre;

    public Municao() {
    }

    public Boolean getExplosiva() {
        return explosiva;
    }

    public void setExplosiva(Boolean explosiva) {
        this.explosiva = explosiva;
    }

    public Calibre getCalibre() {
        return calibre;
    }

    public void setCalibre(Calibre calibre) {
        this.calibre = calibre;
    }

}
