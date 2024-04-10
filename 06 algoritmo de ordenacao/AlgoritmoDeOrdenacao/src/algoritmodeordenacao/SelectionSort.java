
package algoritmodeordenacao;


public class SelectionSort {
    
    public static void main(String[] args) {
        int vet[] = {8,9, 3, 5, 11};
        
        System.out.println("numeros desordenados!");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" " + vet[i]);
        }
        
        System.out.println("");
        
        for(int i = 0; i < vet.length -1; i++){
            int menorIndex = 1;
            for( int j = i+1; j< vet.length; j++ ){
                if( vet[j] < vet[menorIndex]){
                    menorIndex = j; 
                } 
            }
          
                int temp = vet[menorIndex];
                vet[menorIndex] = vet[i];
                vet[i] = temp;
            }
        
    
        
        System.out.println("numeros ordenado!");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" " + vet[i] ); //in line
        }
        System.out.println(" ");
    }
}
