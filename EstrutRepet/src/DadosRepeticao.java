import java.util.Scanner;

public class DadosRepeticao {
    static void main() {
        System.out.println("------------------------------");
        System.out.println("Vamos determinar a possibilidade de um dado ser lançado e escolhe o número que desejar");
        Scanner lancado = new Scanner(System.in);
        System.out.println("Informa quantas vezes que o dado será lançado");
        int jogadas = lancado.nextInt();

        System.out.println();
        System.out.println("---------------------------------");
        System.out.print("Escolha qual número será o principal: ");
        int num = lancado.nextInt();
        while (num < 1 || num > 6){
            System.out.println("Numeração incorreta. Por favor, recomeça novamente.");
            num = lancado.nextInt();
            }

        System.out.println();
        System.out.println("--------------------");

        float count = 0;

        for (int i = 1; i <= jogadas; i++){
          int numb = (int)(Math.random()*6 + 1);
            System.out.println("Dado lançado = "+numb);

            if (numb == num){
               count++;
            }
        }
        System.out.println("A probalididade da quantidade de vezes lançado");
        float prob = (count/jogadas) * 100;
        System.out.println("= "+prob+" %");
    }
}


