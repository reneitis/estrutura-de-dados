import java.util.Stack;

public class Inverterpilha{
    public static void main(String[] args){
         Stack<String> numeros = new Stack<>();
         
         numeros.push("1");
         numeros.push("2");
         numeros.push("3");
         numeros.push("4");

         System.out.println(numeros.pop());
         System.out.println(numeros.pop());
         System.out.println(numeros.pop());
         System.out.println(numeros.pop());
         

    }
}