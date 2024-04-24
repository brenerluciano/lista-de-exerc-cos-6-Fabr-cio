import java.util.Scanner;

public class App3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] vetorincial = new int[8];
        int[] vetorpositivo = new int[8];
        int[] vetornegativo = new int[8];

        System.out.println("Preencha o vetor com números positivos e negativos: ");
        for(int i = 0; i < vetorincial.length; i++){
            vetorincial[i] = scanner.nextInt();
        }
        int positivo = 0;
        int negativo = 0;
        for(int i = 0; i < vetorincial.length; i++){
            if(vetorincial[i] >= 0){
                vetorpositivo[positivo] = vetorincial[i];
                positivo++;
            }else{
                vetornegativo[negativo] = vetorincial[i];
                negativo++;
            }
            
        }
        System.out.println("\nNumeros negativos: ");
        for(int n : vetornegativo){
            System.out.print(n + " ");
        }
        System.out.println("\nNúmeros positivos: ");
        for(int x : vetorpositivo){
            System.out.print(x + " ");
        }
        scanner.close();
    }    
}
