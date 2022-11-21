package br.edu.ifsul.bcc.too.topico5.exercicios.cs;

import java.util.List;

public class Arma extends Artefato {

    private Float comprimento_cano;
    private List<Municao> municao;
    private Tipo tipo;

    public Arma() {
    }

    public Float getComprimento_cano() {
        return comprimento_cano;
    }

    public void setComprimento_cano(Float comprimento_cano) {
        this.comprimento_cano = comprimento_cano;
    }

    public List<Municao> getMunicao() {
        return municao;
    }

    public void setMunicao(List<Municao> municao) {
        this.municao = municao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

}
