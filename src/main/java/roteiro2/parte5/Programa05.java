package roteiro2.parte5;
import java.util.Scanner;

public class Programa05 {
    public static void testandoFor () {
        Scanner input = new Scanner(System.in);

        for (int cont = 0; cont < 5; cont++) {
            System.out.println("Informe uma nota: ");
            int nota = input.nextInt();

            if (nota >= 7 ) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
