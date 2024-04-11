/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desencadeamento;

/**
 *
 * @author autologon
 */
public class Teste {
    
    public static void main(String[] args) {
        Desencadeamento fila = new Desencadeamento();
        fila.inserirDado("rogerio ceni");
        fila.inserirDado("marco antonio");
        fila.inserirDado("kaka");
        
        System.out.println(" ");
        System.out.println("" + fila.retirarDado());
    }
    
}


//USO EFICIENTE DA MEMORIA
