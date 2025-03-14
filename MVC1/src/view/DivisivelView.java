package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class DivisivelView extends JFrame {
    JTextField TextNum1, TextNum2;
    JLabel visor;
    JButton botao;

    public DivisivelView(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        TextNum1 = new JTextField(8);
        add(TextNum1);
        JLabel operator = new JLabel(" é divisível por ");
        add(operator);
        TextNum2 = new JTextField(8);
        add(TextNum2);
        visor = new JLabel(" ");
        add(visor);
        botao = new JButton("verifica");
        add(botao);
        pack();
        setVisible(true);
    }

    public String getNum1(){
        return TextNum1.getText();
    }

    public String getNum2(){
        return TextNum2.getText();
    }

    public void setBotaoBehavior(ActionListener botaoBehavior){
        botao.addActionListener(botaoBehavior);
    }

    public void setVisor(String result){
        visor.setText(result);
    }
}
