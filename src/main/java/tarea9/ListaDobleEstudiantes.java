package tarea9;

public class ListaDobleEstudiantes {
    private NodoEstudianteDoble head;
    private NodoEstudianteDoble tail;

    public ListaDobleEstudiantes() {
        this.head = null;
        this.tail = null;
    }

    public void agregarInicio(String carnet, String nombre, double nota) {
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        if (head == null) {
            head = nuevo;
            tail = nuevo;
            return;
        }
        nuevo.siguiente = head;
        head.anterior = nuevo;
        head = nuevo;
    }

    public void agregarFinal(String carnet, String nombre, double nota) {
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        if (tail == null) {
            head = nuevo;
            tail = nuevo;
            return;
        }
        tail.siguiente = nuevo;
        nuevo.anterior = tail;
        tail = nuevo;
    }

    public void eliminarPorCarnet(String carnet) {
        if (head == null) {
            System.out.println("Lista vacia.");
            return;
        }
        NodoEstudianteDoble actual = head;
        while (actual != null) {
            if (actual.carnet.equals(carnet)) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    head = actual.siguiente;
                }
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    tail = actual.anterior;
                }
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("Carnet no encontrado: " + carnet);
    }

    public void imprimirAdelante() {
        if (head == null) {
            System.out.println("Lista vacia.");
            return;
        }
        NodoEstudianteDoble actual = head;
        while (actual != null) {
            System.out.println("Carnet: " + actual.carnet
                    + " | Nombre: " + actual.nombre
                    + " | Nota: " + actual.nota);
            actual = actual.siguiente;
        }
    }

    public void imprimirAtras() {
        if (tail == null) {
            System.out.println("Lista vacia.");
            return;
        }
        NodoEstudianteDoble actual = tail;
        while (actual != null) {
            System.out.println("Carnet: " + actual.carnet
                    + " | Nombre: " + actual.nombre
                    + " | Nota: " + actual.nota);
            actual = actual.anterior;
        }
    }

    public void insertarOrdenado(String carnet, String nombre, double nota) {
        if (head == null || nota <= head.nota) {
            agregarInicio(carnet, nombre, nota);
            return;
        }
        if (nota >= tail.nota) {
            agregarFinal(carnet, nombre, nota);
            return;
        }
        NodoEstudianteDoble actual = head;
        while (actual != null && actual.nota < nota) {
            actual = actual.siguiente;
        }
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        NodoEstudianteDoble previo = actual.anterior;
        previo.siguiente = nuevo;
        nuevo.anterior = previo;
        nuevo.siguiente = actual;
        actual.anterior = nuevo;
    }
}
