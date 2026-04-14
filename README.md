# Tarea 9 — Listas Enlazadas en Java

**Universidad San Carlos de Guatemala**  
Facultad de Ingeniería — Escuela de Ingeniería en Ciencias y Sistemas  
Introducción a la Programación y Computación 1
202504933

---

## Descripción

Implementación de un sistema de gestión de estudiantes usando **Listas Enlazadas propias** en Java, sin usar ninguna clase de `java.util`.

## Estructura del proyecto

```
Tarea9/
├── src/main/java/tarea9/
│   ├── NodoEstudiante.java          # Nodo para lista simple
│   ├── ListaEstudiantes.java        # Lista simplemente enlazada
│   ├── NodoEstudianteDoble.java     # Nodo para lista doble
│   ├── ListaDobleEstudiantes.java   # Lista doblemente enlazada
│   └── Main.java                   # Pruebas de todos los métodos
├── analisis.txt                     # Análisis Big-O y comparaciones
└── pom.xml
```

## Contenido

**Parte 1 — Lista Simplemente Enlazada**  
`agregarInicio`, `agregarFinal`, `eliminarPorCarnet`, `buscarPorCarnet`, `imprimirLista`, `obtenerPromedio`, `obtenerMejorNota`

**Parte 2 — Lista Doblemente Enlazada**  
`agregarInicio`, `agregarFinal`, `eliminarPorCarnet`, `imprimirAdelante`, `imprimirAtras`, `insertarOrdenado`

**Parte 3 — Análisis**  
Complejidad Big-O, comparación Array vs Lista Enlazada, y diagrama del Heap.

## Cómo ejecutar

Abrir como proyecto en NetBeans y ejecutar `Main.java`.
