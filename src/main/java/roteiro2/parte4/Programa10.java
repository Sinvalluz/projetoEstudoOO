package roteiro2.parte4;

import java.util.Scanner;
import java.util.Random;

public class Programa10 {
    public static void numeroSecreto () {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 1;

        System.out.print("Bem vindo ao jogo do número secreto, digite um número de 1 a 100: ");
        int palpite = input.nextInt();

        while (palpite != numeroSecreto) {

            if (palpite < 0 || palpite > 100) {
                System.out.print("O número secreto deve ser válido, digite um número de 1 a 100: ");
            } else {
                if (palpite > numeroSecreto) {
                System.out.print("O número secreto é menor que " + palpite + " digite um numero de 1 a 100: ");
                } else {
                    System.out.print("O número secreto é maior que " + palpite + " digite um numero de 1 a 100: ");
                }
            }

            palpite = input.nextInt();
            tentativas++;
        }

        System.out.println("Parabéns, você acertou o número secreto " + numeroSecreto + " em " + tentativas +  (tentativas == 1 ? " tentativa." : " tentativas."));
        input.close();
    }
}
