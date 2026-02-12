package mx.edu.uttt.estructurasdecontrol.ejerciciosvideos;

import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        int numero=0;

        Scanner leer = new Scanner(System.in);

        int numeroSecreto = 12;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Intenta adivinar el numero secreto: ");
            numero = leer.nextInt();

        }if (numero == numeroSecreto){
            System.out.println("Felicidades! Lograste adinivar el numero secreto");
        }else{
            System.out.println("Lo siento, no adivinaste!");
        }


    }
}
