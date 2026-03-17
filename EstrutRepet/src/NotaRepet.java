import java.util.Scanner;

/*
Crie um programa que peça uma nota entre 0 e 10. Se o usuário digitar um valor inválido, o programa
deve dizer "Nota inválida! Digite novamente" e continuar pedindo até que o usuário digite um valor correto.
 */
public class NotaRepet {
    static void main() {
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("Por favor, informa uma nota de 0 a 10 para o atendimento");
        System.out.println();
        System.out.println("Zero para atendimento péssimo");
        System.out.println("Dez para atendimento excelente!");
        System.out.println("Cinco, quer dizer um atendimento mediano");

        Scanner valor = new Scanner(System.in);
        int nota = valor.nextInt();

        while (nota < 0 || nota > 10){
                System.out.println("Por favor, tente novamente");
                nota = valor.nextInt();
        }
    }
}
