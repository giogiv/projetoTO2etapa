package br.edu.ifsul.bcc.too.topico4.exercicios;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author telmo
 */
public class Exercicio9 {
	
	public void Exercicio() {
		// String cpf, String nome, String corOlhos, String corCabelo, Calendar dataNascimento, Float altura
				
		Calendar data1 =  Calendar.getInstance();
		data1.set(2003, 6, 21);
		
		Calendar data2 =  Calendar.getInstance();
		data2.set(2001, 2, 1);
		
		Calendar data3 =  Calendar.getInstance();
		data3.set(2002, 11, 14);
		
		Calendar data4 =  Calendar.getInstance();
		data4.set(2003, 8, 7);
		
		Calendar data5 =  Calendar.getInstance();
		data5.set(2000, 4, 11);
		
		PessoaEncapsulada pessoa1 = new PessoaEncapsulada("11", "Clara", "Castanho", "Loiro", data1, Float.parseFloat("1.63"));
		PessoaEncapsulada pessoa2 = new PessoaEncapsulada("22", "Julia", "Verde", "Ruivo", data2, Float.parseFloat("1.67"));
		PessoaEncapsulada pessoa3 = new PessoaEncapsulada("33", "Denis", "Azul", "Castanho", data3, Float.parseFloat("1.78"));
		PessoaEncapsulada pessoa4 = new PessoaEncapsulada("44", "Noah", "Preto", "Loiro", data4, Float.parseFloat("1.76"));
		PessoaEncapsulada pessoa5 = new PessoaEncapsulada("55", "Sophia", "Mel", "Preto", data5, Float.parseFloat("1.60"));
		
		
		Map<Integer, PessoaEncapsulada> mapPessoas = new HashMap();
	    
		mapPessoas.put(1, pessoa1);
		mapPessoas.put(2, pessoa2);
		mapPessoas.put(3, pessoa3);
		mapPessoas.put(4, pessoa4);
		mapPessoas.put(5, pessoa5);
	                    
	     for (Map.Entry<Integer, PessoaEncapsulada> valor : mapPessoas.entrySet()) { 
	           System.out.println(valor.getValue().toString());    
	     } 
	}
	
	public static void main(String args[]){
        new Exercicio9().Exercicio();
    }
    /*    
    9. Utilizando o conceito de encapsulamento, crie métodos públicos na classe br.edu.ifsul.bcc.too.base.topico4.PessoaEncapsulada
       para disponibilizar o acesso aos atributos da instância: corOlhos, corCabelo, dataNascimento, altura.
    
    */
    
    /*
    9.1 Utilizando o conceito de encapsulamento, crie um novo atributo de instância na classe br.edu.ifsul.bcc.too.base.topico4.PessoaEncapsulada.
    Esse atributo irá manter a informação da idade. A informação da idade deve ser gerada automaticamente pelo
    método setDataNascimento(). Sendo assim, disponibilize o acesso a esse atributo através do método getIdade(). 
    O método setIdade() não deve ser codificado, já que a idade será gerada automaticamente.
    
    */
    
    /*
    9.2 Utilizando o conceito de polimorfismo/sobrecarga, codifique um novo construtor para a classe br.edu.ifsul.bcc.too.base.topico4.PessoaEncapsulada.
        Esse método deverá ter uma assinatura que possibilite receber por parâmetro dados para os atributos: cpf, nome, corOlhos, corCabelo, dataNascimento, altura;
    
    */
    
    /*
    9.3 Utilizando o conceito de polimorfismo/sobreposicao, reescreva o método toString() na classe br.edu.ifsul.bcc.too.base.topico4.PessoaEncapsulada.
    Esse método deverá retornar uma string no formato: " CPF: <cpf> - Nome: <nome> Idade: <idade>";    
    */
    
    /*
    9.4 Codifique e execute um método na classe Exercicio9 para criar cinco instâncias de PessoaEncapsulada. Em seguida adicione-as em uma lista e imprime-as na saída padrão os dados de cada aluno no formato " CPF: <cpf> - Nome: <nome> Idade: <idade>"
    */
    
}
