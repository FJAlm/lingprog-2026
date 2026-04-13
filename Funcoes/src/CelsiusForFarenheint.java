import java.util.Scanner;

public class CelsiusForFarenheint {
    static void main() {
        System.out.println();
        System.out.println("****CELSIUS P/ FARENHEINT****");
        System.out.println();
        Scanner temp = new Scanner(System.in);

        System.out.println("Informe a tempetura em ºC ");
        float celsius = temp.nextFloat();

        System.out.print("\nA tempetura em Farenheint é: "+ConvertTemp(celsius)+"ºF");
    }

    public static float ConvertTemp(float celsius) {
        return ((celsius * 1.8f) + 32);
    }
}