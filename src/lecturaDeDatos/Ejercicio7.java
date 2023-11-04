/* Escribe un programa que calcule el total de una factura a partir de la base imponible. */

package lecturaDeDatos;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        double iva = 1.19;
        double servicio = 0.1;

        var base = new Scanner(System.in);
        System.out.println("dijite la base de la factura: ");
        double baseIngresada = Integer.parseInt(base.nextLine());
        double neto = (baseIngresada/iva);
        double totalServicio = (baseIngresada*servicio);
        double totalIva = (baseIngresada - neto);

        System.out.println("Factura:");
        System.out.printf("%-15s %10.2f%n", "Total neto:", neto);
        System.out.printf("%-15s %10.2f%n", "Total IVA:", totalIva);
        System.out.printf("%-15s %10.2f%n", "Total servicio:", totalServicio);
        System.out.println("----------------------------");
        System.out.printf("%-15s %10.2f%n", "Total factura:", neto + totalIva + totalServicio);

    }
}
