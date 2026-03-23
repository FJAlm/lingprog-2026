import java.util.Scanner;

/*Peça para o usuário digitar 5 nomes e armazene-os em um vetor.
Depois, use um laço para mostrar esses nomes na ordem inversa (do último para o primeiro).
 */
public class InversoNome{
    static void main() {
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Digite 5 nomes: ");

        String[] names = new String[5];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            names[i] = entrada.next();
            System.out.println("  ");
        }
        System.out.println("------------------------");
        System.out.println("Nomes inversos");

        for (int i = 4; i >= 0; i--){
            System.out.println(names[i]+"  ");
        }

    }
}