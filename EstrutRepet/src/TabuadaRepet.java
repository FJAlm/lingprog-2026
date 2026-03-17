import java.util.Scanner;

/*
Peça para o usuário digitar um número inteiro. Utilize um laço for para imprimir a tabuada desse número
de 1 a 10.
Exemplo de saída: "5 x 1 = 5 ... 5 x 10 = 50"
 */
public class TabuadaRepet {
    static void main() {
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("Por gentileza, digite um número inteiro qualquer para imprimir a tabuada");
        Scanner numb = new Scanner(System.in);
        int numero = numb.nextInt();

        for (int vezes = 1 ; vezes <= 10; vezes++){
            int result = numero * vezes;
            System.out.println(numero+" X "+vezes+" = "+result);
        }
    }
}
