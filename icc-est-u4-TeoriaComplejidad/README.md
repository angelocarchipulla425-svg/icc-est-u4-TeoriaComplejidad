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