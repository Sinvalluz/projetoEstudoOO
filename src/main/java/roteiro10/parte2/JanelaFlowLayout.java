package roteiro10.parte2;

import javax.swing.*;
import java.awt.*;

public class JanelaFlowLayout extends JFrame {
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;

    public JanelaFlowLayout () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("janela FlowLayout");
        this.setLayout(new FlowLayout());

        this.iniciarComponentes();

        this.pack();
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        this.btn01 = new JButton("Botão 01");
        this.btn02 = new JButton("Botão 02");
        this.btn03 = new JButton("Botão 03");
        this.btn04 = new JButton("Botão 04");
        this.btn05 = new JButton("Botão 05");
        this.btn06 = new JButton("Botão 06");

        this.add(this.btn01);
        this.add(this.btn02);
        this.add(this.btn03);
        this.add(this.btn04);
        this.add(this.btn05);
        this.add(this.btn06);
    }
}
