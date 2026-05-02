import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = llenarMatriz(sc);
        mostrarMatriz(matriz);

        System.out.println("Suma total: " + sumaTotal(matriz));

        int[] mm = mayorMenor(matriz);
        System.out.println("Mayor: " + mm[0] + " | Menor: " + mm[1]);

        sumaFilas(matriz);
        sumaColumnas(matriz);

        buscarNumero(matriz, sc);

        mostrarDiagonales(matriz);

        mostrarTranspuesta(matriz);
    }

    // Llenar matriz
    public static int[][] llenarMatriz(Scanner sc) {
        int[][] m = new int[3][3];
        System.out.println("Ingrese valores:");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Pos [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    // Mostrar matriz
    public static void mostrarMatriz(int[][] m) {
        System.out.println("\nMatriz:");
        for (int[] fila : m) {
            for (int num : fila) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    // Suma total
    public static int sumaTotal(int[][] m) {
        int suma = 0;
        for (int[] fila : m) {
            for (int num : fila) {
                suma += num;
            }
        }
        return suma;
    }

    // Mayor y menor
    public static int[] mayorMenor(int[][] m) {
        int mayor = m[0][0];
        int menor = m[0][0];

        for (int[] fila : m) {
            for (int num : fila) {
                if (num > mayor) mayor = num;
                if (num < menor) menor = num;
            }
        }
        return new int[]{mayor, menor};
    }

    // Suma filas
    public static void sumaFilas(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int suma = 0;
            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
            }
            System.out.println("Fila " + i + ": " + suma);
        }
    }

    // Suma columnas
    public static void sumaColumnas(int[][] m) {
        for (int j = 0; j < m[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < m.length; i++) {
                suma += m[i][j];
            }
            System.out.println("Columna " + j + ": " + suma);
        }
    }

    // Buscar número
    public static void buscarNumero(int[][] m, Scanner sc) {
        System.out.print("Número a buscar: ");
        int num = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == num) {
                    System.out.println("Encontrado en [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró el número");
        }
    }

    // Diagonales
    public static void mostrarDiagonales(int[][] m) {
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][i] + " ");
        }

        System.out.print("\nDiagonal secundaria: ");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][m.length - 1 - i] + " ");
        }
        System.out.println();
    }

    // Transpuesta
    public static void mostrarTranspuesta(int[][] m) {
        System.out.println("Transpuesta:");
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
