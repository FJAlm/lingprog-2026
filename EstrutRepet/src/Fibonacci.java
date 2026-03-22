import java.util.Scanner;

public class Fibonacci {
    static void main() {
        System.out.println("Quantos termos deseja gerar na sequência Fibonacci?");
        System.out.println();

        Scanner dados = new Scanner(System.in);
        int word = dados.nextInt();

        System.out.println();
        System.out.println("Sequência de "+word);
        System.out.println();

        int present = 0;
        int previous =1;
        for (int i =1; i <= word; i++){
            System.out.print(previous+" ");

            int next = previous + present;

            previous = present;
            present = next;
        }
        System.out.println();
        System.out.println("Sistema finalizado");
    }
}
