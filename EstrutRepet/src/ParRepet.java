import java.util.Scanner;

/*
Peça ao usuário dois números inteiros: um limite inferior e
um limite superior. Use um for para mostrar todos os números pares dentro desse intervalo.
 */
public class ParRepet {
    static void main() {
        System.out.println();
        System.out.println("Vamos descobrir quantos pares tem num intervalo de 2 números");
        System.out.println("Digite o número inferior: ");

        Scanner numb = new Scanner(System.in);
        int inf = numb.nextInt();

        System.out.println();
        System.out.println("-----------");
        System.out.println("Digite o número superior:");
        int sup = numb.nextInt();
        System.out.println();

        System.out.println("--------------");
        System.out.println("Quantidade de números pares");
        for (int i = inf; i <= sup; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
