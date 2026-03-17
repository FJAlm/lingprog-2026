public class Repeticao {
    static void main() {
        System.out.println("-------------------------");
        System.out.println("Notas dos alunos da Turma Charlie");
        int posi = 1;
        float notas = 0;
        float soma = 0;

        while (posi <= 10){
            notas = (float) (Math.random()*10 +1);
            System.out.println(posi+"º = o aluno(a) foi "+notas);

            soma = soma + notas;
            posi++;
        }
        float media = soma/10;

        System.out.println("A média da turma Charlie é: "+media);

    }
}