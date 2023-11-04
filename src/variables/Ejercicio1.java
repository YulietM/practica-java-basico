/* Escribe un programa en el que se declaren las variables enteras x e y. Asignales los valores 144 y 999 respectivamente.
A continuación, muestra por pantalla el valor de cada variable, la suma, la resta, la división y la multiplicación. */

package variables;
public class Ejercicio1 {
    public static void main(String[] args) {
        int x = 144;
        int y = 999;

        double division =  x / y;
        System.out.println("Valor de x: "+ x +"\n" +"Valor de y: "+ y);
        System.out.println("La suma de x + y: "+ (x + y));
        System.out.println("La resta de x - y: "+ (x - y));
        System.out.println("La division de x / y: "+ division);
        System.out.println("La multiplicacion de x * y: "+ (x*y));

    }

}
