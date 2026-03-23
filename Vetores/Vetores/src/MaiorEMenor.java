/*Crie um programa que receba 10 números em um vetor. Ao final, o programa deve percorrer
o vetor para encontrar e mostrar qual é o maior valor, o menor valor e em quais posições eles estão.
 */
public class MaiorEMenor {
    static void main() {
        System.out.println();
        System.out.println("===============================");
        System.out.println("Informa 10 números para armazenar em um vetor");

        int[] numb = new int[10];

        for (int i = 0; i < 10; i++){
            numb[i] = (int)(Math.random()* 100) -50;
            System.out.println(numb[i]);
        }
        int maior = numb[0];
        int menor = numb[0];
        int posiM = 0;
        int posim = 0;

        for (int i = 0; i < 10; i++){
            if (numb[i] > maior){
                maior = numb[i];
                posiM = i;
            }
            if (numb[i] < menor){
                menor = numb[i];
                posim = i;
            }
        }
        System.out.println("Maior número "+maior+ " na posição "+posiM);
        System.out.println("Menor número "+menor+ " na posição "+posim);
    }
}
