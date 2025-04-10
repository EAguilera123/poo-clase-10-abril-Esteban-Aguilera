import java.util.Scanner;
import java.util.Random;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static void mostrarMenu() {
        System.out.println("1. Crear Matriz");
        System.out.println("2. Llenar Matriz");
        System.out.println("3. Mostrar fila");
        System.out.println("4. Verificar si la matriz es cero");
        System.out.println("5. Salir");
        preguntarOpcion();
        validarOpcion();
    }

    private static void validarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> crearMatriz(int preguntarFilas, int preguntarColumnas);
            case 2 -> llenarMatriz();
            case 3 -> mostrarFila(int preguntarFila);
            case 4 -> matrizCero();
            case 5 -> System.out.println("saliendo...");
            default -> System.out.println("Opción invalida");
    }

    static void menu() {
            do {
                mostrarMenu();
            } while (true);
        }
    }

    int[][] crearMatriz(int filas, int columnas) {
           int[][] matriz = new int [filas][columnas];
    return matriz;
    }

    static boolean validarDimensiones(int filas, int columnas) {
        if (filas <= 0 && columnas <= 0) {
            return true;
        } else {
            return false;
        }
    }

    static int[][] llenarMatriz(int matriz[][]) {

        Random rand = new Random();

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    matriz[i][j] = rand.nextInt(10);

                }
            }
        return matriz;
    }

    static void mostrarFila(int matriz[][], int fila) {

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[fila -1][i]);
        }
    }

    static boolean matrizCero(int matriz[][]) {
        int numero = 0;
        int cero = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                numero++;
                if (matriz[i][j] == 0) {
                    cero++;
                }
            }
        }
        if (numero/2 < cero) {
            System.out.println("la matriz es cero");
        } else {
            System.out.println("la matriz no es cero");
        }
    }

    static int preguntarFila() {
        System.out.println("ingrese la fila que quiere ver");
        int fila = scanner.nextInt();
                return fila;
    }
    static int preguntarOpcion() {
        System.out.println("ingrese la opcion que quiere usar");
        int opcion = scanner.nextInt();
        return opcion;
    }
    static int preguntarFilas() {
        System.out.println("ingrese la cantidad de filas de la matriz");
        int filas = scanner.nextInt();
        return filas;
    }
    static int preguntarColumnas() {
        System.out.println("ingrese la cantidad de Columnas de la matriz");
        int columnas = scanner.nextInt();
        return columnas;
    }

}