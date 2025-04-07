package roteiro2.parte4;
import java.util.Scanner;

public class Programa08 {
    public static void armazenaNotasArray () {
        Scanner input = new Scanner(System.in);

        System.out.println("olá, vamos armazenar suas notas em um array.");

        double[] vetorNotas = new double[5];

        for (int count = 0; count < 5; count++) {
            System.out.print("Informe uma nota: ");
            double nota = input.nextInt();

            vetorNotas[count] = nota;
        }

        System.out.println("Notas armazenadas:");
        for (double nota : vetorNotas) {
            System.out.println("Nota: " + nota);
        }
        input.close();
    }
}
