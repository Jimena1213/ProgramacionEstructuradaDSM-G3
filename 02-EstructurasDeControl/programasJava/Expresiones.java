
import javax.swing.JOptionPane;

public class Expresiones {
    public static void main(String[] args) {
        //Declaracion de variables
        /*
        *En esta parte del codigo se van
        * a declarar varios tipos de variables
         */
        int suma;
        int resta;
        int multi, div, mod, expresion, area;
        double resultado = 0.0, potencia;
        boolean valor = true, valor2 = false;
        float f1 = (float)8.9, f2 = 10.3f;
        double d1 = 12;

        //Definir una constante
        final double PI = 3.1416;
        String salida = "";

        //Expresiones aritmeticas
        suma = 3 + 5;
        resta = 10 -12;
        multi = 24 * 23;
        div = 10 / 2;
        mod = 10 % 2;
        potencia = Math.pow(4,2);

        salida = "===== Expresiones Aritmeticos =====" +
        "\nLa suma es: "+ suma +
                "\nLa resta es: "+ resta +
                "\nLa multiplicacion es: "+ multi +
                "\nLa division es: "+ div +
                "\nLa modulo es: "+ mod +
                "\nLa potencia es: "+ potencia
        ;

        JOptionPane.showMessageDialog(null, salida);


    }
}