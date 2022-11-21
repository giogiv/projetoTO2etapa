package br.edu.ifsul.bcc.too.topico4.exercicios;

import java.util.Calendar;

public class ClientePessoaFisica extends Cliente {

    private String cpf;
    private String nome;
    private Calendar nascimento;

    public ClientePessoaFisica(String cpf,
            String nome,
            Calendar nascimento,
            String endereco,
            String bairro,
            String telefone,
            Calendar ultimacompra) {
        super(endereco, bairro, telefone, ultimacompra);
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.nome = nome;


    }
@Override
public String toString(){
            System.out.println("- Nome: "+this.nome+ " - (Pessoa Física)");
        return null;
}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

}
