/* Escribe un programa que muestre tu horario de clase. */

package salidaDatosxConsola;
public class Ejercicio4 {
    public static void main(String[] args) {

        System.out.println("----------------------------HORARIO DE CLASES--------------------------------");

        System.out.printf("%s      %-8s      %-8s      %-11s      %-8s      %-8s\n",  "08.15", "Sistemas", "Prog", "Sistemas", "Prog", "Prog");
        System.out.printf("%s      %-8s      %-8s      %-11s      %-8s      %-8s\n",  "10.00", "redes", "Prog", "Sistemas", "Prog", "Prog");
        System.out.printf("%s      %-8s      %-8s      %-11s      %-8s      %-8s\n",  "06.15", "Sistemas", "Prog", "fisica", "Prog", "Prog");
        System.out.printf("%s      %-8s      %-8s      %-11s      %-8s      %-8s\n",  "08.00", "ingles", "Prog", "estadistica", "Prog", "Prog");
        System.out.printf("%s      %-8s      %-8s      %-11s      %-8s      %-8s\n",  "12.15", "poo", "Prog", "operativos", "Prog", "Prog");
    }
    /*
    %s es un marcador de posición para una cadena. (stablece cómo se formatearán los valores )
    -8s indica que la cadena debe ocupar un ancho de 8 caracteres, y se alinea a la izquierda (el signo -).
    \n al final indica un salto de línea. */
}
