/* Escribe un programa que calcule el área de un rectángulo. */

package lecturaDeDatos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        var base = new Scanner(System.in);
        System.out.println("ingrese la base del rectangulo: ");
        int baseIngresada = Integer.parseInt(base.nextLine());

        var altura = new Scanner(System.in);
        System.out.println("ingrese la altura del rectangulo: ");
        int alturaIngresada = Integer.parseInt(altura.nextLine());

        System.out.println("el area del cuadrado es: "+ (baseIngresada*alturaIngresada));
    }
}
