import java.util.Scanner;

public class BaseOperacional {

void main() {
    System.out.println("Escolha 4 números para que faça as operações disponíveis");
    Scanner numb = new Scanner(System.in);
    System.out.println("");

    System.out.println("Digite o primeiro número");
    int a = numb.nextInt();

    System.out.println("Digite o segundo número");
    int b = numb.nextInt();

    System.out.println("Digite o terceiro número");
    int c = numb.nextInt();

    System.out.println("------------------------------------------");
    System.out.println("Escolha as opções que deseja: ");
    System.out.println("1- Soma");
    System.out.println("2- Subtração");
    System.out.println("3- Multiplicação");
    System.out.println("4- Divisão");
    System.out.println("5- Sair");

    int tipo = numb.nextInt();
    float result = 0;
    switch (tipo){
        case 1:
            result = a + b + c;
            break;

        case 2:
            result = a - b - c;
            break;

        case 3:
            result = a * b * c;
            break;

        case 4:
            result = (float) a / (b * c);
            break;

        case 5:
            System.out.println("O programa será encerrado.");
            return;

        default:
            System.out.println("Opção inválida");
            return;
    }
    System.out.println("====================================");
    System.out.println("O resultado da operação é de: "+result);
    }
}
