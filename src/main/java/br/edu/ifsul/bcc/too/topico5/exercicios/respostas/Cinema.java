package br.edu.ifsul.bcc.too.topico5.exercicios.respostas;

import java.util.List;

public class Cinema {
    private String nome;
    private Integer capacidade; // em minutos
    private List<Filme> filmes; //agregacao
    private List<Bilheteria> bilhetes; //agregacao por composicao
}
