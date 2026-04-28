package complejidades;
/**
 * **Definición:** El tiempo de ejecución aumenta de forma muy lenta mientras la entrada crece.
 * **Explicación:** El algoritmo divide el problema a la mitad en cada paso, reduciendo drásticamente el trabajo.
 * **Ejemplo:** Buscar un número en una lista ordenada (Búsqueda Binaria).

 */
public class ComplejidadLogaritmica {
    public static int busquedaBinaria(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void ejemplo() {
        int[] datos = {10, 20, 30, 40, 50};
        System.out.println("O(log n) - Buscando el 30: Indice " + busquedaBinaria(datos, 30));
    }
}
