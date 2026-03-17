import java.util.Scanner;

public class FatorialRepet {
    static void main() {
        System.out.println("Vamos calcular o fatorial de qualquer número!!");
        System.out.println();
        System.out.println("Digite um número qualquer maior que 0");
        Scanner num = new Scanner(System.in);
        int numero = num.nextInt();

        long fatorial = 1;
        for (int i = numero; i >= 1; i--){
            fatorial = fatorial * i;
        }
        System.out.println(numero+"! = "+fatorial);
    }
}
