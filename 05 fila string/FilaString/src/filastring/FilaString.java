package filastring;

import javax.swing.JOptionPane;


public class FilaString {
    
//declarando variaveis
    int inicio;
    int fim;
    String nome;
    String vet[];
    int qtdElem;
    int n; //tamanho da fila 
   
    
    public FilaString(){   //construtor e metodo
        
        qtdElem = 0;
        inicio = fim -1;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("digite um numero: "));
        
        vet = new String[n];
     
    }
    
    
    public void entradaDeDados(String nome){
        if(qtdElem == 0){
            inicio = fim = 0;
            vet[fim] =  nome;
            qtdElem++;
            fim++;
        }else{
            if(fim == n - 1){ 
                System.out.println("fila cheia!");
            }else{
                vet[fim] = nome;
                qtdElem++;
                fim++;
            }
        }
    }
    
    
    public String retiradaDados(){
        int String;
        String = n = 0;
        if(qtdElem == 1){
            nome = vet[inicio];
            qtdElem--;
            inicio = fim = -1;
        }else{
            if(inicio > fim){
                System.out.println("fila vazia!");
            }else{
                nome = vet[inicio];
                qtdElem--;
                inicio++;
            }
        }
        
        return nome;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    void entradaDeDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}