package mx.edu.uttt.estructurasdecontrol.ejerciciosvideos;

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        int numeros, mayor=0, menor=0;
        Scanner leer = new Scanner(System.in);

        for (int i = 1; i < 10; i++) {
            System.out.println("Ingresa un numero (entero): ");
            numeros = leer.nextInt();

            if (i == 1) {   // El primer número inicializa mayor y menor
                mayor = numeros;
                menor = numeros;
            } else {
                if (numeros > mayor) {
                    mayor = numeros;
                }
                if (numeros < menor) {
                    menor = numeros;
                }
            }
        }
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
    }
}
