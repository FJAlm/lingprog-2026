import java.util.Scanner;

public class Fibonacci {
    static void main() {
        System.out.println();
        System.out.println("SISTEMA DE FIBONACCI");
        System.out.println("-------------------------");
        System.out.println("Quantos termos você deseja? ");

        Scanner dados = new Scanner(System.in);
        int n = dados.nextInt();

        int[] fibonacci = new int[n];

        if (n >= 1){
            fibonacci[0] = 0;
        }
        if (n >= 2){
            fibonacci[1] = 1;
        }
        for (int i = 2; i < fibonacci.length; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.println("VETOR FIBONACCI");
        for (int i = 0; i < fibonacci.length; i++){
        System.out.print(fibonacci[i]+" ");
        }
    }
}
