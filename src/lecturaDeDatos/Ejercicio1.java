/* Realiza un programa que pida dos números y que luego muestre el resultado de su multiplicación. */

package lecturaDeDatos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        var numero1 = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int numeroIngresado = Integer.parseInt(numero1.nextLine());

        var numero2 = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int numeroIngresado2 = Integer.parseInt(numero2.nextLine());

        System.out.println("resultado: "+ (numeroIngresado * numeroIngresado2));
    }
}