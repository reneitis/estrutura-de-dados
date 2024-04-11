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
public class Node {
    private String value;
    private Node next; //tem que ser do tipo da classe

    
    public Node(){
        
    }

    public String getValue(){
        return value;

}
 
    public void setValue(String value){
        this.value = value;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    
}