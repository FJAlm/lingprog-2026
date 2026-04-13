import java.util.Scanner;

public class Buscador {
     public static void main(String[] args) {
        System.out.println();
        System.out.println("Preenche 10 nomes: ");
        System.out.println();

        Scanner info = new Scanner(System.in);

        String vet[] = new String[5];

        Names(vet, info);

         System.out.println();
         System.out.println("Qual nome deseja buscar?");
         Buscador(vet, info);
    }

    public static void Names (String vet[], Scanner info){
        for (int i = 0; i < vet.length; i++){
            System.out.println((i + 1)+"º nome: ");
            vet[i] = info.next();
        }
    }

    public static void Buscador (String vet[], Scanner info) {

        String busca = info.next();
        boolean encontrado = false;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i].equalsIgnoreCase(busca)) {
                System.out.println("Nome encontrado na posição "+i);
                encontrado = true;
            }
        }

        if (!encontrado){
            System.out.println("Nome não encontrado.");
        }
    }
}
