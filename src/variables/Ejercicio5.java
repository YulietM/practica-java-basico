/* Realiza un conversor de pesos a euros. La cantidad en pesos que se quiere convertir deberá estar almacenada en una variable. */

package variables;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int totalIngresado = 200000;
        double euro = 0.00023;
        System.out.println("ingrese el monto de pesos que desea convertir a euros: ");
        System.out.println("el valor total: "+totalIngresado * euro + " Euros");
    }
}
