/* Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin IVA). La base imponible estará almacenada en una variable. */

package variables;
public class Ejercicio6 {
    public static void main(String[] args) {

        int IVA = 19;
        int baseImp = 520;
        int totalFac = ((baseImp*IVA/100)+baseImp);

        System.out.printf("El total sin IVA es: "+baseImp+".\n");
        System.out.printf("El total con IVA es: "+totalFac+".\n");

    }
}
