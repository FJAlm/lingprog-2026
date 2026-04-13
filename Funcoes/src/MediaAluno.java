import java.util.Scanner;

public class MediaAluno {
    static void main() {
        System.out.println("Média do aluno");
        System.out.println();

        Scanner notas = new Scanner(System.in);
        System.out.println("Digite a nota da primeira prova: ");
        float nota1 = notas.nextFloat();

        System.out.println("Digite a nota da segunda prova: ");
        float nota2 = notas.nextFloat();

        float media = MediaTotal(nota1, nota2);

        System.out.println("A média do aluno = "+media);
        System.out.println("Com isso, o aluno foi "+Condicao(media));
    }

        public static float MediaTotal(float nota1, float nota2) {
        return ((nota1 + nota2) / 2);
    }

    public static String Condicao(float media) {
        if (media >= 6) {
            return "Aprovado";
        }
        else if (media >= 4) {
            return "Recuperção";
        }
        else {
            return "Reprovado";
        }
    }
}
