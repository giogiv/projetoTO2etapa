package br.edu.ifsul.bcc.too.topico4.exercicios;

import java.util.Calendar;

public class ClientePessoaJuridica extends Cliente{

    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;

    public ClientePessoaJuridica(String cpf,
            String cnpj,
            String nomeFantasia,
            String razaoSocial,
            String endereco,
            String bairro,
            String telefone,
            Calendar ultimacompra) {
        super(endereco, bairro, telefone, ultimacompra);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
}

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }


}
