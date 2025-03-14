package controller;

import model.Divisivel;
import view.DivisivelView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisivelController {
    Divisivel model;
    DivisivelView view;
    public DivisivelController(Divisivel Model, DivisivelView View){
        model = Model;
        view = View;
        view.setBotaoBehavior(new BotaoBehavior());
    }

    class BotaoBehavior implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String textNumero1 = view.getNum1();
            String textNumero2 = view.getNum2();
            double numero1 = Double.parseDouble(textNumero1);
            double numero2 = Double.parseDouble(textNumero2);
            model.setNumeros(numero1, numero2);
            model.verifica();
            String resposta = model.getResposta();
            view.setVisor(resposta);
        }
    }
}
