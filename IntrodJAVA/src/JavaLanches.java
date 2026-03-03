import java.util.Scanner;

public class JavaLanches {
    static void main() {
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("Bem vindo à lanchonete do Javas!");
        System.out.println("Por gentileza, faça um pedido. Tecla a opção que desejar do cardápio.");
        System.out.println("------------------------------------------");
        System.out.println("101 - Cachorro quente R$10,00");
        System.out.println("102 - X-Burguer R$15,00");
        System.out.println("103 - X-Salada R$12,00");
        System.out.println("");
        System.out.println("Seleciona o código do pedido:");

        Scanner menu = new Scanner(System.in);
        int option = menu.nextInt();
        float valor = 0;
        switch (option){
            case 101:
                System.out.println("Você selecionou a opção Cachorro Quente");
                valor = 10;
                break;

            case 102:
                System.out.println("Você selecionou a opção X-Burguer");
                valor = 15;

                break;

            case 103:
                System.out.println("Você selecionou a opção X-Salada");
                valor = 12;
                break;

            default:
                System.out.println("Opção inválida. Por favor, digite novamente o código");
                return;

        }
        System.out.println("-----------------------------------------");
        System.out.println("Por gentileza, informa a sua idade para saber se há desconto disponível");
        int years = menu.nextInt();
        float valorf = 0;
        if (years < 12){
            System.out.println("Desconto de 50% - MENU KIDS");
            valorf = valor - (valor * 50f/100f);
        }
        else if (years >= 12 && years <= 60){
            System.out.println("Sem desconto!");
            valorf = valor;
        }
        else {
            System.out.println("Desconto de 30% - Melhor idade");
            valorf = valor - (valor * 30f/100f);
        }
        System.out.println("");
        System.out.println("-------------");
        System.out.println("O valor final do seu pedido é de R$"+valorf);
    }
}
