package roteiro1.parte2;

public class Programa02 {
    public static void calcularSalario (double salarioBase, int horasExtras, int horasTrabalhadas) {
        double valorPorHora = salarioBase / horasTrabalhadas;
        double salarioTotal = salarioBase + (valorPorHora * horasExtras);

        System.out.println("Salário Base: R$ " + String.format("%.2f",salarioBase));
        System.out.println("Quantidade de horas extras: " + horasExtras);
        System.out.println("Salário total: R$ " + String.format("%.2f" , salarioTotal));
    }
}
