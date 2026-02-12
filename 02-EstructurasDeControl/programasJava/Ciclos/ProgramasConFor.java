import javax.swing.JOptionPane;
/*
1. Calcular el promedio de un alumno que tiene
n calificaciones
en la materia de programacion
* */

import javax.swing.*;

public class ProgramasConFor {
    public static void main(String[] args) {
        String menu ="", opcion="";
        boolean sentinel = true;
        int n =0;
        double promedio = 0.0, calif= 0.0;


        //Crea cadena de Texto para las opciones del menu



        menu = "========== MENU DE PROGRAMAS  CON FOR=========="+
                "1)Calcular promedio 1\n" +
                "2)Opcion 2\n" +
                "3)Opcion 3\n" +
                "4)Salir 4\n" +
                "Elegir opcion: ";

        do{



            //Mostrar el menu
            opcion = JOptionPane.showInputDialog(menu);
            switch(opcion.toUpperCase()){
                case "1":
                case "A":
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de Calificaiones: "));
                    JOptionPane.showMessageDialog(null, "Opcion 1");
                    if(n > 0){
                    for (int i = 1; i <= n; i++) {
                        calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la califivavion " + i));
                        if (calif >= 0.0 && calif <= 10.0) {

                            promedio += calif; //promedio = promedio + calif;
                        } else {

                        }
                        JOptionPane.showMessageDialog(null, "La califcacion no es valida");

                        i--;
                    }
                    promedio/=n; // promedio = promedio / n;
                        JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);

                } else{
                        JOptionPane.showMessageDialog(null,"El numero de Calificaciones");
                }
                    break;
                case "2":
                case "B":
                    JOptionPane.showMessageDialog(null, "Opcion 2");
                    break;
                case "3":
                case "C":
                    JOptionPane.showMessageDialog(null, "Opcion 3");
                    break;

                case "4":
                case "D":
                    JOptionPane.showMessageDialog(null, "El programa ha terminado");
                    sentinel = false;

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");

            }

        }while(sentinel);
    }
}