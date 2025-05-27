package roteiro10.parte3;

import javax.swing.*;
import java.awt.*;

public class JanelaBorderlayout_v2 extends JFrame {
    private JPanel pnCabecalho;
    private JPanel pnRodape;
    private JPanel pnEsquerda;
    private JPanel pnDireita;
    private JPanel pnCentro;

    public JanelaBorderlayout_v2 () {
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
        pnCentro = new JPanel();
        pnEsquerda = new JPanel();
        pnDireita = new JPanel();


        this.iniciarCabecalho();
        this.iniciarRodape();
        this.inciarCentro();

        this.add(pnCabecalho, BorderLayout.PAGE_START);
        this.add(pnRodape, BorderLayout.PAGE_END);
        this.add(pnEsquerda, BorderLayout.LINE_START);
        this.add(pnDireita, BorderLayout.LINE_END);
        this.add(pnCentro, BorderLayout.CENTER);
    }

    public void iniciarCabecalho() {
        this.pnCabecalho.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.pnCabecalho.add(new JLabel("Cabeçalho"));
        this.pnCabecalho.add(new JTextField(10));

        this.pnCabecalho.add(new JLabel("Observações"));
        this.pnCabecalho.add(new JTextField(25));
    }

    public void iniciarRodape() {
        this.pnRodape.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.pnRodape.add(new JButton("Botão 04"));
        this.pnRodape.add(new JButton("Botão 05"));
    }

    public void inciarCentro() {
        this.pnCentro.setLayout(new GridLayout(3 , 2));

        this.pnCentro.add(new JLabel("Matricula"));
        this.pnCentro.add(new JTextField());

        this.pnCentro.add(new JLabel("Nome"));
        this.pnCentro.add(new JTextField());

        this.pnCentro.add(new JLabel("Idade"));
        this.pnCentro.add(new JTextField());
    }
}
