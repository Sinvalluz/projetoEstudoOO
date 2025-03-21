package roteiro1.parte2;
import java.text.NumberFormat;
import java.util.Locale;

public class Programa02 {
    public static void calcularSalario (double salarioBase, int horasExtras, int horasTrabalhadas) {
        double valorPorHora = salarioBase / horasTrabalhadas;
        double salarioTotal = salarioBase + valorPorHora * horasExtras;


        NumberFormat formatador = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));

        System.out.println("Salário Base: " + formatador.format(salarioBase));
        System.out.println("Quantidade de horas extras: " + horasExtras);
        System.out.println("Salário total: " + formatador.format(salarioTotal));
    }
}
