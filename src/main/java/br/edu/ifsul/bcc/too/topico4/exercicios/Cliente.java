package br.edu.ifsul.bcc.too.topico4.exercicios;

import java.util.Calendar;

public abstract class Cliente {

    private String endereco;
    private String bairro;
    private String telefone;
    private Calendar ultimaCompra;

    public Cliente(String endereco, String bairro, String telefone, Calendar ultimaCompra) {
        this.bairro = bairro;
        this.endereco = endereco;
        this.telefone = telefone;
        this.ultimaCompra = ultimaCompra;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Calendar getUltimaCompra() {
        return ultimaCompra;
    }

    public void setUltimaCompra(Calendar ultimaCompra) {
        this.ultimaCompra = ultimaCompra;
    }

}
