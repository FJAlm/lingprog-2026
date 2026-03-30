import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
Peça para o usuário digitar 5 números desordenados.
O programa deve organizar esses números dentro do vetor em ordem crescente e exibi-los.
 */
public class OrdemCrescente {
    static void main() {
        System.out.println();
        System.out.println("Por gentileza, informa 5 números aleatórios");

        int vet[] = new int[5];
        int vet2[] = new int[5];
        Integer vet3[] = new Integer[5];

        for (int i = 0; i < vet.length; i++){
            vet[i] = (int)(Math.random() * 30);

            System.out.print(vet[i]+" ");
        }
        System.out.println();
        System.out.println("Colocando em ordem crescente");
        for (int i = 0; i < vet.length; i++){
            vet2[i] = vet[i];
        }
        Arrays.sort(vet2);
        for (int i = 0; i < vet.length; i++){
            System.out.print(vet2[i]+" ");
        }
        System.out.println();
        System.out.println("Colocando em ordem decrescente");

        for (int i = 0; i < vet.length; i++){
            vet3[i] = vet[i];
        }
        Arrays.sort(vet3,Collections.reverseOrder());
        for (int i = 0; i < vet.length; i++){
            System.out.print(vet3[i]+" ");
        }
    }
}
