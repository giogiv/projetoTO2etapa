
package br.edu.ifsul.bcc.too.topico4.exercicios.respostas;

import br.edu.ifsul.bcc.too.base.topico4.exercicios.util.Cliente;
import br.edu.ifsul.bcc.too.base.topico4.exercicios.util.ClientePessoaFisica;
import br.edu.ifsul.bcc.too.base.topico4.exercicios.util.ClientePessoaJuridica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author telmo
 */
public class Exercicio10 {
    
    
        Exercicio10(){
        
        List<Cliente> lista = new ArrayList();
        
        ClientePessoaFisica pf = new ClientePessoaFisica();
        pf.endereco = "";
        pf.setCpf("123456");
        lista.add(pf);
        
        ClientePessoaJuridica pj = new ClientePessoaJuridica();
        pj.endereco = "";
        pj.setCnpj("582789");
        lista.add(pj);
        
        for(Cliente c : lista){
            if(c instanceof ClientePessoaFisica){
                
                System.out.println("Cliente Física: "+ c);
                //casting -  modelagem de tipos.
                ClientePessoaFisica p =  (ClientePessoaFisica)  c;
                //imprimir o cpf do Cliente pessoa fisica
                p.getCpf();
                
            }else if (c instanceof  ClientePessoaJuridica){
                
                System.out.println("Cliente Juridica: "+ c);
                ClientePessoaJuridica j =   (ClientePessoaJuridica)   c;
                //imprimir o cpf do Cliente pessoa fisica
                
                j.getCnpj();
            }
        }
        
    }
        
}
