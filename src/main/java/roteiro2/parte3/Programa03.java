package roteiro2.parte3;
import javax.swing.JOptionPane;

public class Programa03 {
    public static void testandoInterface() {

        String nome = JOptionPane.showInputDialog("Informe seu nome: ");
        JOptionPane.showMessageDialog(null, "Nome informado: " + nome);

        String strIdade = JOptionPane.showInputDialog("Digite sua idade: ");
        int idade = Integer.parseInt(strIdade);
        JOptionPane.showMessageDialog(null, "Idade informada: " + idade);

    }
}
