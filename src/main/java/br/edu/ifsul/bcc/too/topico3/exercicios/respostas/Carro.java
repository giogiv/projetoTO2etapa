
package br.edu.ifsul.bcc.too.topico3.exercicios.respostas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author telmo
 */
public class Carro {
    
   private String nome;
   private String modelo;
   private String fabricante;
   private String numeroChassi;
   private Double valor;
   
   private List<Pneu> pneus;
   
   public Carro(){
       
   }
   
   //construtor da classe com parâmetros.
   public Carro(String nome, 
                String modelo, 
                String fabricante, 
                String numeroChassi, 
                Double valor){
       
       //inicialização dos atributos da instancia.       
       this.nome = nome;
       this.modelo = modelo;
       this.fabricante = fabricante;
       this.numeroChassi = numeroChassi;
       this.valor= valor;
   }
   
   //encapsualmente para receber um pneu.
   public void setPneu(Pneu p){
       if(this.pneus == null)
           this.pneus = new ArrayList();
       
       this.pneus.add(p);//adiciona.
   }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the numeroChassi
     */
    public String getNumeroChassi() {
        return numeroChassi;
    }

    /**
     * @param numeroChassi the numeroChassi to set
     */
    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    //sobreescreve o método toString da classe Object.
    @Override
    public String toString(){
      
        return nome + " - " + modelo;
    }
            
}














