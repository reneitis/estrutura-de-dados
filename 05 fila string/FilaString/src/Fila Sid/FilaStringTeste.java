
package filastring;


public class FilaStringTeste {
    
    public static void main(String[] args) {
        FilaString teste = new FilaString();
        
       
        teste.entradaDeDados("Sidney");
        teste.entradaDeDados("Karine");
        teste.entradaDeDados("Yuri");
        teste.entradaDeDados("Alberto");
        
        System.out.println("o seu nome é: " + teste.retiradaDados());
        
    }
    
    
}




