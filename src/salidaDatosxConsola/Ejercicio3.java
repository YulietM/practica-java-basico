
/* Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su correspondiente traducción al castellano.
Las palabras deben estar distribuidas en dos columnas y alineadas a la izquierda. */

package salidaDatosxConsola;
public class Ejercicio3 {
    public static void main(String[] args) {
        String palabras[] = new String[10];
        String traducciones[] = new String[10];

        palabras[0] = "hi";
        palabras[1] = "am, Yuliet";
        palabras[2] = "am, developer";
        palabras[3] = "for that i must";
        palabras[4] = "study";
        palabras[5] = "review";
        palabras[6] = "and put";
        palabras[7] = "in practice";
        palabras[8] = "the learned";
        palabras[9] = " and repeat";

        traducciones[0] = "hola";
        traducciones[1] = "soy, Yuliet";
        traducciones[2] = "soy, desarrolladora";
        traducciones[3] = "para eso debo";
        traducciones[4] = "estudiar";
        traducciones[5] = "revisar";
        traducciones[6] = "y poner";
        traducciones[7] = "en practica";
        traducciones[8] = "lo aprendido";
        traducciones[9] = "y repetir";

        imprimir(palabras , traducciones);

    }
    public static void imprimir(Object matriz[], Object matriz2[]){
        for(int ren = 0; ren <matriz.length; ren++){
            System.out.println(ren + " "+matriz[ren] +" -> "+ matriz2[ren]);
        }
    }
}