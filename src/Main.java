import java.util.Scanner;

// Clase principal donde se ejecuta el programa
public class Main {
    public static void main(String[] args) {

        // Scanner para leer datos del usuario
        Scanner sc = new Scanner(System.in);

        // Se crea el árbol binario
        ArbolBinario arbol = new ArbolBinario();

        int opcion, valor;

        // Menú interactivo
        do {
            System.out.println("\n--- MENÚ ÁRBOL BINARIO ---");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar inorden");
            System.out.println("3. Buscar número");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                // Opción para insertar un número en el árbol
                case 1:
                    System.out.print("Ingrese número: ");
                    valor = sc.nextInt();
                    arbol.raiz = arbol.insertar(arbol.raiz, valor);
                    System.out.println("Número insertado correctamente.");
                    break;

                // Opción para mostrar recorrido inorden
                case 2:
                    System.out.print("Recorrido inorden: ");
                    arbol.inorden(arbol.raiz);
                    System.out.println();
                    break;

                // Opción para buscar un número
                case 3:
                    System.out.print("Número a buscar: ");
                    valor = sc.nextInt();

                    if (arbol.buscar(arbol.raiz, valor)) {
                        System.out.println("Número encontrado.");
                    } else {
                        System.out.println("Número no existe.");
                    }
                    break;

                // Salir del programa
                case 4:
                    System.out.println("Saliendo...");
                    break;

                // Opción inválida
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        // Cerrar scanner
        sc.close();
    }
}}