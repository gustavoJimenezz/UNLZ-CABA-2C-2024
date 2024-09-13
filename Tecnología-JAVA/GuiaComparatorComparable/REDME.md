# INTRODUCCIÓN

El objetivo de esta guía es familiarizarse con el uso de las interfaces `Comparator<T>` y `Comparable<T>`. Para esto, se debe realizar un programa secuencial en base a los puntos detallados a continuación.

## FASE 1: ARMADO DEL MODELO

Se requiere crear la clase `FechaFestiva`, con el objetivo de representar una fecha en particular.

### 1. ATRIBUTOS

- `dia` (int): Representa el número del día en el mes.
- `mes` (int): Representa el número del mes de la fecha.
- `nombre` (String): Es el nombre de la festividad.
- `fanatismo` (double): Un valor de -1 a 1 que indique cuánto les gusta esa festividad.


### 2. CREAR MÉTODOS BÁSICOS

Crear los siguientes métodos:
- Getters
- Setters
- `toString()`
- Constructor

### 3. MÉTODOS PARTICULARES

- `getDiasTotales()`: Método que retorna cuántos días pasaron desde el principio de año. (Asumiendo para el ejercicio que todos los meses tienen 30 días).

### 4. IMPLEMENTAR LA INTERFAZ

Se requiere implementar la interfaz `Comparable` y definir como comparación natural la cantidad de días totales.

## FASE 2: CREAR COMPARADORES
Crear un comparador para cada uno de los siguientes criterios:

1. **MES**
    Usar `if` anidados para llegar al resultado.

2. **DIA**
    Usando el metodo Integer.compare 

3. **NOMBRE**
    Utilizar el metodo compareTo de los String para poder armarlo

4. **FANATISMO**
    Usando el método Double.compare


## FASE 3: ARMAR EL MAIN

1. Crear una lista con 10 fechas o más (No es necesario ingresarlas por teclado). ¡Cuanto más desordenada, mejor!
2. Mostrar el listado completo de fechas.
3. Mostrar el listado ordenado por nombre.
4. Mostrar el listado ordenado por su ordenamiento natural.
5. Mostrar el listado ordenado por día.
6. Mostrar el listado de fechas por fanatismo de mayor a menor (reversed).
7. Mostrar el listado ordenado por mes.
8. Mostrar el listado ordenado por mes y día (Utilizando `andThen`).
9. **DIFICIL**: Mostrar el listado ordenado por fanatismo (ascendente) y nombre (descendente).



