
package algoritmodeordenacao;


public class BubbleSort {
            
    public static void main(String[] args) {
        int vet[] = {8,9,3,5,11};
        int aux;
        
        System.out.println("numeros desordenados!"); //inline
        for (int i = 0; i < 5; i++) {
            System.out.print("" + vet[i]); // pular de linha sem o in
        }
        
        System.out.println("");
        
  
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (vet[j] < vet[j+1]) {
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1]= aux;
                }
                           
            }
            
        }
         
        System.out.println("numeros ordenados");
            for (int i = 0; i < 5; i++) {
                System.out.print("" + vet[i]);
        }
            System.out.println("");
        
     
        }
    
    }

