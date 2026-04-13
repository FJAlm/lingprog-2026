public class MaiorMenor {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Maior/Menor");
        System.out.println("Informe 10 números inteiros: ");

        int vet[] = new int[10];

        Vetor(vet);

        System.out.println();
        System.out.println();
        Maior(vet);
        System.out.println();
        Menor(vet);
    }

    public static void Vetor (int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random() * 20);
            System.out.print(vet[i] + "  ");
        }
    }

    public static void Maior (int vet[]) {

        int maior = vet[0];
        int posiM = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                posiM = i;
            }
        }
        System.out.println("Maior número: " +maior+ " (posição " +posiM+ ")");

    }

    public static void Menor (int vet[]) {

        int menor = vet[0];
        int posim = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
                posim = i;
            }
        }
        System.out.println("Menor número: "+menor+ " (posição "+posim+")");

    }
}
