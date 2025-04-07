package roteiro2.parte3;

import java.util.Scanner;

public class Programa06 {
    public static void calculaNotaFlag () {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe uma nota: ");
        int nota = input.nextInt();

        while (nota > -1) {
            if (nota >= 7 ) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            System.out.println("Informe uma nota: ");
            nota = input.nextInt();
        }
        System.out.println("Nota inválida");
        input.close();
}}




