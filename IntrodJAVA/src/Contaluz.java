import java.util.Scanner;

public class Contaluz {
    static void main() {

        System.out.println("-------------------------------");
        Scanner dados = new Scanner(System.in); System.out.println("Digite o seu nome: ");
        String name = dados.nextLine();
        System.out.println("Informa o consumo do mês anterior ");
        float ConsAnterior = dados.nextFloat();

        System.out.println("");
        System.out.println("Informa o consumo do mês atual");
        float ConsAtual = dados.nextFloat();
        System.out.println("--------------------------------");
        System.out.println("");

        float Month = ConsAtual - ConsAnterior; // para saber o consumo daquele momento
        float bruto = Month * 0.60f;
        System.out.println("O consumo mensal é de: "+Month+" kWh.");
        System.out.println("O valor bruto é de R$ "+bruto);
        System.out.println("---------------------------------");

        if (Month <= 100){
            System.out.println("Bandeira VERDE. Sem acréscimos.");
        }
        else if (Month >= 101 && Month <= 200){
            System.out.println("Bandeira AMARARELA");
            bruto = bruto + 2;
        }
        else if (Month >= 201 && Month <= 300){
            System.out.println("Bandeira VERMELHA");
            bruto = bruto + 5;
        }
        else {
            System.out.println("Bandeira PRETA");
            bruto = bruto + 10;
        }
        System.out.println("");
        System.out.println(name+", o seu consumo foi de "+Month+" kWh. Com um valor total R$ "+bruto);
    }
}

