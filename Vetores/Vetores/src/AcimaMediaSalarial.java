import java.util.Scanner;

/*Armazene o salário de 5 funcionários em um vetor. Calcule a média salarial e, em seguida,
mostre quantos funcionários ganham exatamente a média, quantos ganham acima e quantos ganham abaixo.
 */
public class AcimaMediaSalarial {
    static void main() {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Salário dos nossos colaboradores");
        System.out.println();
        System.out.println("Digite o salário dos nossos melhores funcionários");
        System.out.println("Ao todo são 5 pessoas :)");
        System.out.println();

        float[] vetSal = new float[5];
        Scanner info = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.print("R$");
            vetSal[i] = info.nextFloat();
        }
        float media = 0;
        float soma = 0;
        System.out.println("=========================================");
        System.out.println();

        for (int i = 0; i < 5; i++){
            soma = soma + vetSal[i];
            media = soma / 5;
        }
        System.out.println("A média salarial é de R$"+media);

        int acima = 0;
        int menor = 0;
        int igual= 0;

        for (int i = 0; i < 5; i++){
            if (vetSal[i] < media){
                menor = menor +1 ;
            }
            else if (vetSal[i] == media) {
                igual = igual + 1;
            }
            else {
                acima = acima + 1;
            }
        }
        System.out.println("Os funcionários que recebem abaixo da média são: "+menor);
        System.out.println("Os funcionários que recebem exatamente a média são: "+igual);
        System.out.println("Os funcionários que recebem acima da média são: "+acima);
    }
}

