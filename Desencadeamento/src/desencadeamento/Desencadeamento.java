
package desencadeamento;


public class Desencadeamento {
    
   private Node inicio;
   private Node fim;
   private int qtdElemen;
   
    
   public Desencadeamento(){
       inicio = fim = null;
       qtdElemen = 0;
   }
   
   public void inserirDado(String x){
       Node nova = new Node();
       nova.setValue(x);
       
       if(qtdElemen == 0){
           inicio = fim = nova;
           qtdElemen++;
       }else{
          fim.setNext(nova);
          fim = fim.getNext();
          qtdElemen++;
               
          
       }
    }
   
    public String retirarDado(){
       
    String retorno = "";
    String proximo = "";
    String proximo2 ="";
    String retornoNull = "";
       
        if(qtdElemen == 0){
           System.out.println("fila vazia!");
        }else{
           qtdElemen--;
           qtdElemen--;
           System.out.println(qtdElemen);
           retorno = inicio.getValue();
           System.out.println(retorno);
           Node aux = inicio;
           inicio = inicio.getNext();
           aux = null;
           qtdElemen++;
           System.out.println(qtdElemen);
           proximo = inicio.getValue();
           System.out.println(proximo);
           Node aux1 = inicio; inicio = inicio.getNext();
           proximo2 = inicio.getValue();
           qtdElemen++;
           System.out.println(qtdElemen);
           Node aux2 = inicio; inicio = inicio.getNext();
            System.out.println(proximo2);
           
   
       }
        
        return retornoNull; 
   }
  
}
  




