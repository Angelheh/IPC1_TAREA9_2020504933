package tarea9;

public class NodoEstudiante {
    String carnet;
    String nombre;
    double nota;
    NodoEstudiante siguiente;

    public NodoEstudiante(String carnet, String nombre, double nota) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.nota = nota;
        this.siguiente = null;
    }
}
