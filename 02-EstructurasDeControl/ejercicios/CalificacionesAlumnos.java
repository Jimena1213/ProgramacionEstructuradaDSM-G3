package mx.edu.uttt.estructurasdecontrol.ejerciciosvideos;

import java.util.Scanner;

public class CalificacionesAlumnos {
    public static void main(String[] args) {
        double cal;
        double suma=0;
        int contador=0, aprobados=0, reprobados=0;


        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una calificacion: ");
         cal = leer.nextDouble();

        while(cal !=-1){
            suma+=cal;
            contador++;

            if (cal>=7){
                aprobados++;
            }else if (cal<=6){
                reprobados++;
            }
            cal = leer.nextDouble();
        }

            System.out.println("El promedio es: " + (suma / contador));
            System.out.println("El total de alumnos aprobados es: " + aprobados);
            System.out.println("El total de alumnos reprobados es: " + reprobados);




    }
}
