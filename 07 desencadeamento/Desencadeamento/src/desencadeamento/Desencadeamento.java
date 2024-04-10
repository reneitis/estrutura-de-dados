
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
   
    public static void main(String[] args) {
       
    }
    
}
