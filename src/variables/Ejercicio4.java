/* Realiza un conversor de euros a pesos colombianos. */

package variables;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {

        double euro = 0.00023;
        double peso = 4283.30;

        var opcion = new Scanner(System.in);
        System.out.println("hola, bienvenido \n"+
                "por favor selecciones el tipo de operacion que desea realizar: \n"+
                "1 para convertir de euro a pesos \n"+
                "2 para convertir de pesos a euros ");
        int opcionIngresada = Integer.parseInt(opcion.nextLine());

        if(opcionIngresada == 1){
            var consola = new Scanner(System.in);
            System.out.println("ingrese el monto de Euros que desea convertir a pesos: ");
            int totalIngresado = Integer.parseInt(consola.nextLine());
            System.out.println("el valor total: "+totalIngresado * peso + " pesos");
        } else if (opcionIngresada == 2) {
            var consola = new Scanner(System.in);
            System.out.println("ingrese el monto de pesos que desea convertir a euros: ");
            int totalIngresado = Integer.parseInt(consola.nextLine());
            System.out.println("el valor total: "+totalIngresado * euro + " Euros");
        }else {
            System.out.println("la opcion no es valida, por favor intente nuevamente ");
        }

    }

}
