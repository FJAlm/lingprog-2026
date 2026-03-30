/*
Faça um programa que leia um vetor de 10 números inteiros. Se o aluno digitar um número negativo
o programa deve substituir esse valor por 0 dentro do vetor antes de imprimi-lo.
 */
public class SubstituicaoaValores {
    static void main() {
        System.out.println();
        System.out.println("===============================");
        System.out.println();

        int[] numb = new int[10];
        System.out.println("Informa 10 números inteiros, pode informar negativo também");

        for (int i = 0; i < 10; i++){
            numb[i] = (int)(Math.random() *20)-10;
            System.out.println(numb[i]);
        }
        System.out.println();
        System.out.println("===============================");
        System.out.println("Substituindo os valores negativos por 0");
        for (int i = 0; i < 10; i++){
            if (numb[i] < 0){
                numb[i] = 0;
            }
            System.out.println(numb[i]);
        }
    }
}
