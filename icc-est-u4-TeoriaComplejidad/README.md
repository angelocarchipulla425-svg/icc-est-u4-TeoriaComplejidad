# INFORME 
## Teoría De La Complejidad – Java

![alt text](image.png)

**Universidad Politécnica Salesiana**

**Carrera:** Ingeniería en Ciencias de la Computación

**Asignatura:** Estructura de Datos

**Proyecto:** La Teoría de la Complejidad

**Grupo 3 conformado por:**

José Andrés Astudillo Pacheco - Luis Fernando Caguana Suquinagua

Angelo Miguel Carchipulla Pulla - José Mateo Gallegos Criollo

**Curso:** 2do Ciclo-Grupo 3

**Fecha:** Miércoles 29 de abril del 2026

--- ---

## 1. ¿Qué es la Teoría de la Complejidad?
Rama que mide que tanta dificultad tiene un problema para resolverlo en una computadora, tomando en cuenta el tiempo y memoria que se ocupe cuando los datos de entrada se hacen muy grandes.

## 2. Eficiencia de algoritmos
Un algoritmo es eficiente y rentable si se usan los mínimos recursos posibles.
### Coste temporal
Siendo lo que tarda en ejecutarse (Segundos, minutos, ciclos de un reloj).
### Coste espacial
La memoria RAM o disco ocupado al ejecutarse.
## 3. Factores de tiempo de ejecución
Lo que un programa necesita para que sea rápido.
### Factores propios
El diseño del algoritmo (lógica), estructura de datos elegida para organizar, gestionar y almacenar información en la memoria de la computadora para que se optimice el rendimiento del mismo.
### Factores circunstanciales
La potencia del procesador (hardware).

El lenguaje de programación (java, C++, python, etc).

La carga de otros programas en la PC.
### Análisis teórico
Usar matemáticas para predecir el comportamiento sin ejecutar el código es fundamental.
### Análisis experimental
Correr el programa con cronómetro a la mano. Depende de la máquina donde se pruebe.
## 4. Notación Big O(1) - Constante
### ¿Qué es?
Es una cota superior; nos dice el "techo"(el tiempo de ejecución del algoritmo nunca superará esa tasa de crecimiento,salvo por un factor constante) de cuánto tardará en el peor escenario.
### Mejor caso
El escenario ideal (ej: buscar un nombre y que sea el primero de la lista).
### Peor caso
El escenario más lento posible. Es el que más nos importa para evitar desastres.
### Caso promedio
Lo que sucede normalmente en el día a día, los datos no suelen estar perfectamente ordenados.
### Big O, Ω, Θ
(Big O): El límite superior ("No tardará más que esto").

(Omega): El límite inferior ("Tardará al menos esto").

(Theta): Cuando el límite superior e inferior son iguales (el comportamiento es exacto).
## 5. Notación Big O(n) - Lineal
### ¿Qué es? 

El tiempo crece en proporción directa al número de datos. Si tienes el doble de datos, tarda el doble de tiempo.

### Mejor caso:

El elemento buscado es el primero (se vuelve O(1)).

### Peor caso:

El elemento es el último o no existe (tienes que revisar los n elementos).

### Caso promedio:
Revisar la mitad de los elementos (n/2, que en complejidad sigue siendo O(n)).

### Big O, Omega, Theta:
(Big O): El límite superior ("No tardará más que esto").

(Omega): El límite inferior ("Tardará al menos esto").

(Theta): Cuando el límite superior e inferior son iguales (el comportamiento es exacto).

## 6. Notación Big O(n²) - Cuadrática
### ¿Qué es? 

El tiempo se dispara (siendo algo de bucles dentro de bucles).

### Mejor caso:

En algunos ordenamientos básicos, si la lista ya está ordenada, el "piso" podría ser Omega(n).

### Peor caso:

Cuando los datos están en el orden inverso y hay que hacer todas las comparaciones posibles.

### Caso promedio:
Para algoritmos como el de "Burbuja" simple, el comportamiento promedio suele ser Theta(n^2) porque la estructura de los bucles no cambia.

### Big O, Omega, Theta:
(Big O): El límite superior ("No tardará más que esto").

(Omega): El límite inferior ("Tardará al menos esto").

(Theta): Cuando el límite superior e inferior son iguales (el comportamiento es exacto).

