import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");

        System.out.println("Lista actual: " + lista);

        try {
            System.out.print("Ingresa el índice del elemento que quieres ver: ");
            int indice = scanner.nextInt();

            System.out.println("Elemento en el índice " + indice + ": " + lista.get(indice));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango. La lista tiene " + lista.size() + " elementos.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Operación finalizada.");
        }
    }
}
