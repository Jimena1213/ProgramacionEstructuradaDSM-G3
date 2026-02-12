package mx.edu.uttt.estructurasdecontrol.ejerciciosvideos;

import java.util.Scanner;

public class numerosEnteros {
    public static void main(String[] args) {
        int numero=0;
        Scanner leer= new Scanner(System.in);
        for (int i = 1; i <= 2; i++) {
        System.out.println("Ingrese un numero: ");
        numero = leer.nextInt();


            if(i % 2 == 0){

                System.out.println(numero + " el numero es par");
            }else {

                System.out.println(numero +" el numero es impar");
            }

        }
    }
}
