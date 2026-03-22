import java.util.Scanner;

/*
Faça um programa que leia um nome de usuário e uma senha. O programa não
deve aceitar a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações até que sejam diferentes.
 */
public class UsuarioSenha {
    static void main() {
        System.out.println();
        System.out.println("============================");
        System.out.println("Para cadastrar a sua conta, por favor, insira o nome de usuário e senha");
        System.out.println("Não podem ser iguais os dados");
        System.out.print("Nome: ");

        Scanner dados = new Scanner(System.in);
        String name = dados.next();

        System.out.print("Senha: ");

        String answer = dados.next();
        System.out.println("-------------------------");

        while (name.equalsIgnoreCase(answer)) {
            System.out.println();
            System.out.println("ERRO. Digite novamente os dados");
            System.out.println("-------------");
            System.out.print("Nome: ");
            name = dados.next();

            System.out.print("Senha:");
            answer = dados.next();
        }
        System.out.println();
        System.out.println("Cadastro feito com sucesso.");
        System.out.println("Bem vindo usuário "+name);
    }
}
