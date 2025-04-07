package roteiro2.parte3;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa07 {
    public static void calculaMedia () {
        Scanner input = new Scanner(System.in);

        double nota = 0;
        int contadorDeNotas = 0;
        double somadasNotas = 0;
        ArrayList<Double> notasAprovadas = new ArrayList<>();
        ArrayList<Double> notasReprovadas = new ArrayList<>();
        DecimalFormat formatador = new DecimalFormat("0.#");

        System.out.println("Olá, vou calcular a média das suas notas.");
        System.out.println("Digite -1 para encerrar o programa.");

        while (true) {
            System.out.print("Informe uma nota: ");
            nota = input.nextDouble();

            if (nota == -1) break;
            if (nota < 0 || nota > 10 ) {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
            }else {
                if (nota >= 7 ) {
                    notasAprovadas.add(nota);
                } else {
                    notasReprovadas.add(nota);
                }
                somadasNotas += nota;
                contadorDeNotas++;
            }
        }
        double media = somadasNotas / contadorDeNotas;
        System.out.println("""
                
                Programa finalizado
                """);
        System.out.println("A média das suas notas são: " + formatador.format(media));
        System.out.println("A suas notas de aprovação foram: " + notasAprovadas);
        System.out.println("A suas notas de reprovação foram: " + notasReprovadas);
        input.close();
    }
}
