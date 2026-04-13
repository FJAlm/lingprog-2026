public class SomaPares {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("SISTEMA DE SOMAR OS PARES DE UM VETOR");
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("Informe 8 números inteiros: ");

        int vet[] = new int[8];

        VetorSorteio(vet);

        System.out.println("\n\nA soma dos pares são: "+SomaPares(vet));

    }
    public static void VetorSorteio (int vet[]){
        for (int i = 0; i < vet.length; i++){
            vet[i] = (int)(Math.random() * 10);
            System.out.print(vet[i]+"  ");
        }
    }
    public static int SomaPares (int vet[]){
        int soma = 0;
        for (int i = 0; i < vet.length; i++){
            if (vet[i] % 2 == 0) {
                soma = soma + vet[i];
            }
        }
        return soma;
    }
}
