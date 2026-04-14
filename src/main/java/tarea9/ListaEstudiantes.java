package tarea9;

public class ListaEstudiantes {
    private NodoEstudiante head;

    public ListaEstudiantes() {
        this.head = null;
    }

    public void agregarInicio(String carnet, String nombre, double nota) {
        NodoEstudiante nuevo = new NodoEstudiante(carnet, nombre, nota);
        nuevo.siguiente = head;
        head = nuevo;
    }

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

    public void eliminarPorCarnet(String carnet) {
        if (head == null) {
            System.out.println("Lista vacia.");
            return;
        }
        if (head.carnet.equals(carnet)) {
            head = head.siguiente;
            return;
        }
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

    public void imprimirLista() {
        if (head == null) {
            System.out.println("Lista vacia.");
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
