public class UniaoVetores {
    static void main(String[] args) {
        System.out.println();
        System.out.println("Iremos informar 2 vetores e fazer a junção");
        System.out.println("-----------------------------");

        int vet[] = new int[5];
        int vet2[] = new int[5];
        int vet3[] = new int[10];

        System.out.println("Infome os valores do primeiro vetor:");
        Exibir1(vet);

        System.out.println("\nInfome os valores do segundo vetor:");
        Exibir2(vet2);

        System.out.println("\n");
        System.out.println("=======================");
        System.out.println("Fazendo a junção!!");
        System.out.println();
        System.out.println("Essa é a junção dos dois vetores: ");

        Juncao(vet3, vet, vet2);
        Mostrar(vet3);

    }

    public static void Exibir1 (int vet[]){
        for (int i = 0; i < vet.length; i++){
            vet[i] = (int)(Math.random() * 15) + 1;
            System.out.print(vet[i]+" ");
        }
    }

    public static void Exibir2 (int vet2[]){
        for (int i = 0; i < vet2.length; i++){
            vet2[i] = (int)(Math.random() * 15) + 1;
            System.out.print(vet2[i]+" ");

        }
    }

    public static void Juncao (int vet3[], int vet[], int vet2[]){
        for (int i = 0; i < vet.length; i++){
            vet3[i] = vet[i];
        }
        for (int i = 0; i < vet2.length; i++) {
            vet3[i + vet.length] = vet2[i];
        }

    }

    public static void Mostrar (int vet3[]) {
        for (int i = 0; i < vet3.length; i++) {
            System.out.print(vet3[i]+" ");
        }
    }
}
