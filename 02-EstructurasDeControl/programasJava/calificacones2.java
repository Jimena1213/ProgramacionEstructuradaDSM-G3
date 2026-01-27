
import javax.swing.*;

public class Calificaciones2 {
    public static void main(String[] args) {
        //Declaracion de variables
        double calif1, calif2, calif3, promedio;
        final int NUM_CALIF = 3;

        // Entrada de datos

        calif1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cañificacion 1"));
        calif2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cañificacion 2"));
        calif3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cañificacion 3"));

    //Proceso: aclcula el promedio
        promedio =(calif1+ calif2 + calif3)/ NUM_CALIF;

        // Comparacion con una estructura selectiva doble
        if(promedio >= 7.0){
            JOptionPane.showMessageDialog(null, "Aprobado");
        }else {
            JOptionPane.showMessageDialog(null, "No aprobado");
        }
    
    }// Cierra el main
}//Cierra la clase
