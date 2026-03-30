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

        for (int i = 0; i < vet.length; i++){
            vet[i] = (int)(Math.random() * 30);

            System.out.println("");
        }
    }
}
