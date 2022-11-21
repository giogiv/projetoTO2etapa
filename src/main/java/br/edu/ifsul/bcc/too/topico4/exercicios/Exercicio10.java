package br.edu.ifsul.bcc.too.topico4.exercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * /*
 * 10. Implemente no pacote br.edu.ifsul.bcc.too.base.topico4.exercicios.util o
 * diagrama localizado no diretorio
 * src/main/resources/imagens/diagrama_heranca_cliente.jpg. Sendo assim, crie as
 * classes: Cliente, ClientePessoaFisica e ClientePessoaJuridica. Na classe
 * Cliente defina os atributos protegidos: endereco, bairro, telefone,
 * ultimaCompra. Na classe ClientePessoaFisica defina os atributos privados:
 * cpf, nome e nascimento. Por fim, na classe ClientePessoaJuridica defina os
 * atributos privados: cnpj, nomeFantasia e razaoSocial.
 *
 */
/*
        10.1 Implemente a herança conforme o diagrama. Portanto, ClientePessoaFisica deverá herdar de Cliente. Ex:
                ...
                    public class ClientePessoaFisica extends Cliente {
                ... 
    
            ClientePessoaJuridica também deverá herdar de Cliente, ex: 
                ...
                    public class ClientePessoaJuridica extends Cliente {
 */
 /*
    
        10.2 Encapsule os atributos das classes Cliente, ClientePessoaFisica e ClientePessoaJuridica
 */
 /*
        10.3 Codifique e execute um método na classe Exercicio10 para criar duas instâncias de ClientePessoaFisica e duas de ClientePessoaJuridica.
             Essas 4 instâncias deverão conter dados e ser adicionadas em uma lista de Cliente. Em seguida imprime-as na saída padrão os seus dados e a indicação do tipo da instância. ex:
                
                - Nome         : Fulano     (Pessoa Fisica)
                - Nome fantasia: Bar do Zé (Pessoa Juridica)
    
 */
public class Exercicio10 {

    Exercicio10() {
        List<Cliente> listaClientes = new ArrayList();

        ClientePessoaFisica cf = new ClientePessoaFisica();
        Cliente cj = new ClientePessoaJuridica();
        Cliente c = new Cliente();
        ClientePessoaFisica cf2 = new ClientePessoaFisica();
        ClientePessoaJuridica cj3 = new ClientePessoaJuridica();

        cf2.setBairro("bairro de teste");

        listaClientes.add(cf);
        listaClientes.add(cj3);
        listaClientes.add(cj);

        for (Cliente cl : listaClientes) {
            if (cl instanceof ClientePessoaFisica) {
                ClientePessoaFisica cpf = (ClientePessoaFisica) cl;
                System.out.println(cpf);
            } else if (cl instanceof ClientePessoaJuridica) {
                ClientePessoaJuridica cpj = (ClientePessoaJuridica) cl;
            }
        }
    }

    public static void main(String args[]) {

        new Exercicio10();
    }

}
