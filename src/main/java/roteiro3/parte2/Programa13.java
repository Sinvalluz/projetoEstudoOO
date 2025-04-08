package roteiro3.parte2;
import java.util.Scanner;


public class Programa13 {
    public static void operacoesBasicas () {
        Scanner input = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Olá, vou calcular qualquer operação basica que você pedir.");
        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Informe a operação (+, -, *, /): ");
        String operacao = input.next();

        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();

        switch (operacao) {
            case ("+"): soma(numero1, numero2);
                break;
            case ("-"): subtracao(numero1, numero2);
                break;
            case ("*"): multiplicacao(numero1, numero2);
                break;
            case ("/"): divisao(numero1, numero2);
                break;
            default:
        }
    }
    public static void soma(double numero1, double numero2) {
        System.out.println("Resultado : " + (numero1 + numero2) );
    }
    public static void subtracao(double numero1, double numero2) {
        System.out.println("Resultado : " + (numero1 - numero2) );
    }
    public static void multiplicacao(double numero1, double numero2) {
        System.out.println("Resultado : " + (numero1 * numero2) );
    }
    public static void divisao(double numero1, double numero2) {
        System.out.println("Resultado : " + (numero1 / numero2) );
    }
}
