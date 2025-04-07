package roteiro2.parte3;
import java.util.Scanner;

public class Programa04 {
    public static void calculaNotaWhile () {
        Scanner input = new Scanner(System.in);

        int count = 0;
        while (count < 5) {
            System.out.println("Informe uma nota: ");
            int nota = input.nextInt();

            if (nota >= 7 ) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            count++;
        }
        input.close();
    }
}
