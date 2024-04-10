
package fila;

public class Teste {
    
    public static void main(String[] args){
        Fila fila = new Fila();
        fila.entradaDeDados(8);
        fila.entradaDeDados(6);
        fila.entradaDeDados(4);
        
        System.out.println("o numero retirado foi " + fila.retiradaDado());
        
       
    }
}
