package roteiro2.parte4;
import java.util.Scanner;

public class Programa04 {
    public static void testandoCondicionais () {
        Scanner input = new Scanner(System.in);

        int cont = 0;
        while (cont < 5) {
            System.out.println("Informe uma nota: ");
            int nota = input.nextInt();

            if (nota >= 7 ) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            cont++;
        }
    }
}
