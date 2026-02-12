package mx.edu.uttt.estructurasdecontrol.ejerciciosvideos;

import java.util.Scanner;

public class numeroFactorial {
    public static void main(String[] args) {
        long fact=1;

        Scanner leer = new Scanner(System.in);


        System.out.println("Ingrese un numero entero positivo: ");
        int num = leer.nextInt();

        if(num>=0) {
            for (int i = 1; i <= num; i++) {
                fact *= i;

            }
            System.out.println("La factorial de "+num+ " es: " + fact);
        }else{
            System.out.println("El numero no es valido");
        }




    }
}
