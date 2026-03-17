import java.util.Scanner;

public class CamisetasPart2 {
    static void main() {
        // lucro mensal = l(x) = -0.05x² + 40x - 500
        // x = num de camisa produzidas
        // l(x) = lucro
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Digite o número de camisetas produzidas: ");
        Scanner numb = new Scanner(System.in);
        int x = numb.nextInt();
        float lucro = lucroMensal(x);
        int y = quantIdeal();

        System.out.println("O lucro da empresa foi de: R$"+lucro);
        System.out.println("A quantidade ideal para empresa seria de "+quantIdeal()+" camisas.");
    }
    static float lucroMensal (int x){
        float lucro = -0.05f * x * x + 40f * x - 500f;

        return lucro;
    }
    static int quantIdeal (){
        float a = -0.05f;
        float b = 40f;

         int y = (int)(-b / (2 * a));

        return y;
    }
}
