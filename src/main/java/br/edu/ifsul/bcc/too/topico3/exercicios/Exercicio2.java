
package br.edu.ifsul.bcc.too.topico3.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Prof. Telmo Júnior
 */
public class Exercicio2 {
    
    static  int[][] rgDados1 = new int[3][3];
    
    static  int[][] rgDados2 = new int[3][3];
        
    static  int[][] rgDados3 = new int[3][3];
    
    public static void main(String[] args) {
        
        /*
            1) Com base no código fonte produzido no exercicio 1, 
        implemente um tratamento de exceção para tratar possível erro na conversão de 
               string para integer no comando "Integer.parseInt(sc.next())".
        
               Documentação: https://www.devmedia.com.br/blocos-try-catch/7339
        */
        
        for (int linha=0; linha < rgDados1.length; linha++){

             for(int coluna=0; coluna < rgDados1[linha].length; coluna++){
               boolean erro = false;  
               do{  
                   String inf = JOptionPane.showInputDialog(null, "Inofrme um numero inteiro:", "Informe", JOptionPane.INFORMATION_MESSAGE);

                   try{
                      rgDados1[linha][coluna] = Integer.parseInt(inf);
                      erro = false;
                   }catch(NumberFormatException e){
                       erro = true;
                   }
               }while(erro == true);

             }                        
        }
        
    }
    
}
