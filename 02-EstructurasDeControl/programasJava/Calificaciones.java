import javax.swing.*;

public class Calificaciones {
    public static void main(String[] args) {
        // Declaracion de variables
        double calif1 = 0.0, calif2 = 0.0, calif3 = 0.0;
        double promedio = 0.0;

        // Entrada de los datos
        calif1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 1: "));
        calif1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 2: "));
        calif1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 3: "));

        // Operacion - Calcular el promedio
        promedio = (calif1 + calif2 +  calif3 )/ 3;

        if(promedio >= 7.0){
            JOptionPane.showMessageDialog(null,"Aprobado");
        }// Cierra el if





    }// Cierra el main


}// Cierra la clase