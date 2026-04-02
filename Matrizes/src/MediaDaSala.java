public class MediaDaSala{
    static void main() {
        System.out.println();
        System.out.println("-----Média da Turma-----");
        System.out.println();
        // 3 alunos e 4 provas
        float[][] notas = new float[3][4];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = (float)(Math.random() * 10);
                System.out.printf("%.2f  ", notas[i][j]);
            }
            System.out.println();
        }
        float soma = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                soma = soma + notas[i][j];
            }
        }
        System.out.printf("Soma das notas totais: %.3f", soma);

        int quantNotas = notas.length * notas[0].length;
        System.out.printf("\nA média da turma é %.2f", soma / quantNotas);

        //Média do aluno - linha
        float mediaAluno = 0;

        System.out.println();
        System.out.println("\nMédia dos alunos seria: ");

        for (int i = 0; i < notas.length; i++) {
            float somaAluno = 0;
            for (int j = 0; j < notas[i].length; j++) {
                somaAluno = somaAluno + notas[i][j];
            }
            mediaAluno = somaAluno / notas[i].length;
            System.out.printf("Aluno "+(i + 1)+"ª %.2f  ", mediaAluno);
        }
        // média por prova - coluna
        float mediaProva = 0;
        for (int j = 0; j < notas[0].length; j++) {
            float SomaNota = 0;
            for (int i = 0; i < notas.length; i++) {
                SomaNota = SomaNota + notas[i][j];
            }
            mediaProva = SomaNota / notas.length;
            System.out.printf("\nMédia das notas: %.2f", mediaProva);
        }
    }
}