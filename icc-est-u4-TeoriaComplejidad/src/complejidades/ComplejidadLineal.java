package complejidades;
/**
 * **Definición:** El tiempo de ejecución crece de forma proporcional al tamaño de la entrada.
 * **Explicación:** Si los datos se duplican, el tiempo que tarda el algoritmo también se duplica.
 * **Ejemplo:** Leer una lista de nombres uno por uno hasta el final.
 */
public class ComplejidadLineal {
    public static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void ejemplo() {
        int[] datos = {1, 2, 3, 4, 5};
        System.out.println("O(n) - Imprimiendo el arreglo:");
        imprimirArreglo(datos);
    }
}
