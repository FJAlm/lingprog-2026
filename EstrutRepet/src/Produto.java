import java.util.Scanner;

/*Crie um programa que leia o nome e o preço de vários produtos. Após cada produto, pergunte: "Deseja continuar? (S/N)".
Se o usuário digitar 'N', o programa para e mostra qual foi o produto mais caro digitado.
 */
public class Produto {
    static void main() {
        System.out.println();
        System.out.println("===================================================");
        System.out.println("CADASTRO DE PRODUTOS DA LOJA AUTOZONE");
        System.out.println();

        Scanner entrada = new Scanner(System.in);

        int i = 1;
        float expensiveprice = 0;
        String expensivename = "";
        while (true){
            System.out.println("Informa o nome do produto número "+i+ ": ");
            String name = entrada.next();

            System.out.println("Informa o valor desse produto");
            float price = entrada.nextFloat();

            System.out.println("DESEJA CONTINUAR? S/N");
            char option = entrada.next().charAt(0);

            char  S = 'S';
            char N = 'N';
            if (option =='N'){
                break;
            }
            if (price > expensiveprice){
                expensiveprice = price;
                expensivename = name;
            }
            i++;
        }
        System.out.println("O produto mais caro é o "+expensivename+" com um valor de RS$"+expensiveprice);
    }
}
