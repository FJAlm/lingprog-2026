/*
Crie dois vetores: um para o nome de 5 produtos e outro para a quantidade em estoque.
O usuário preenche os dois.
Depois, o programa deve listar apenas os produtos que estão com estoque "crítico" (menos de 5 unidades).
 */

import java.util.Scanner;

public class Estoque  {
    static void main() {
        System.out.println("--------------------------------------------------");
        System.out.println();
        System.out.println("Controle de estoque");

        Scanner dados = new Scanner(System.in);

        String[] vetName = new String[5];
        int[] vetQuant = new int[5];

        System.out.println("Nome dos produtos: ");
        System.out.println();
        for (int i = 0; i < 5; i++){
            vetName[i] = dados.next();
            System.out.println("===================================");
        }
        System.out.println("Informe a quantidade dos estoques desses itens respectivamente");
        for (int i = 0; i < 5; i++){
            vetQuant[i] = dados.nextInt();
        }
        System.out.println();

        for (int i = 0; i < 5; i++){
            if(vetQuant[i] < 5){
                System.out.println("Esse produto está prtaticamente sem estoque");
                System.out.println(vetName[i]);
            }
        }
    }
}
