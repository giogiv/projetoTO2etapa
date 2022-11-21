package br.edu.ifsul.bcc.too.topico5.exercicios.cs;

import java.util.Calendar;
import java.util.List;

public class Jogador {

    private String nickname;
    private String senha;
    private Integer pontos;
    private Calendar data_cadastro;
    private Calendar data_ultimo_login;
    private Endereco endereco; // associacao
    private List<Artefato> artefato;
    private List<Patente> patente;
    private List<Compra> compra;

    public Jogador() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Calendar getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Calendar getData_ultimo_login() {
        return data_ultimo_login;
    }

    public void setData_ultimo_login(Calendar data_ultimo_login) {
        this.data_ultimo_login = data_ultimo_login;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Artefato> getArtefato() {
        return artefato;
    }

    public void setArtefato(List<Artefato> artefato) {
        this.artefato = artefato;
    }

    public List<Patente> getPatente() {
        return patente;
    }

    public void setPatente(List<Patente> patente) {
        this.patente = patente;
    }

    public List<Compra> getCompra() {
        return compra;
    }

    public void setCompra(List<Compra> compra) {
        this.compra = compra;
    }

}
