import java.util.Scanner;

public class FuncaoNum {
    static void main() {
        System.out.print("Digite um número qualquer: ");
        Scanner num = new Scanner(System.in);
        int numb = num.nextInt();
        verificarNum(numb);
    }

    static void verificarNum (int num){
        if (num < 0){
            System.out.println("O número informado é negativo");
        }
        else if (num == 0){
            System.out.println("O número informado é igual a zero");
        }
        else  {
            System.out.println("O número informado é positivo");
        }
        System.out.println("-------------------------------------");
        if (num % 2 == 0){
            System.out.println(num+"   O número é par");
        }
        else {
            System.out.println(num+"   O número é ímpar");
        }
    }
}
