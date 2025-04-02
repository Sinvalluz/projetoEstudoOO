package roteiro2.parte7;

import java.util.Scanner;

public class Programa07 {
    public static void calcularMedia () {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe uma nota: ");
        double nota = input.nextInt();
        int contadorDeNotas = 0;
        double somadasNotas = 0;

        while (nota > -1) {
            if (nota >= 7 ) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            somadasNotas += nota;
            contadorDeNotas++;

            System.out.println("Informe uma nota: ");
            nota = input.nextInt();

        }
        double media = somadasNotas / contadorDeNotas;
        System.out.println("A média das suas notas são: " + media);
    }
}
