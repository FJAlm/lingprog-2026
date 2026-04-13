import java.util.Scanner;

public class SomaDiagonalSecundaria {
    static void main() {
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Diagonal Secundaria");
        System.out.println("O usuário irá escolher o tamanho da Matriz");
        System.out.println("(Lembrando que deve ser um QUADRADO)");
        System.out.print("Informe o tamanho da linha e da coluna: ");

        Scanner tam =  new Scanner(System.in);
        int n = tam.nextInt();
        int mat[][] = new int[n][n];

        System.out.println("O valor da matriz selecionada foi "+n+"X"+n);
        System.out.println();

        for(int i=0; i < mat.length; i++){
            for(int j=0; j <mat[0].length; j++){
                mat[i][j] = (int)(Math.random()*10);
                System.out.print(mat[i][j]+"   ");
            }
            System.out.println(" ");
        }
        System.out.println();
        System.out.println("DIAGONAL SECUNDARIA");
        System.out.println("===========================================");

        int soma = 0;

        for(int i=0; i < mat.length; i++){
            for(int j=0; j <mat[0].length; j++){
                if (i + j == mat.length - 1){
                    System.out.print(mat[i][j]);
                    soma = soma + mat[i][j];
                }
            }
            System.out.print("  ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Soma do Diagonal Secundaria: ");
        System.out.println("O valor da soma da diagonal secundaria = "+soma);
    }
}
