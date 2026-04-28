package complejidades;

    /**
 * **Definición:** El tiempo de ejecución no depende del tamaño de la entrada.
 * **Explicación:** El algoritmo siempre tarda lo mismo.
 * 1. Big O (O): O(1)
 * 2. Omega (Ω): Ω(1)
 * 3. Theta (Θ): Θ(1)
 */
public class ComplejidadConstante {
    public static int obtenerPrimero(int[] arr) {
        if (arr.length == 0) return -1;
        return arr[0];
    }

    public static void ejemplo() {
        int[] datos = {10, 20, 30, 40, 50};
        System.out.println("O(1) - Ejemplo de acceso directo: " + obtenerPrimero(datos));
    }
}
