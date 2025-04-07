package roteiro2.parte4;

import java.util.Arrays;
import java.util.Scanner;

public class Programa09 {
    public static void armazenaNotasValidasArray () {
        Scanner input = new Scanner(System.in);

        System.out.println("olá, vou armazenar suas notas validas em um array.");

        double[] vetorNotas = new double[5];


        int count = 0;

        while (count < 5) {
            System.out.print("Informe uma nota: ");
            double nota = input.nextDouble();

            if (nota >= 0 && nota <= 10) {
                vetorNotas[count] = nota;
                count++;
            } else {
                System.out.println("Nota inválida, ela tem que está entre 0 e 10.");
            }
        }
        System.out.println(Arrays.toString(vetorNotas));
        input.close();
    }
}
