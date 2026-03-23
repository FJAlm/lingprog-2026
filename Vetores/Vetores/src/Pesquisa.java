import java.util.Scanner;

/*
Peça para o usuário preencher um vetor com 10 nomes. Depois, pergunte: "Qual nome deseja buscar?".
O programa deve dizer se o nome está na lista e em qual posição ele se encontra.
 */
public class Pesquisa {
    static void main() {
        System.out.println();
        System.out.println("===========================");
        System.out.println("Digite 10 nomes");

        String[] name = new String[10];
        Scanner dados = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
                name[i] = dados.next();
            System.out.println("Posição "+i+ " "+name[i]);
        }
        System.out.println("---------------------------------------");
        System.out.println("Qual nome deseja buscar?");
        String igual = dados.next();

        for (int i = 0; i < 10; i++){
            if (name[i].equals(igual)){
                System.out.println("O nome está na lista, posição "+i);
            }
            else {
                System.out.println("Nome não encontrado");
                break;
            }
        }
    }
}

