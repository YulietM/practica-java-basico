/* Modifica el programa anterior añadiendo colores. */

package salidaDatosxConsola;
public class Ejercicio5 {

    public static void main(String[] args) {
         // coodigo ANSI para colores
        String reset = "\u001B[0m";
        String rojo = "\u001B[31m";
        String verde = "\u001B[32m";
        String amarillo = "\u001B[33m";
        String azul = "\u001B[34m";
        String morado = "\u001B[35m";

        System.out.println("----------------------------HORARIO DE CLASES--------------------------------");

        System.out.printf("%s      %-8s      %-8s      %-20s      %-8s      %-8s\n",  "08.15", rojo +"Sistemas"+ reset, "Prog", rojo +"automatas"+ reset, "Prog", "Prog");
        System.out.printf("%s      %-8s      %-8s      %-11s      %-8s      %-8s\n",  "10.00", "redes", "Prog", "Sistemas", "Prog", verde + "Prog"+ reset);
        System.out.printf("%s      %-8s      %-18s     %-11s      %-8s      %-8s\n",  amarillo + "06.15"+ reset, "Sistemas", amarillo + "Prog"+ reset, "fisica", "Prog", "Prog"+ reset);
        System.out.printf("%s      %-18s     %-8s      %-11s      %-8s      %-8s\n",  "08.00", azul + "ingles"+ reset, "Prog", "estadistica", "Prog", azul + "Prog"+ reset);
        System.out.printf("%s      %-8s      %-8s      %-20s      %-8s      %-8s\n",  morado +"12.15"+ reset, "poo", "Prog", morado +"operativos"+ reset, "Prog", morado +"Prog"+ reset);

        // % los marcadores de posicion (%s se usa para una cadena, %d para un número entero, %f para un número de punto flotante)
        /* El formato de color se controla mediante códigos ANSI,
        \u001B[0m es un código que restablece el formato a sus valores predeterminados.
        Al agregarlo al final de la cadena de texto coloreado, garantizas que cualquier texto posterior se muestre en el formato predeterminado,
        evitando que otros elementos en la consola queden afectados por el cambio de color.
         */

    }
}
