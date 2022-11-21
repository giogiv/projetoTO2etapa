package br.edu.ifsul.bcc.too.topico5.exercicios.cs;

import java.util.Calendar;
import java.util.List;

public class Partida {

    private Integer id;
    private Calendar inicio;
    private Calendar fim;
    private List<Round> round; //agregação por composição
    private Jogador jogador;

    public Partida() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public Calendar getFim() {
        return fim;
    }

    public void setFim(Calendar fim) {
        this.fim = fim;
    }

    public List<Round> getRound() {
        return round;
    }

    public void setRound(List<Round> round) {
        this.round = round;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

}
