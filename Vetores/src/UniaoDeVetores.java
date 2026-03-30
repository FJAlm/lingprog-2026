/*
Crie dois vetores de 5 posições cada. O programa deve gerar um terceiro vetor de 10
posições que seja a junção dos dois primeiros e mostrá-lo na tela.
 */
public class UniaoDeVetores {
    static void main() {
        System.out.println("==================================");
        System.out.println("UNIÃO DE VETORES");

        int[] vet = new int[5];
        int[] vet2 = new int[5];
        int[] vet3 = new int[10];

        System.out.println();
        System.out.println("Vetor número 1: ");

        for (int i = 0; i < 5; i++) {
            vet[i] = (int) (Math.random() * 40);
            System.out.println(vet[i]);
        }
        System.out.println();
        System.out.println("//////////////////////////////////////////////");
        System.out.println("Vetor número 2: ");

        for (int i = 0; i < 5; i++) {
            vet2[i] = (int) (Math.random() * 40);
            System.out.println(vet2[i]);
        }
        System.out.println();
        System.out.println("/////////////////////////////////////");
        System.out.println("Vetor número 3:");

        for (int i = 0; i < 5; i++) {
            vet3[i] = vet[i];
        }
        for (int i = 0; i < 5; i++) {
            vet3[i + 5] = vet2[i];
        }
        System.out.println("Junção dos vetores: ");
        for (int i = 0; i < 10; i++){
            System.out.print(vet3[i]+" ");

        }
    }
}
