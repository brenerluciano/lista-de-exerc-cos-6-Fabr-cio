import java.util.Scanner; 

public class App2 { 
    public static void main(String[] args)  { 
        Scanner scanner = new Scanner(System.in); 

        int [] vetor1 = new int[10]; 
        int [] vetor2 = new int[10]; 
        int [] vetorfinal = new int[20]; 

        System.out.println("Insira o valor do 1 for: "); 

        for(int i = 0; i < vetor1.length; i++){ 
            vetor1[i] = scanner.nextInt(); 
        } 

        System.out.println("Insira o valor do 2 for: "); 

        for(int j = 0; j < vetor2.length; j++ ){ 

           vetor2[j] = scanner.nextInt(); 
        } 
        for(int i = 0; i < 10; i++){ 

        vetorfinal[2 * i] = vetor1[i]; 
        vetorfinal[2 * i + 1] = vetor2[i]; 

        } 
        for(int n : vetorfinal){ 

            System.out.print(n + " "); 
        } 

    scanner.close(); 
    } 
} 