package br.edu.ifsul.bcc.too.topico5.exercicios.cs;

public class ItensCompra {

    private Integer id;
    private String quantidade;
    private Float valor;
    private ItensCompra ItensCompra;
    private Artefato artefato;

    public ItensCompra() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public ItensCompra getItensCompra() {
        return ItensCompra;
    }

    public void setItensCompra(ItensCompra ItensCompra) {
        this.ItensCompra = ItensCompra;
    }

    public Artefato getArtefato() {
        return artefato;
    }

    public void setArtefato(Artefato artefato) {
        this.artefato = artefato;
    }

}
