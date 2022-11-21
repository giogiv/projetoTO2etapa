package br.edu.ifsul.bcc.too.topico4;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PessoaEncapsulada {

    /* atributos de instância ou de objeto: definem o estado do objeto em um determinado instante.*/
    private String cpf;//atributos privados e métodos públicos é uma forma de encapsulamento.
    private String nome;
    private String corOlhos;
    private String corCabelo;
    private Calendar dataNascimento;
    private Float altura;

    public PessoaEncapsulada(String cpf,
            String nome,
            String corOlhos,
            String corCabelo,
            Calendar dataNascimetno,
            Float altura) {

        this.cpf = cpf;
        this.nome = nome;
        this.corOlhos = corOlhos;
        this.corCabelo = corCabelo;
        this.dataNascimento = dataNascimento;
        this.altura = altura;

    }

    public PessoaEncapsulada(String cpf, String nome, String corOlhos, String corCabelo, String dataNascimento, Float altura) {

        this.cpf = cpf;
        this.nome = nome;
        this.corOlhos = corOlhos;
        this.corCabelo = corCabelo;
        this.altura = altura;

    }

    protected PessoaEncapsulada(String cpf, String nome) {

        this.cpf = cpf;
        this.nome = nome;
    }

    Calendar dataAtual = Calendar.getInstance();
    int anoAtual = dataAtual.get(Calendar.YEAR);

     
    this.idade  = (anoAtual - dataNascimento.get(Calendar.YEAR));

     
    this.dataNascimento  = dataNascimento;

    public void setDataNascimento(String dataNascimento) {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
java.util.Date dt = null;

try{
    //converter o parametro para java.util.Calendar
    //calcula a idade e seta o this.idade e o this.dataNascimetno
    }

    public void setDataNascimento(Calendar dataNascimento) {
        Calendar dtAtual = Calendar.getInstance();
        int anoAtual = dtAtual.get(Calendar.YEAR);
        this.idade = (anoAtual - dataNascimento.get(Calendar.YEAR));
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {

        return this.cpf;
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
