import java.util.Scanner;

public class InversorNomes {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("INVERSOR DE NOMES");
        System.out.println();
        System.out.println("Digite 5 nomes, por gentileza: ");
        String[] names = new String[5];

        Scanner dados = new Scanner(System.in);

        LeituraVet(names, dados);

        System.out.println("**************Invertendo os nomes :**************");
        Inversor(names);
    }

    public static void LeituraVet (String[] names, Scanner dados){
        for (int i = 0; i < names.length; i++){
            System.out.print((i+1)+"º nome: ");
            names[i] = dados.next();
        }
        System.out.println(" ");
    }
    public static void Inversor (String[] names){
        for (int i = names.length - 1; i >= 0; i--){
            System.out.println(names[i]);
        }
    }
}
