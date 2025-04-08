package roteiro3.parte1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Programa12 {

    public static void calculaSalario() {
        Scanner input = new Scanner(System.in);
        double salarioBase, gratificacao, imposto, salarioLiquido;
        NumberFormat formatador = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));

        System.out.println("Olá, vou calcular o seu salário liquido!");
        System.out.print("Digite seu salário base: ");
        salarioBase = input.nextDouble();

        gratificacao = calcularPorcentagem(salarioBase, 0.05);
        imposto = calcularPorcentagem(salarioBase, 0.07);
        salarioLiquido = salarioBase + gratificacao - imposto;

        System.out.println("Sua gratificação é: " + formatador.format(gratificacao));
        System.out.println("O imposto é de: " + formatador.format(imposto));
        System.out.println("Seu salário líquido é: " + formatador.format(salarioLiquido));
    }

    public static double calcularPorcentagem (double salarioBase, double porcentagem) {
        return  salarioBase * porcentagem;
    }
}
