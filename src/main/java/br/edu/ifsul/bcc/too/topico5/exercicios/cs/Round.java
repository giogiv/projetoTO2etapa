package br.edu.ifsul.bcc.too.topico5.exercicios.cs;

import java.util.Calendar;
import java.util.List;

public class Round {

    private Integer id;
    private Integer numero;
    private Calendar inicio;
    private Calendar fim;
    private Partida partida; // agregação por composição
    private List<Objetivo> objetivo;
    private Modo modo;

    public Round() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public List<Objetivo> getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(List<Objetivo> objetivo) {
        this.objetivo = objetivo;
    }

    public Modo getModo() {
        return modo;
    }

    public void setModo(Modo modo) {
        this.modo = modo;
    }

}
