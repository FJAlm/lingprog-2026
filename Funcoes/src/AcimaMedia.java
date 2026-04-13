import java.util.Scanner;

public class AcimaMedia {
    static void main(String[] args) {
        System.out.println();
        System.out.println("SALÁRIO DOS COLABORADES AUTOZONE");
        System.out.println();

        Scanner info = new Scanner(System.in);

        float[] salarial = new float[5];
        String[] nomes = new String[5];

        NamesAndSalary(info, salarial, nomes);

        float media = MediaSalary(salarial);
        System.out.println("A média total dos salários: "+media);
        System.out.println();

        CondicaoMedia(salarial, media);
    }

    public static void NamesAndSalary (Scanner info, float salarial[], String nomes[]){
        for (int i = 0; i < salarial.length; i++) {
            System.out.print("Informe o nome completo do "+(i + 1)+"º funcionário: ");
            nomes[i] = info.nextLine();

            System.out.print("\nInforme o salário deste funcionário: R$");
            salarial[i] = info.nextFloat();
            info.nextLine();

            System.out.println();
        }
    }

    public static float MediaSalary (float salarial[]){
        float media = 0;
        float sum = 0;
        for (int i = 0; i < salarial.length; i++) {
            sum = sum + salarial[i];
        }
        System.out.println("A soma de todos os salários foi de R$"+sum);

        media = sum / salarial.length;

       return media;
        }

        public static void CondicaoMedia (float salarial[], float media){
        int acima = 0;
        int abaixo = 0;
        int igual = 0;

        for (int i = 0; i < salarial.length; i++) {
            if (media > salarial[i]){
                acima++;
            }
            else if ( media < salarial[i]) {
                abaixo++;
            }
            else {
                igual++;
            }
        }
        System.out.println("Acima da média: "+acima);
        System.out.println("Abaixo da média: "+abaixo);
        System.out.println("Igual à média: "+igual);
    }
}
