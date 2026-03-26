// Clase que representa el Árbol Binario
public class ArbolBinario {

    // Nodo raíz del árbol
    Nodo raiz;

    // Método para insertar un valor en el árbol binario
    public Nodo insertar(Nodo raiz, int valor) {

        // Si el árbol está vacío, se crea un nuevo nodo
        if (raiz == null) {
            return new Nodo(valor);
        }

        // Si el valor es menor, se inserta en el subárbol izquierdo
        if (valor < raiz.valor) {
            raiz.izquierdo = insertar(raiz.izquierdo, valor);

            // Si el valor es mayor, se inserta en el subárbol derecho
        } else if (valor > raiz.valor) {
            raiz.derecho = insertar(raiz.derecho, valor);
        }

        // Retorna la raíz actualizada
        return raiz;
    }

    // Método de recorrido Inorden (Izquierda - Raíz - Derecha)
    public void inorden(Nodo raiz) {

        // Verifica que el nodo no sea nulo
        if (raiz != null) {

            // Primero recorre el subárbol izquierdo
            inorden(raiz.izquierdo);

            // Luego muestra el valor del nodo actual
            System.out.print(raiz.valor + " ");

            // Finalmente recorre el subárbol derecho
            inorden(raiz.derecho);
        }
    }

    // Método para buscar un valor en el árbol
    public boolean buscar(Nodo raiz, int valor) {

        // Si el nodo es nulo, el valor no existe
        if (raiz == null) {
            return false;
        }

        // Si el valor coincide con el nodo actual
        if (raiz.valor == valor) {
            return true;
        }

        // Si el valor es menor, buscar en el lado izquierdo
        if (valor < raiz.valor) {
            return buscar(raiz.izquierdo, valor);

            // Si el valor es mayor, buscar en el lado derecho
        } else {
            return buscar(raiz.derecho, valor);
        }
    }
}