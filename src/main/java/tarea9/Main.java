package tarea9;

public class Main {
    public static void main(String[] args) {

        // ============================================================
        //  PARTE 1 - LISTA SIMPLEMENTE ENLAZADA
        // ============================================================
        System.out.println("========================================");
        System.out.println("       LISTA SIMPLEMENTE ENLAZADA      ");
        System.out.println("========================================");

        ListaEstudiantes lista = new ListaEstudiantes();
        lista.agregarInicio("202300001", "Ana", 85.0);
        lista.agregarInicio("202300002", "Luis", 90.0);
        lista.agregarFinal("202300003", "Maria", 78.0);
        lista.agregarFinal("202300004", "Sofia", 92.5);

        System.out.println("\n-- Lista completa --");
        lista.imprimirLista();

        System.out.println("\n-- Buscar carnet 202300003 --");
        NodoEstudiante encontrado = lista.buscarPorCarnet("202300003");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.nombre + " | Nota: " + encontrado.nota);
        }

        System.out.println("\n-- Buscar carnet inexistente 999 --");
        NodoEstudiante noExiste = lista.buscarPorCarnet("999");
        System.out.println("Resultado: " + noExiste);  // null

        System.out.println("\n-- Promedio de notas --");
        System.out.println("Promedio: " + lista.obtenerPromedio());

        System.out.println("\n-- Mejor nota --");
        NodoEstudiante mejor = lista.obtenerMejorNota();
        System.out.println("Mejor: " + mejor.nombre + " con " + mejor.nota);

        System.out.println("\n-- Eliminar 202300001 (Ana) --");
        lista.eliminarPorCarnet("202300001");
        lista.imprimirLista();

        System.out.println("\n-- Eliminar head (202300002 Luis) --");
        lista.eliminarPorCarnet("202300002");
        lista.imprimirLista();

        System.out.println("\n-- Eliminar tail (202300004 Sofia) --");
        lista.eliminarPorCarnet("202300004");
        lista.imprimirLista();

        System.out.println("\n-- Eliminar único elemento (202300003 Maria) --");
        lista.eliminarPorCarnet("202300003");
        lista.imprimirLista();

        System.out.println("\n-- Intentar eliminar de lista vacía --");
        lista.eliminarPorCarnet("202300001");

        // ============================================================
        //  PARTE 2 - LISTA DOBLEMENTE ENLAZADA
        // ============================================================
        System.out.println("\n========================================");
        System.out.println("       LISTA DOBLEMENTE ENLAZADA       ");
        System.out.println("========================================");

        ListaDobleEstudiantes doble = new ListaDobleEstudiantes();
        doble.insertarOrdenado("202300010", "Carlos",  72.0);
        doble.insertarOrdenado("202300011", "Sofia",   95.0);
        doble.insertarOrdenado("202300012", "Pedro",   80.0);
        doble.insertarOrdenado("202300013", "Laura",   65.0);
        doble.insertarOrdenado("202300014", "Roberto", 88.0);

        System.out.println("\n-- Imprimir adelante (HEAD -> TAIL, orden ascendente por nota) --");
        doble.imprimirAdelante();

        System.out.println("\n-- Imprimir atrás (TAIL -> HEAD) --");
        doble.imprimirAtras();

        System.out.println("\n-- Eliminar nodo del medio (Pedro 80.0) --");
        doble.eliminarPorCarnet("202300012");
        doble.imprimirAdelante();

        System.out.println("\n-- Eliminar head (Laura 65.0) --");
        doble.eliminarPorCarnet("202300013");
        doble.imprimirAdelante();

        System.out.println("\n-- Eliminar tail (Sofia 95.0) --");
        doble.eliminarPorCarnet("202300011");
        doble.imprimirAdelante();

        System.out.println("\n-- agrgarInicio y agregarFinal directos --");
        doble.agregarInicio("202300020", "Nuevo Primero", 10.0);
        doble.agregarFinal("202300021",  "Nuevo Último",  99.0);
        doble.imprimirAdelante();
    }
}
