import java.util.Scanner;

/*
Crie um vetor que armazene 8 números inteiros informados pelo usuário.
Ao final, o programa deve somar apenas os números que são pares e mostrar o resultado.
 */
public class SomaPares {
    static void main() {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("Informe 8 números inteiros:");

        int[] numb = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print(i + "º número: ");
            numb[i] = (int) (Math.random() * 10);
            System.out.println(numb[i]);

        }
        int soma =0;
        for (int i = 0; i < 8; i++){
            if (numb[i] % 2 == 0){
                soma = soma + numb[i];
            }
        }
        System.out.println("A soma dos números pares são: "+soma);
    }
}
