import java.util.Scanner;

public class NotasAluno {
    static void main() {
        System.out.println("------------------------");
        System.out.print("Me informa o seu nome completo: ");
        Scanner info = new Scanner(System.in);
        String name = info.nextLine();
        System.out.print("A sua nota é: ");
        float nota = info.nextFloat();
        System.out.println("------------------------");

        if (nota < 5){
            System.out.println("Aluno reprovado");
        }
        else if (nota > 5 && nota <= 6.9){
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Aprovado");
        }
    }
}
