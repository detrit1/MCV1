package model;

import view.DivisivelView;

public class Divisivel {
    double num1 = 0, num2 = 0, resultado = 0;
    String resposta;

    public Divisivel(){

    }

    public void setNumeros(double Num1, double Num2){
        this.num1 = Num1;
        this.num2 = Num2;
    }

    public void verifica(){
        resultado = num1 % num2;
        if(resultado == 0){
            resposta = "é divisível! :)";
        }
        else{
            resposta = "não é divisível! :(";
        }
    }

    public String getResposta(){
        return resposta;
    }
}
