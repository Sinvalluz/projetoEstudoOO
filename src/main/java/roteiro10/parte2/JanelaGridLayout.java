package roteiro10.parte2;

import javax.swing.*;
import java.awt.*;

public class JanelaGridLayout extends JFrame {
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;

    public JanelaGridLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela GridLayout");
        this.setLayout(new GridLayout(2, 3)); // 2 linhas, 3 colunas

        this.iniciarComponentes();

        this.pack();
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");
        btn03 = new JButton("Botão 03");
        btn04 = new JButton("Botão 04");
        btn05 = new JButton("Botão 05");
        btn06 = new JButton("Botão 06");

        this.add(this.btn01);
        this.add(this.btn02);
        this.add(this.btn03);
        this.add(this.btn04);
        this.add(this.btn05);
        this.add(this.btn06);
    }
}
