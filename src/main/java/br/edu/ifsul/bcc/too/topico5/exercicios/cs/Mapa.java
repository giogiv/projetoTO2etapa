package br.edu.ifsul.bcc.too.topico5.exercicios.cs;

import java.util.List;

public class Mapa {

    private Integer id;
    private String nome;
    private List<Local> locais; //agregação

    public Mapa() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Local> getLocais() {
        return locais;
    }

    public void setLocais(List<Local> locais) {
        this.locais = locais;
    }

}
