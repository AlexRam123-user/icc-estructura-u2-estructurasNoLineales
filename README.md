# Estructuras de Datos No Lineales: Ejercicios de Árboles

Este proyecto contiene la implementación de varios ejercicios para practicar la lógica de programación con árboles en Java. Los ejercicios están organizados en diferentes paquetes y tienen un punto de entrada común en la clase `App` para facilitar su ejecución.

## Ejercicios Implementados

### Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)
**Descripción:**
- Implementa un algoritmo para insertar valores en un Árbol Binario de Búsqueda (BST).
- Un BST es un árbol binario donde:
  - El subárbol izquierdo de un nodo contiene valores menores que el nodo.
  - El subárbol derecho de un nodo contiene valores mayores que el nodo.

**Ejemplo:**
```plaintext
Input: [5, 3, 7, 2, 4, 6, 8]
Output:
      5
   3     7
 2  4  6  8
```
**Ubicación del código:**
`main.Ejercicio_01_insert`

### Ejercicio 02: Invertir un Árbol Binario
**Descripción:**
- Dada la raíz de un árbol binario, implementa un algoritmo que devuelva el árbol invertido.

**Ejemplo:**
```plaintext
Input:
      4
   2     7
 1  3  6  9

Output:
      4
   7     2
 9  6  3  1
```
**Ubicación del código:**
`main.Ejercicio_02_invert`

### Ejercicio 03: Listar Niveles en Listas Enlazadas
**Descripción:**
- Implementa un algoritmo que devuelva una lista enlazada con los nodos de cada nivel de un árbol binario.
- Si el árbol tiene N niveles, debes devolver N listas enlazadas.

**Ejemplo:**
```plaintext
Input:
      4
   2     7
 1  3  6  9

Output:
4
2 -> 7
1 -> 3 -> 6 -> 9
```
**Ubicación del código:**
`main.Ejercicio_03_listLevels`

### Ejercicio 04: Calcular la Profundidad Máxima
**Descripción:**
- Implementa un algoritmo que calcule la profundidad máxima de un árbol binario.

**Ejemplo:**
```plaintext
Input:
      4
   2     7
 1  3

Output: 3
```
**Ubicación del código:**
`main.Ejercicio_04_depth`

## Ejecución
La clase principal `App` contiene métodos para ejecutar cada ejercicio de forma independiente.

1. **Ejercicio 01:** Llama al método `runEjercicio01`.
2. **Ejercicio 02:** Llama al método `runEjercicio02`.
3. **Ejercicio 03:** Llama al método `runEjercicio03`.
4. **Ejercicio 04:** Llama al método `runEjercicio04`.

**Ejemplo de salida en consola:**
```plaintext
Ejecutando ejercicios de árboles...
Ejercicio 01: Insertar en un Árbol Binario de Búsqueda
├── 5
│   ├── 3
│   │   ├── 2
│   │   └── 4
│   └── 7
│       ├── 6
│       └── 8

Ejercicio 02: Invertir un Árbol Binario
├── 4
│   ├── 7
│   │   ├── 9
│   │   └── 6
│   └── 2
│       ├── 3
│       └── 1

Ejercicio 04: Calcular la Profundidad Máxima
La profundidad máxima del árbol es: 3
```

## Requisitos
- **Lenguaje:** Java
- **Entorno de desarrollo:** Cualquier IDE que soporte Java (Eclipse, IntelliJ IDEA, etc.)
- **Versión de Java:** JDK 8 o superior

## Autor
Desarrollado como parte de la práctica de laboratorio para la materia Estructuras de Datos.
