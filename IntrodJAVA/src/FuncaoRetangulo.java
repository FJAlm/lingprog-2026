import java.util.Scanner;

public class FuncaoRetangulo {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Iremos calcular a área de um retângulo");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor da base: ");
        float base = entrada.nextFloat();

        System.out.print("Informe o valor da altura: ");
        float altura = entrada.nextFloat();

        System.out.printf("Área do retângulo fornecido: %.2f", CalcularArea(base,altura));

        System.out.println("\nVamos verificar se a base do retângulo é par ou não");
        if (EhPar((int)base)){
            System.out.println("A base é par");
        }
        else {
            System.out.println("A base é ímpar");
        }
    }
    public static float CalcularArea(float base, float altura){
        return (base * altura);
    }
    // verificar a pariedade
    public static boolean EhPar (int numero){
        return (numero % 2 == 0);
    }
}




