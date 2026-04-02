import java.util.Scanner;

public class SomaDiagonalPrincipal {
    static void main() {
        System.out.println();
        System.out.println("DIAGONAL PRINCIPAL");

        int[][] mat = new int[4][4];

        System.out.println("Determina os valores da matriz 4 x 4");
        Scanner dados = new Scanner(System.in);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = dados.nextInt();
            }
            System.out.println();
        }
        System.out.println("Exibindo a Matriz");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("==========================");
        System.out.println("DIAGONAL PRINCIPAL");
        int soma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j){
                    System.out.println("Números da diagonal principal "+mat[i][j]);
                    soma = soma + mat[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Soma dos números da diagonal principal: "+soma);
    }
}
