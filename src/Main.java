import java.util.Scanner;

public class Main {
    void mostrarMenu() {
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. Inversa");
        System.out.println("5. División");
        System.out.println("6. Salir");
        validarOpcion();
    }

    void validarOpcion(int opcion, Scanner sc) {
        switch (opcion) {
            case 1 -> operacionSuma();
            case 2 -> operacionResta();
            case 3 -> operacionMultiplicacion();
            case 4 -> operacionInversa();
            case 5 -> operacionDivision();
            default -> System.out.println("Opción invalida");
    }

    void menu() {
            do {
                mostrarMenu();
            } while (true);
        }
    }

    int[][] crearMatriz(int filas, int columnas) {
           int[][] matriz = new int [filas][columnas];
    return matriz;
    }

    boolean validarDimensiones(int filas, int columnas) {
        if (filas <= 0 && columnas <= 0) {
            return true;
        } else {
            return false;
        }
    }
    int[][] llenarMatriz(int matriz[][]) {

    }
}