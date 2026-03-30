import java.util.Scanner;

public class EX01 {
    static void main() {
        System.out.println();
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("Métodos de operações matemáticas");
        System.out.println("Informe dois números fracionados:");

        Scanner dados = new Scanner(System.in);
        System.out.print("A = ");
        float a = dados.nextFloat();
        System.out.print("B = ");
        float b = dados.nextFloat();
        System.out.print("C = ");
        float c = dados.nextFloat();
        System.out.print("D = ");
        float d = dados.nextFloat();

        float x;
        System.out.println();
        System.out.println("===============================");
        System.out.println("Escolha a opção que desejar");
        System.out.println("1 - Soma das operações");
        System.out.println("2 - Subtração das operações");
        System.out.println("3 - Dvisão das operações");
        System.out.println("4 - Multiplicação da operação");
        System.out.println("5 - SAIR");
        System.out.println();

        int option = dados.nextInt();
        switch (option){
            case 1:
                x = (a + b)/(c + d);
                System.out.println("Valor "+x);
                break;

            case 2:
                x = (a - b)/(c - d);
                System.out.println("Valor "+x);
                break;

            case 3:
                x = (a * b)/(c * d);
                System.out.println("Valor "+x);
                break;

            case 4:
                x = (a / b)/(c / d);
                System.out.println("Valor "+x);
                break;

            default:
                System.out.println("Programa encerrado");
        }
    }
}
