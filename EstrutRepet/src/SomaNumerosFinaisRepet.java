import java.util.Scanner;

/*
O programa deve perguntar quantos números o usuário deseja somar. Com base nesse valor,
use o for para ler esses números um por um e, ao final, mostre a soma total.
 */
public class SomaNumerosFinaisRepet {
    static void main() {
        System.out.println("-----------------------------------------");
        System.out.println("Quantos números deseja somar?");
        Scanner numeros = new Scanner(System.in);
        int numb = numeros.nextInt();

        int soma = 0;
        for (int i = 1; i <= numb; i++){
            int num = (int)(Math.random()*10);
            System.out.println(i+"º = "+num);
            soma = soma + num;
        }
        System.out.println("A soma desses números são de:"+soma);
    }
}
