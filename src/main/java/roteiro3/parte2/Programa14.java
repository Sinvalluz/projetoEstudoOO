package roteiro3.parte2;

import java.util.Scanner;

public class Programa14 {
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
            case ("+"):
                System.out.println("Resultado: " + soma(numero1, numero2));
                break;
            case ("-"):
                System.out.println("Resultado: " + subtracao(numero1, numero2));
                break;
            case ("*"):
                System.out.println("Resultado: " + multiplicacao(numero1, numero2));
                break;
            case ("/"):
                System.out.println("Resultado: " + divisao(numero1, numero2));
                break;
            default:
        }
    }
    public static double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }
    public static double subtracao(double numero1, double numero2) {
        return numero1 - numero2;
    }
    public static double multiplicacao(double numero1, double numero2) {
        return numero1 * numero2;
    }
    public static double divisao(double numero1, double numero2) {
        return numero1 / numero2;
    }
}
