package tarea9;

public class ListaEstudiantes {
    private NodoEstudiante head;

    public ListaEstudiantes() {
        this.head = null;
    }

    // Inserta al inicio de la lista
    public void agregarInicio(String carnet, String nombre, double nota) {
        NodoEstudiante nuevo = new NodoEstudiante(carnet, nombre, nota);
        nuevo.siguiente = head;
        head = nuevo;
    }

    // Inserta al final de la lista
    public void agregarFinal(String carnet, String nombre, double nota) {
        NodoEstudiante nuevo = new NodoEstudiante(carnet, nombre, nota);
        if (head == null) {
            head = nuevo;
            return;
        }
        NodoEstudiante actual = head;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }

    // Elimina el nodo con ese carnet
    public void eliminarPorCarnet(String carnet) {
        if (head == null) {
            System.out.println("Lista vacía.");
            return;
        }
        // Caso: el nodo a eliminar es el head
        if (head.carnet.equals(carnet)) {
            head = head.siguiente;
            return;
        }
        // Buscar el nodo anterior al que se va a eliminar
        NodoEstudiante actual = head;
        while (actual.siguiente != null) {
            if (actual.siguiente.carnet.equals(carnet)) {
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("Carnet no encontrado: " + carnet);
    }

    // Retorna el nodo o null si no existe
    public NodoEstudiante buscarPorCarnet(String carnet) {
        NodoEstudiante actual = head;
        while (actual != null) {
            if (actual.carnet.equals(carnet)) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // Imprime todos los estudiantes en orden
    public void imprimirLista() {
        if (head == null) {
            System.out.println("Lista vacía.");
            return;
        }
        NodoEstudiante actual = head;
        while (actual != null) {
            System.out.println("Carnet: " + actual.carnet
                    + " | Nombre: " + actual.nombre
                    + " | Nota: " + actual.nota);
            actual = actual.siguiente;
        }
    }

    // Retorna el promedio de notas
    public double obtenerPromedio() {
        if (head == null) return 0.0;
        double suma = 0;
        int cantidad = 0;
        NodoEstudiante actual = head;
        while (actual != null) {
            suma += actual.nota;
            cantidad++;
            actual = actual.siguiente;
        }
        return suma / cantidad;
    }

    // Retorna el estudiante con mayor nota
    public NodoEstudiante obtenerMejorNota() {
        if (head == null) return null;
        NodoEstudiante mejor = head;
        NodoEstudiante actual = head.siguiente;
        while (actual != null) {
            if (actual.nota > mejor.nota) {
                mejor = actual;
            }
            actual = actual.siguiente;
        }
        return mejor;
    }
}
