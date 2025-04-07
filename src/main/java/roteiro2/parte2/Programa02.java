package roteiro2.parte2;
import java.util.Scanner;

public class Programa02 {
    public static void praticandoScanner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao app, digite o seu nome: ");
        String nome = input.nextLine();

        System.out.println("Diga sua idade: ");
        int idade = input.nextInt();

        System.out.println("Bem vindo " + nome + ", você tem " + idade + " anos"  );
        input.close();
    }



}
