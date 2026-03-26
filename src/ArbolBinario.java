public class ArbolBinario {
    Nodo raiz;

    // Metodo insertar (aun no implementado)
    /*
    public Nodo insertar(Nodo raiz, int valor) {
        if (raiz == null) {
            return new Nodo(valor);
        }

        if (valor < raiz.valor) {
            raiz.izquierdo = insertar(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertar(raiz.derecho, valor);
        }

        return raiz;
    }
    */

    // Metodo inorden (aun no implementado)
    /*
    public void inorden(Nodo raiz) {
        if (raiz != null) {
            inorden(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            inorden(raiz.derecho);
        }
    }
    */

    // Metodo buscar (aun no implementado)
    /*
    public boolean buscar(Nodo raiz, int valor) {
        if (raiz == null) {
            return false;
        }

        if (raiz.valor == valor) {
            return true;
        }

        if (valor < raiz.valor) {
            return buscar(raiz.izquierdo, valor);
        } else {
            return buscar(raiz.derecho, valor);
        }
    }
    */
}