import java.util.Scanner;

public class IMC {
    static void main() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Iremos calcular o seu IMC. Por gentileza, peço que informa alguns dados solicitados:");
        Scanner info = new Scanner(System.in);
        System.out.println("Por gentileza, digite o seu nome");
        String name = info.nextLine();
        System.out.println("Digite a sua idade");
        int years = info.nextInt();
        System.out.println("Informa o seu SEXO:");
        System.out.println("M - Masculino / F - Feminino");
        char sexo = info.next().charAt(0);
        switch (sexo){
            case 'm':
                System.out.println("Seu sexo é Masculino");
                break;

            case 'f':
                System.out.println("Seu sexo é Feminino");
                break;

            default:
                System.out.println("O caracter digitado está incorreto");
                return;
        }

        System.out.println("----------------------");
        System.out.println("");
        System.out.println("Digite o seu peso:");
        float peso = info.nextFloat();
        System.out.println("Digite a sua altura em metros:");
        float alt = info.nextFloat();
        System.out.println("-----------------------------");
        float imc = peso / (alt * alt);
        System.out.println(name+", o seu IMC é de "+imc);

        if (imc < 18.5){
            System.out.println("Abaixo do peso normal");
        }
        else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso ideal");
        }
        else  if (imc >= 25 && imc <= 29.9){
            System.out.println("Excesso de peso");
        }
        else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade 1");
        }
        else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade 2");
        }
        else {
            System.out.println("Obesidade 3");
        }
    }
}
