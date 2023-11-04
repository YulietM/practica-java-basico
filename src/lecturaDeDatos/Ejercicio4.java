/* Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado. */

package lecturaDeDatos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        var numero1 = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int primerNumero = Integer.parseInt(numero1.nextLine());

        var numero2 = new Scanner(System.in);
        System.out.println("ingrese el segundo numero: ");
        int segundoNumero = Integer.parseInt(numero2.nextLine());

        System.out.println("la suma es = "+ (primerNumero + segundoNumero));
        System.out.println("la resta es = "+ (primerNumero - segundoNumero));
        System.out.println("la multiplicacion es = "+ (primerNumero * segundoNumero));
        System.out.println("la division es  = " + (primerNumero / segundoNumero));
    }
}