## 7. Notación Big O(log n) - Logarítmica
### ¿Qué es? 

El algoritmo divide el problema a la mitad en cada paso (como buscar en un diccionario).

### Mejor caso:

si encuentras lo que buscas en la primera división (en el centro).

### Peor caso:

cuando tienes que reducir la lista hasta que quede un solo elemento.

### Caso promedio:
Se considera Theta(log n) porque, estadísticamente, la eficiencia es tan alta que casi siempre termina en un número muy pequeño de pasos.

### Big O, Omega, Theta:
(Big O): El límite superior ("No tardará más que esto").

(Omega): El límite inferior ("Tardará al menos esto").

(Theta): Cuando el límite superior e inferior son iguales (el comportamiento es exacto).

## 8. Notación Big O(n log n) - O(n log n)
### ¿Qué es? 

Es el estándar de eficiencia para ordenar grandes volúmenes de datos de forma profesional.

### Mejor caso:

Algunos algoritmos inteligentes bajan a Omega(n) si detectan que la lista ya está casi lista.

### Peor caso:

Se garantiza un O(n log n) como techo, lo cual es mucho mejor que el cuadrático.

### Caso promedio:
Los algoritmos de ordenamiento modernos (como Merge Sort) son Theta(n log n) porque su lógica de "dividir y conquistar" se ejecuta siempre de la misma manera eficiente.

### Big O, Omega, Theta:
 
(Big O): El límite superior ("No tardará más que esto").

(Omega): El límite inferior ("Tardará al menos esto").

(Theta): Cuando el límite superior e inferior son iguales (el comportamiento es exacto).

## 8. Conclusiones

## ¿Qué complejidad es más costosa y por qué ## 

En términos de rendimiento, la complejidad más costosa es el orden de crecimiento factorial (O(n!)) debido a que
realiza millones o inclusive billones de posibles combinaciones/permutaciones, obligando al procesador a trabajar
más y por ende, a que su sistema término (hardware) pueda estar en peligro. Sin embargo, hay que considerar que,
al ser la más costosa implica peligros o alertas, pero estas fuera de casos extremos no causan un daño al hardware
aunque pueden generar fallos o congelamiento del programa, especialmente si los datos se van almacenando en la memoria.


## ¿Qué se aprendió del análisis? ## 

El tema de la teoría de la complejidad va más allá de la optimización para algoritmos con el fin de resolver un problema
puesto que evalúa nuestra capacidad de poder mantener un razonamiento ordenado y sostenible en términos de recursos
computacionales (finitos). Lo primordial en esta teoría es la eficiencia, que conscientiza al ingeniero
sobre el costo de pasos a realizar (temporal) y el espacio máximo en memoria que ocupan dichos pasos (espacial)
No solo se trata de que un programa pueda funcionar sin errores o ambiguedades, se trata igualmente de no tener problemas
con el hardware (CPU y/o memoria RAM).


El orden (O) de crecimiento es importante en esta última idea, pues es una guía la cual indica cómo direccionaremos
la solución a un algoritmo con cantidades abismales de posibilidades y casos(lo que significa un crecimiento inevitable
de datos) desde una sola repetición de alguna tarea (O(1)) hasta billones de posibles combinaciones (O(n!)), con
la idea del mejor, peor y caso promedio, podemos estar preparados ante el contexto de un algoritmo exigente.
Pero sobre todo, entendimos que la optimización lógica crece mejor que la potencia/velocidad del hardware.

## ¿Qué les sorprendió más al ver el código ##
Al principio creíamos que la notación Big O se escribía de forma explícita en un archivo de java. Sin embargo, este orden puede verse
reflejado en la estructura mismo del algoritmo, en los bucles for y no hace falta escribir la notación como tal. Cabe resaltar que
también nos asombró la forma en la que un crecimiento como O (log n) reduce la complejidad a su mitad.

## Programar es aplicar números ##
Tomando en cuenta la notación O, se puede sintetizar que, la programación aparte de saber crear una secuencia de pasos con el
fin de resolver un objetivo se trata de apoyarnos en el lenguaje de funciones matemáticas (cuadráticas, logarítmicas, exponenciales)
para poder predecir que tan exigente será un algoritmo, todo esto sin importar qué tan avanzada sea una computadora o la generación
de sus componentes, un orden O(2^n) siempre será una solución no optimizada a un problema grande.