
package fila;

import javax.swing.JOptionPane;

public class Fila {
    
        int inicio;
        int fim;
        int n;
        int vet[];
        int qtdElem;
        
        
        public Fila(){
        qtdElem = 0;
        inicio = fim -1;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("insira o tamanho da fila: "));
        
        vet = new int[n];

        }
    
        
        public void entradaDeDados(int num){ // ele nao vai retornar nenhum valor, apenas processar (metodo)
         if(qtdElem == 0){
             inicio = fim = 0;
             vet[fim] = num;
             qtdElem++;
             fim++;
         }else{
              if(fim == n - 1){
                  System.out.println("fila cheia!");
              }else{
                  vet[fim] = num;
                  qtdElem++;
                  fim++;
              } 
         }  
     }
        
        public int retiradaDado(){ // public int porque ele vai mosttrar dados
            int num = 0;
            if(qtdElem == 1){
                num = vet[inicio];
                qtdElem--;
                inicio = fim = -1;
            }else{
                if(inicio > fim){
                    System.out.println("filha vazia!");
                }else{
                    num = vet[inicio];
                    qtdElem--;
                    inicio++;
                    
                }
            }
            return num;
          
        }
        
    public static void main(String[] args) {
       
        
        
    }
    
}
