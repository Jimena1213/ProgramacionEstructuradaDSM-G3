package ciclos;

import javax.swing.*;

public class numerosPrimos {
    public static void main(String[] args) {
        double numero =5;
        double cont = 0;


        int i = 1;
        while (i <= numero ){
            if(numero %2 ==0 ){
                cont++;

            }
            i++;
        }
        if(cont>2){
            JOptionPane.showMessageDialog(null, "No es primo");
        }else{
            JOptionPane.showMessageDialog(null, "Es primo");
        }
    }
}
