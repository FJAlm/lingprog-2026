public class SubstituicaoPorZero {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("SISTEMA DE TROCAÇÃO - VETOR");
        System.out.println("===========================");
        System.out.println("Informe 10 números inteiros, tanto negativos e positivos");
        System.out.println();

        int vet[] = new int[10];

        Exibir(vet);

        System.out.println();
        System.out.println("Números negativos serão substituidos por 0");
        Zero(vet);
        System.out.println("\nResultado final:");
        Result(vet);
    }

    public static void Exibir(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random() * 10) - 5;
            System.out.print(vet[i] + "  ");
        }
    }

    public static void Zero(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < 0) {
                vet[i] = 0;
            }
        }
    }
    public static void Result (int vet[]){
        for (int i = 0; i < vet.length; i++){
            System.out.print(vet[i]+"  ");
        }
    }
}

