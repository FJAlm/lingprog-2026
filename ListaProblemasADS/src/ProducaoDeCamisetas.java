import java.util.Scanner;

public class ProducaoDeCamisetas {
    static void main() {
        // 1º calcular o custo total de produção de camisas c(x) = 15 * x + 200
        // x = num. de camisetas fabricadas c(X) = custo total 15 = custo de produção 200 = custo fixo da fábrica
        // cada camiseta é vendida por 35 reais
        // 2º receita = r(X) = 35 * x
        // 3º lucro = l(X) = r(X) - c(x)
        System.out.println("---------------------------------------");
        System.out.println("Planilha da Indústria Shirt");
        System.out.println("Custo total para a fabricação das camisetas");
        System.out.println();
        System.out.print("Informa a quantidade de camisetas produzidas neste mês: ");

        Scanner dados = new Scanner(System.in);
        int x = dados.nextInt();
        double custoTotal = 15 * x + 200; //1º passo
        System.out.println();
        System.out.println();
        System.out.println("--->O custo total de produção desse mês foi de: R$ "+custoTotal);

        System.out.println("------------------------------------------------");
        System.out.println();
        double receita = 35 * x; //2º passo
        System.out.println("Receita da empresa: R$"+receita);

        System.out.println("------------------------------------------------");
        System.out.println();
        double lucro = receita - custoTotal; //3º passo

        System.out.println("Com os gastos da fábrica, o lucro foi R$"+lucro);
            if (lucro > 0 && lucro <= 8000){
                System.out.println("Sem lucro!");
            }
            else if (lucro > 3000){
                System.out.println("A empresa finalizou o mês positivo, com lucro.");
            }
            else {
                System.out.println("Prejuízo");
        }
        System.out.println("Segue o resumo: CUSTO = R$"+custoTotal+"; RECEITA = R$"+receita+"; LUCRO = R$"+lucro);
    }
}