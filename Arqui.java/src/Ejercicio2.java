
import java.util.Scanner;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingresa un número: ");
            double numero = scanner.nextDouble();
            
            if (numero < 0) {
                throw new NumeroNegativoException("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            }
            
            double resultado = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + resultado);
            
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Operación finalizada.");
        }
    }
}

