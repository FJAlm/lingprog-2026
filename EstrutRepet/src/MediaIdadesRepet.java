import java.util.Scanner;

/*
O programa deve ler idades de alunos até que o usuário digite um número negativo (ex: -1).
Quando isso acontecer, o programa para e mostra a média das idades digitadas.
 */
public class MediaIdadesRepet {
    static void main() {
        System.out.println();
        System.out.println("Sistema de calculo de média de idades dos alunos");
        System.out.println();
        Scanner years = new Scanner(System.in);
        System.out.println("=====================================================");

        int anos = 0;
        float media = 0;
        int sum = 0;
        int i = 1;

        while (true){
            System.out.println("Idade dos alunos: ");
            System.out.println(i+" º Aluno matriculado");
            anos = years.nextInt();

            if (anos < 0){
                break;
            }
            sum = sum + anos;

            i++;
        }
        media = sum/i;
        System.out.println(media+" é a média da idade dos alunos");
    }
}
