
package filastring;


public class FilaStringTeste {
    
    public static void main(String[] args) {
        FilaString teste = new FilaString();  // classe, objeto e classe
        teste.entradaDeDados("Ana Paula");
        teste.entradaDeDados("Sidney");
        teste.entradaDeDados("Evellyn");
        teste.entradaDeDados("Neymar");
        
        System.out.println("o seu nome é: " + teste.retiradaDados()); //nome do objeto
        
    }
    
    
}




