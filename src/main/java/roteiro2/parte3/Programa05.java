package roteiro2.parte3;
import java.util.Scanner;

public class Programa05 {
    public static void calculaNotaFor () {
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
        input.close();
    }
}
