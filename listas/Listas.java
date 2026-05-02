import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> lista = generarLista();
        System.out.println("Lista: " + lista);

        System.out.println("Suma: " + suma(lista));
        System.out.println("Mayor: " + mayor(lista));

        buscar(lista, 10);

        eliminar(lista, 10);

        ordenar(lista);
        System.out.println("Ordenada: " + lista);

        System.out.println("Pares: " + contarPares(lista));
    }

    // Generar lista
    public static ArrayList<Integer> generarLista() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 50; i++) {
            lista.add(r.nextInt(50) + 1);
        }
        return lista;
    }

    public static int suma(ArrayList<Integer> lista) {
        int suma = 0;
        for (int n : lista) suma += n;
        return suma;
    }

    public static int mayor(ArrayList<Integer> lista) {
        int mayor = lista.get(0);
        for (int n : lista) {
            if (n > mayor) mayor = n;
        }
        return mayor;
    }

    public static void buscar(ArrayList<Integer> lista, int num) {
        if (lista.contains(num)) {
            System.out.println("El " + num + " sí está");
        } else {
            System.out.println("El " + num + " no está");
        }
    }

    public static void eliminar(ArrayList<Integer> lista, int num) {
        lista.remove(Integer.valueOf(num));
    }

    // Ordenamiento burbuja
    public static void ordenar(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size() - 1; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }

    public static int contarPares(ArrayList<Integer> lista) {
        int cont = 0;
        for (int n : lista) {
            if (n % 2 == 0) cont++;
        }
        return cont;
    }
}
