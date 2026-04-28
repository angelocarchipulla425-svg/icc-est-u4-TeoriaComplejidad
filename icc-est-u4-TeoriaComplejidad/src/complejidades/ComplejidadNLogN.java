package complejidades;
import java.util.Arrays;
/**
 * **Definición:** Es una combinación de crecimiento lineal y logarítmico.
 * **Explicación:** Es más eficiente que la cuadrática y es el estándar para ordenar grandes volúmenes de datos.
 * **Ejemplo:** Algoritmos de ordenamiento profesionales como Merge Sort.
 */
public class ComplejidadNLogN {
    public static void ordenarYBuscar(int[] arr, int target) {
        Arrays.sort(arr); 
        int index = ComplejidadLogaritmica.busquedaBinaria(arr, target);
        if (index != -1) System.out.println("Encontrado en indice: " + index);
        else System.out.println("No encontrado.");
    }

    public static void ejemplo() {
        int[] datos = {50, 10, 40, 20, 30};
        System.out.println("O(n log n) - Ordenando y buscando el 20:");
        ordenarYBuscar(datos, 20);
    }
}
