package roteiro10.parte3;

import javax.swing.*;
import java.awt.*;

public class JanelaBorderlayout_v1 extends JFrame {
    private JPanel pnCabecalho;
    private JPanel pnRodape;
    private JPanel pnEsquerda;
    private JPanel pnDireita;
    private JPanel pnCentro;

    public JanelaBorderlayout_v1 () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela BorderLayout");

        this.setLayout(new BorderLayout());
        this.iniciarComponentes();
        this.pack();
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        pnCabecalho = new JPanel();
        pnRodape = new JPanel();
        pnEsquerda = new JPanel();
        pnDireita = new JPanel();
        pnCentro = new JPanel();

        // Definindo cores para os painéis
        pnCabecalho.setBackground(Color.RED);
        pnRodape.setBackground(Color.BLUE);
        pnEsquerda.setBackground(Color.YELLOW);
        pnDireita.setBackground(Color.GRAY);
        pnCentro.setBackground(Color.GREEN);

        // Adicionando os painéis ao layout BorderLayout
        this.add(pnCabecalho, BorderLayout.PAGE_START);
        this.add(pnRodape, BorderLayout.PAGE_END);
        this.add(pnEsquerda, BorderLayout.LINE_START);
        this.add(pnDireita, BorderLayout.LINE_END);
        this.add(pnCentro, BorderLayout.CENTER);
    }
}
