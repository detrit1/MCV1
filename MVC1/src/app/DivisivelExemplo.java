package app;

import model.Divisivel;
import view.DivisivelView;
import controller.DivisivelController;

import javax.swing.text.View;

public class DivisivelExemplo {
    public static void main(String[] args){
        Divisivel divisivel = new Divisivel();
        DivisivelView divView = new DivisivelView();
        DivisivelController divController = new DivisivelController(divisivel, divView);
    }
}
