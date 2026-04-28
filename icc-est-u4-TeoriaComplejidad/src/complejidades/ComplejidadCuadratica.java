package complejidades;
/**
 * **Definición:** El tiempo de ejecución aumenta de acuerdo al cuadrado del tamaño de la entrada.
 * **Explicación:** Es común en algoritmos que usan bucles anidados; un pequeño aumento en datos genera un gran aumento en tiempo.
 * **Ejemplo:** Comparar cada elemento de una lista con todos los demás de la misma lista.
 */
public class ComplejidadCuadratica {
    public static void pares(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }

    public static void ejemplo() {
        int[] datos = {1, 2}; 
        System.out.println("O(n^2) - Generando pares:");
        pares(datos);
    }
}
