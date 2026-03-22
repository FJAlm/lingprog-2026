import java.util.Scanner;

/*
O usuário informa um valor de depósito inicial e a taxa de juros mensal (ex: 0.5%).
O programa deve usar um for para mostrar o saldo da conta mês a mês durante os 12 meses do primeiro ano.
 */
public class Juros {
    static void main() {
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Sistema do banco MASTER");
        System.out.println("Iremos acessar a sua conta");
        System.out.println();
        System.out.println("Digite o seu nome: ");

        Scanner entrada = new Scanner(System.in);
        String name = entrada.next();

        System.out.println("Olá, "+name);

        System.out.println();
        System.out.println("Digite o valor que deseja depositar que iremos fazer uma simulação de 12 meses: ");
        float capital = entrada.nextFloat();
        System.out.println("============================");

        for (int meses= 1; meses <= 12; meses++){
            float montante = capital + (capital * 0.05f * meses);
            System.out.println(meses+"º mês com o capital "+capital+" terá um valor de "+montante);
        }
    }
}
